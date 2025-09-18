const PRODUCTS_API_URL = "http://localhost:8080/api/v1/products"

window.onload = function () {
    // fetch id parameter's value from window url
    const urlParams = new URLSearchParams(window.location.search)
    const productId = urlParams.get("id")

    fetchProductFromAPI(productId)
}

// TODO 4: create an async function fetchProductFromAPI() that fetches a single product by ID from the backend API
async function fetchProductFromAPI(productId) {
    try {

        await apiResponse.json().then(

        )
    } catch (error) {

    }
}

// TODO 5: create a function displayProduct() that displays the product details with edit and delete buttons
function displayProduct(product) {
    const productContainer = document.getElementById("productDetailsContainer")
    productContainer.innerHTML = ""

    const productElement = document.createElement("div")
    productElement.classList.add("product-card")

    productContainer.appendChild(productElement)
}

// TODO: create a function editProduct() to open the edit.html page with a product id as URL parameter 'id'
function editProductById(productId) {
    window.location.href = `edit.html?id=${productId}`
}

// TODO 13: create an async function deleteProductById() that makes a DELETE request to the backend with product ID
async function deleteProductById(productId) {
    const deletionConfirmation = confirm(`Are you sure you want to delete product with ${productId}?`)

    if (!deletionConfirmation) {
        return
    }

    try {

        window.location.href = "index.html"
    } catch (error) {

    }
}
