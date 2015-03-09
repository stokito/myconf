<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<body>
<p>Hello!</p>

<c:forEach items="${talks}" var="talks">
    <c:out value="${talks.getName()}"/>
</c:forEach>

</body>

</html>