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
        const apiResponse = await fetch(`${PRODUCTS_API_URL}/${productId}`)
        if (!apiResponse.ok) {
            alert(`Error fetching product with ${productId} from API`)
        }
        await apiResponse.json().then(
            product => {
                displayProduct(product)
            }
        )
    } catch (error) {
        alert("Error fetching product from API")
    }
}

// TODO 5: create a function displayProduct() that displays the product details with edit and delete buttons
function displayProduct(product) {
    const productContainer = document.getElementById("productDetailsContainer")
    productContainer.innerHTML = "" +
        "<div class=\"product-card\">\n" +
        "<img src=\"${product.image}\" alt=\"${product.title}\"></img>\n" +
        "<h2>${product.title}</h2>\n" +
        "<p><strong>Price:</strong> $ ${product.price.toFixed(2)}</p>\n" +
        "<p><strong>Description:</strong> ${product.description}</p>\n" +
        "<p><strong>Category:</strong> ${product.category}</p>\n" +
        "<p><strong>Rating:</strong> ${product.rating.rate} (Count: ${product.rating.count})</p>\n"+
        "<section class='product-card-buttons-container'>" +
        "<button class='product-card-button edit-product-button' onclick='editProductById(${product.id})' type='button'>✏️</button>"+
        "<button class=\"product-card-button delete-product-button\" onclick=\"deleteProductById(${product.id})\" type=\"button\">🗑️</button>"+
        "</section>"+
        "</div>"

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
