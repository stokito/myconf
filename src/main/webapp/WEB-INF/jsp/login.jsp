<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>

<body>
<p>Hello!</p>

<form name="f" action="<c:url value='/login' />" method="post">
    Login: <input type="text" name="username" value="">
    Pass: <input type="password" name="password" value="">
    <input name="submit" type="submit" value="Login">
</form>
</body>
</html>
