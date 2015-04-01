<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<body>
<p>Hello!</p>

<form:form method="POST" action="/addConf" modelAttribute="addConf">
    Name:  <form:input path="name" type="text" />
    Description:  <form:input path="description" type="text" />
    <input type="submit" name="submit" value="Add conference"/>
</form:form>
</body>

