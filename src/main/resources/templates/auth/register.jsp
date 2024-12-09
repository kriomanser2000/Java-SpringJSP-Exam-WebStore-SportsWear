<!doctype html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Register</title>
</head>
<body>
<h1>Register</h1>
<form th:action="@{/auth/register}" th:object="${user}" method="post">
    <label for="fullName">Full Name:</label>
    <input type="text" id="fullName" name="fullName" th:field="*{fullName}" required><br>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" th:field="*{email}" required><br>
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" th:field="*{username}" required><br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" th:field="*{password}" required><br>
    <label for="city">City:</label>
    <input type="text" id="city" name="city" th:field="*{city}"><br>
    <label for="country">Country:</label>
    <input type="text" id="country" name="country" th:field="*{country}"><br>
    <label for="phone">Phone:</label>
    <input type="text" id="phone" name="phone" th:field="*{phone}"><br>
    <button type="submit">Register</button>
</form>
<p th:if="${error}" th:text="${error}"></p>
</body>
</html>