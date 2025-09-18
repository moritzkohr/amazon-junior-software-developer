const PRODUCTS_API_URL = "http://localhost:8080/api/v1/products"

// fetch id parameter's value from window url
const urlParams = new URLSearchParams(window.location.search)
const productId = urlParams.get("id")

window.onload = function () {
    fetchProductFromAPI(productId)

    document.getElementById("editProductForm").addEventListener("submit", function (event) {
        event.preventDefault()
        updateProduct(productId)
    })
}

async function fetchProductFromAPI(productId) {
    try {
        const apiResponse = await fetch(`${PRODUCTS_API_URL}/${productId}`)
        if (!apiResponse.ok) {
            alert(`Error fetching product with ${productId} from API`)
        }
        await apiResponse.json().then(product => {
            preFillFormData(product)
        })
    } catch (error) {
        alert("Error fetching product from API")
    }
}

// TODO 10: create a function preFillFormData() to fill product details in edit product form
function preFillFormData(product) {

}

async function updateProduct(productId) {
    // TODO 11: fetch the form values and store them in a product object named 'updatedProduct'

    // TODO 12: make a PUT request to the backend API and send the updatedProduct in the body as JSON
    try {

    } catch (error) {

    }
}

function loadProductDetailsPage() {
    window.location.href = `product.html?id=${productId}`
}