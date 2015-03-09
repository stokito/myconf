<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<body>
<p>Hello!</p>

<c:forEach items="${conferences}" var="conference">
<c:out value="${conference.getName()}"/>
</c:forEach>

</body>

</html>