<%--
  Created by IntelliJ IDEA.
  User: longdk
  Date: 12/5/18
  Time: 11:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Form</title>
</head>
<body>
<h2>Currency Form</h2>
<form action="/convert" method="post">

    <table border="1">
        <tr>
            <td>USD:</td>
            <td><input type="text" name="usd"></td>
        </tr>
        <tr>
            <td>rate:</td>
            <td><input type="text" name="rate"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Convert"></td>
        </tr>
    </table>
</form>
<h3>${res}</h3>
</body>
</html>
