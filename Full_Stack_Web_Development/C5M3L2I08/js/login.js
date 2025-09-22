const LOGIN_API_URL = "http://localhost:8080/user/login";

async function login(event) {
    // TODO 5: Prevent the default form submission behavior inside the login() function


    // TODO 6: Retrieve the username and password entered by the user


    const role = username === "root" ? "ADMIN" : "USER";

    try {
        // TODO 7: Send a POST request to LOGIN_API_URL with the login credentials


        // TODO 8: If the response is successful, store the user ID and role in sessionStorage { userID, username, role } and redirect to index.html. 
        //         Show an error message if log in fails


    } catch (error) {

    }
}

function isLoggedIn() {
    return Boolean(sessionStorage.getItem("user"));
}

function isAdminLoggedIn() {
    const user = JSON.parse(sessionStorage.getItem("user") || "{}");
    return isLoggedIn() && user.role === "ADMIN";
}

function logout() {
    sessionStorage.removeItem("user");
    window.location.href = "login.html";
}

window.addEventListener("load", () => {
    const addProductButton = document.getElementById("add-product-button");
    if (addProductButton) {
        addProductButton.style.display = isAdminLoggedIn() ? "inline" : "none";
    }

    // Add event listener to the login form
    const loginForm = document.getElementById("loginForm");
    if (loginForm) {
        loginForm.addEventListener("submit", login);
    }

    // Add event listener for the logout button
    const logoutButton = document.getElementById("logout-button");
    if (logoutButton) {
        logoutButton.addEventListener("click", (event) => {
            event.preventDefault();
            logout();
        });
    }
});
