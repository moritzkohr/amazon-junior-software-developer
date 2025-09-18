const PRODUCTS_API_URL = "http://localhost:8080/api/v1/products"

async function addProduct() {
    // TODO 6: fetch the form values from the #addProductForm in add.html and create a product object
    const product = {
        title: "",
        price: 0.0,
        description: "",
        category: "",
        image: "",
        rating: {
            rate: 0.0,
            count: 0
        }
    }

    // TODO 7: make a POST request to the backend API and send the product in the body as JSON
    try {
        await fetch(

        )

        window.location.href = "index.html"
    } catch (error) {

    }
}

// TODO 8: add an evenlistener on the submit button of the #addProductForm in add.html
window.onload = function () {

}

