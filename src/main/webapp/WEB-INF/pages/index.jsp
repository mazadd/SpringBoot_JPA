<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h2>Forum</h2>

<c:if test="${not empty list}">

    <ul>
        <c:forEach var="listValue" items="${list}">
            <li>${listValue.id}</li>
        </c:forEach>
    </ul>

</c:if>
</body>
</html>