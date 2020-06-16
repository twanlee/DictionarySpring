<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/16/2020
  Time: 4:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Search</title>
</head>
<body>
<fieldset>
    <legend>Dictionary</legend>
    <form  method="post" action="/search">
    <input value="Enter your word" type="text" name="word"><br>
    <input type="submit">
    </form>
    <p>Result</p>
    <input type="text" value="${result}">
</fieldset>
</body>
</html>
