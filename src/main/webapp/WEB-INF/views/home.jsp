<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home page</title>
</head>
<body>
Hello ${user.email} - ${user.password}!
<div>
    <c:forEach var="size" items="${sizes}">
        <div>
            ${size.size} - ${size.costDependency}
        </div>
    </c:forEach>
</div>
</body>
</html>
