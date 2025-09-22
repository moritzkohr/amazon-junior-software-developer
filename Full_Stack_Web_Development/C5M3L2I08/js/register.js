const REGISTER_API_URL = "http://localhost:8080/user/register";

async function registerUser(event) {
    // Use event.preventDefault() to prevent the default action from being executed

    // TODO 1: Inside the registerUser() function, retrieve the form values: username, password, and confirmPassword

    // TODO 2: Add form validation to ensure that password and confirmPassword match. If they don’t, display an alert: Passwords do not match

    try {
        // TODO 3: If passwords match, create a POST request to REGISTER_API_URL to send the user data { username, password, role: "USER" }

        // TODO 4: If registration is successful, display a success alert and redirect the user to the login.html page

    } catch (error) {

    }
}