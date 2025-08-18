import React, { useState, useEffect } from "react";
import "../css/rtgs.css";
import { useNavigate } from "react-router-dom";

function RTGSTransferForm() {
  const navigator = useNavigate();
  const [msg, setMsg] = useState(null);
  const [errors, setErrors] = useState({});
  const [touched, setTouched] = useState({});
  const [isFormValid, setIsFormValid] = useState(false);

  const [formData, setFormData] = useState({
    senderAccountId: 'A001',
    accountNumber: "",
    cnfaccountNumber: "",
    ifscCode: "",           // <<-- changed key to lowercase
    beneficiaryName: "",
    amount: "",
    note: ""
  });

  function handleChange(e) {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value
    });
  }

  function handleBlur(e) {
    setTouched({
      ...touched,
      [e.target.name]: true
    });
  }

  const validateForm = () => {
    let newErrors = {};

    // Account number validation
    if (!formData.accountNumber) {
      newErrors.accountNumber = "Account number is required.";
    } else if (!/^\d{6,18}$/.test(formData.accountNumber)) {
      newErrors.accountNumber = "Enter a valid account number (6-18 digits).";
    }

    // Confirm account number
    if (formData.cnfaccountNumber !== formData.accountNumber) {
      newErrors.cnfaccountNumber = "Account numbers do not match.";
    }

    // IFSC code validation (field is now ifscCode)
    if (!formData.ifscCode) {
      newErrors.ifscCode = "IFSC Code is required.";
    } else if (!/^(IFSC)\d{3}$/i.test(formData.ifscCode)) {
  newErrors.ifscCode = "Enter a valid IFSC Code (e.g., IFSCXXX).";
}

    // Beneficiary name
    if (!formData.beneficiaryName || !formData.beneficiaryName.trim()) {
      newErrors.beneficiaryName = "Beneficiary name is required.";
    }

    // Amount validation
    if (!formData.amount) {
      newErrors.amount = "Amount is required.";
    } else if (isNaN(formData.amount) || parseFloat(formData.amount) <= 0) {
      newErrors.amount = "Enter a valid amount greater than 0.";
    }

    setErrors(newErrors);
    setIsFormValid(Object.keys(newErrors).length === 0);
  };

  // Validate whenever form data changes
  useEffect(() => {
    validateForm();
  }, [formData]);

  const handleSubmit = async (e) => {
    e.preventDefault();
    if (!isFormValid) return;

    try {
      // normalize IFSC to uppercase for backend
      const payload = {
        ...formData,
        ifscCode: formData.ifscCode ? formData.ifscCode.trim().toUpperCase() : formData.ifscCode
      };

      console.log("Sending JSON:", JSON.stringify(payload)); // confirm key is "ifscCode"

      const res = await fetch("http://localhost:8081/payment/type=rtgs", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(payload)
      });

      if (res.ok) {
        const message = await res.text();
        setMsg(message);
        navigator("/payment/processing");
      } else {
        const text = await res.text();
        setMsg("Server error: " + text);
      }
    } catch (error) {
      console.error("Error:", error);
      setMsg("An error occurred while submitting.");
    }
  };

  return (
    <div className="rtgs-hero">
      <div className="rtgs-container">
        <div className="rtgs-header">
          <h2>RTGS Transfer</h2>
          <span className="balance">
            <span>Your Balance&nbsp;:&nbsp;&nbsp;</span>
            <span className="balance-amt">Rs 24,321,900</span>
          </span>
        </div>

        <form className="rtgs-form" onSubmit={handleSubmit}>
          <input
            type="text"
            name="accountNumber"
            onChange={handleChange}
            onBlur={handleBlur}
            placeholder="Account Number"
            className="form-field"
            value={formData.accountNumber}
          />
          {touched.accountNumber && errors.accountNumber && (
            <p className="error">{errors.accountNumber}</p>
          )}

          <input
            

            type="password"
            name="cnfaccountNumber"
            onChange={handleChange}
            onBlur={handleBlur}
            placeholder="Confirm Account Number"
            className="form-field"
            value={formData.cnfaccountNumber}
          />
          {touched.cnfaccountNumber && errors.cnfaccountNumber && (
            <p className="error">{errors.cnfaccountNumber}</p>
          )}

          <input
            type="text"
            name="ifscCode"   // <<-- changed here
            placeholder="IFSC Code"
            className="form-field"
            onChange={handleChange}
            onBlur={handleBlur}
            value={formData.ifscCode}
          />
          {touched.ifscCode && errors.ifscCode && (
            <p className="error">{errors.ifscCode}</p>
          )}

          <input
            type="text"
            name="beneficiaryName"
            placeholder="Beneficiary Name"
            className="form-field"
            onChange={handleChange}
            onBlur={handleBlur}
            value={formData.beneficiaryName}
          />
          {touched.beneficiaryName && errors.beneficiaryName && (
            <p className="error">{errors.beneficiaryName}</p>
          )}

          <div className="amount-label">Amount</div>
          <div className="amount-input">
            <span>Rs</span>
            <input
              type="number"
              name="amount"
              placeholder="0"
              onChange={handleChange}
              onBlur={handleBlur}
              value={formData.amount}
            />
          </div>
          {touched.amount && errors.amount && (
            <p className="error">{errors.amount}</p>
          )}

          <input
            type="text"
            name="note"
            placeholder="Note (Optional)"
            className="note-input"
            onChange={handleChange}
            onBlur={handleBlur}
            value={formData.note}
          />

          <button
            type="submit"
            disabled={!isFormValid}
            className={`submit-btn ${isFormValid ? "active" : "disabled"}`}
          >
            Proceed to Transfer
          </button>
        </form>

        {msg && <div className="message">{msg}</div>}
      </div>
    </div>
  );
}

export default RTGSTransferForm;
