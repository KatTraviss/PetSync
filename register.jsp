<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Register - PetSync</title>
    <link rel="stylesheet" href="CSS/styles.css" />
</head>
<body>
    <div class="container">
        <div class="banner">
            <h2>Create an Account</h2>
        </div>

        <!-- Show error message if passed from servlet -->
        <c:if test="${not empty errorMessage}">
            <div class="error-message">${errorMessage}</div>
        </c:if>

        <form action="register" method="post">
            <label for="fullName">Full Name:</label><br>
            <input type="text" id="fullName" name="fullName" required><br><br>

            <label for="email">Email:</label><br>
            <input type="email" id="email" name="email" required><br><br>

            <label for="password">Password:</label><br>
            <input type="password" id="password" name="password" required><br><br>

            <!-- Hide role selection: default to Volunteer -->
            <input type="hidden" name="role" value="Volunteer" />

            <div class="button-group">
                <input type="submit" value="Register" class="main-button">
                <button type="button" onclick="window.location.href='landing.html'" class="main-button">Home</button>
                <button type="button" onclick="window.location.href='login.jsp'" class="main-button">Login</button>
            </div>
        </form>
    </div>
</body>
</html>
