<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<body>
<p>Hello!</p>

<c:forEach items="${sponsors}" var="sponsors">
    <c:out value="${sponsors.getName()}"/>
</c:forEach>

</body>

</html>