const PRODUCTS_API_URL = "http://localhost:8080/api/v1/products";
const CART_API_URL = "http://localhost:8080/api/v1/cart";
let products = [];
let filteredProducts = []; // Add this to store filtered products

async function addToCart(productId) {
  // TODO 13: In the addToCart() function, retrieve the user’s userID from sessionStorage using JSON.parse(sessionStorage.getItem("user"))

  // TODO 14: Create an object to represent the cart item, including userId and productId


  // TODO 15: Send a POST request to CART_API_URL to add the item to the cart
  try {


    if (!response.ok) {
      const errorText = await response.text();
      throw new Error(`Failed to add item to cart: ${errorText}`);
    }

    alert("Product added to cart!");
  } catch (error) {
    // TODO 16: Display an error alert using ${error.message} and log it to console

  }
}

window.addEventListener("load", () => {
  if (!isLoggedIn()) {
    window.location.href = "login.html";
    return;
  }

  fetchProducts();

  // TODO 9: Add an event listener to the searchForm to handle form submissions. Prevent the default submission behavior
  document.getElementById("").addEventListener("", (event) => {


    // TODO 10: Retrieve the search query from the searchInput field, and convert it to lowercase for a case-insensitive search


    // TODO 11: Filter products to include only items where the title or category matches the query
    if (query) {

    } else {
      // If query is empty, show all products
      filteredProducts = products;
    }

    // TODO 12: Pass the filtered products list to renderProducts() to display the search results

  });
});

async function fetchProducts() {
  try {
    const response = await fetch(PRODUCTS_API_URL);
    if (!response.ok) throw new Error("Error fetching products from API");
    products = await response.json();
    filteredProducts = products; // Initialize filteredProducts with all products
    renderProducts(products);
  } catch (error) {
    alert(error.message);
  }
}

// Modify renderProducts to accept an argument (defaulting to products)
function renderProducts(productList = products) {
  const container = document.getElementById("productContainer");
  container.innerHTML = productList.map(product => `
      <div class="product-card">
        <a href="product.html?id=${product.id}">
          <img src="${product.image}" alt="${product.title}" />
          <p>${product.title}</p>
        </a>
        <p>$${product.price.toFixed(2)} | Rating: ${product.rating.rate}</p>
        <div class="product-card-buttons-container">
          <button onclick="addToCart(${product.id})" class="add-to-cart-button">🛒</button>
        </div>
      </div>
    `).join('');
}
