<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!-- TODO 11: create the basic HTML structure by declaring the document type and opening html and head tags -->
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- TODO 12: set the title of the page to "Product List" and close the head tag-->
    <title>Product List</title>
    <!-- TODO 17: add a link tag to include the product-styles.css file -->
    <link rel="stylesheet" href="/css/product-styles.css">

</head>
<!-- TODO 13: add the body tag and a heading tag with the text "Available Products" -->
<body>
<!-- Add heading here -->
<h1>Available Products</h1>
<!-- TODO 14: add a table with headers for ID, Name, Description, and Price. Set the table’s border attribute to 1 -->
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Description</th>
        <th>Price</th>
    </tr>
    </thead>
    <!-- TODO 15: inside a tbody tag and use the JSTL forEach tag to iterate over the “products” list passed by the controller -->
    <tbody>
        <c:forEach var="product" items="${products}">
            <!-- TODO 16: add a tr tag with td tags for the product’s ID, name, description, and price -->
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.description}</td>
                <td>${product.price}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
