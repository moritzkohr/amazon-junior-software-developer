function initPage() {
    console.log("Page loaded!");
}

function showProductImage() {
    const productImageSection = document.getElementById("productImageSection");
    const productImage = document.getElementById("productImage");
    const productCategory = document.getElementById("productCategory").value;
    if (productCategory === "phone") {
        productImage.src = "https://via.placeholder.com/300x200?text=Phone";
    } else if (productCategory === "laptop") {
        productImage.src = "https://via.placeholder.com/300x200?text=Laptop";
    } else if (productCategory === "camera") {
        productImage.src = "https://via.placeholder.com/300x200?text=Camera";
    } else if (productCategory === "headphones") {
        productImage.src = "https://via.placeholder.com/300x200?text=Headphones";
    } else if (productCategory === "watch") {
        productImage.src = "https://via.placeholder.com/300x200?text=Smart+Watch";
    }

    productImageSection.style.display = "block";
}

function submitForm() {
    let isValid = true;

    /* TODO 1: Get the productName, productCategory, productID, serialNumber,
       warranty, price, vendor, email and phoneNumber using getElementById() */
    const productName = document.getElementById("productName").value;
    const productCategory = document.getElementById("productCategory").value;
    const productID = document.getElementById("productID").value;
    const serialNumber = document.getElementById("serialNumber").value;
    const warranty = document.getElementById("warranty").value;
    const price = document.getElementById("price").value;
    const vendor = document.getElementById("vendor").value;
    const email = document.getElementById("email").value;
    const phoneNumber = document.getElementById("phoneNumber").value;
    const purchaseDate = document.getElementById("purchaseDate").value;


    clearErrors();

    // Product Name validation (non-empty)
    if (!productName) {
        displayError("productNameError", "Product name is required.");
        isValid = false;
    }

    // Product Category validation (non-empty)
    // TODO 2: Put validation for productCategory with error message "Please select a product category."
    if (!productCategory) {
        displayError("productCategoryError", "Please select a product category.");
        isValid = false;
    }


    // Product ID validation (non-empty)
    // TODO 3: Put validation for productID with error message "Product ID is required."
    if (!productID) {
        displayError("productIDError", "Product ID is required.");
        isValid = false;
    }


    // Purchase Date validation (non-empty)
    // TODO 4: Put validation for purchaseDate with error message "Purchase date is required."
    if (!purchaseDate) {
        displayError("purchaseDateError", "Purchase date is required.");
        isValid = false;
    }


    // Warranty validation (1-5 years)
    // TODO 5: Put validation for warranty between 1-5 yrs with error message "Warranty must be between 1 and 5 years."
    if (warranty < 1 || warranty > 5) {
        displayError("warrantyError", "Warranty must be between 1 and 5 years.");
        isValid = false;
    }


    // Price validation (positive number)
    // TODO 6: Put validation for price less than or equal to 0 with error message "Price must be a positive number."
    if (price <= 0) {
        displayError("priceError", "Price must be a positive number.");
        isValid = false;
    }


    // Vendor validation (non-empty)
    // TODO 7: Put validation for vendor with error message "Vendor name is required."
    if (!vendor) {
        displayError("vendorError", "Vendor name is required.");
        isValid = false;
    }


    // Email validation (valid email format)
    // TODO 8: Put validation for email for valid email checking if "@" is present in the email, with error message "Please enter a valid email."
    if (!email.includes("@")) {
        displayError("emailError", "Please enter a valid email.");
        isValid = false;
    }

    // Phone Number validation (numeric, 10 digits)
    // TODO 9: Put validation for 10 digit phoneNumber with error message "Phone name is required and should be of 10 digits."
    if (phoneNumber.length !== 10) {
        displayError("phoneNumberError", "Phone name is required and should be of 10 digits.");
        isValid = false;
    }

    if(serialNumber.length !== 10){
        displayError("serialNumberError", "Serial number is required and should be of 10 digits.");
        isValid = false;
    }


    if (isValid) {
        document.getElementById("productForm").style.display = "none";
        document.getElementById("thanksMessage").style.display = "block";
    }
}

function clearErrors() {
    const errors = document.querySelectorAll(".error-message");
    errors.forEach(error => error.innerHTML = "");
}

function displayError(elementId, message) {
    document.getElementById(elementId).innerHTML = message;
}
