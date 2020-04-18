<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Students' Database</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Age</th>
    </tr>
    <c:forEach var="s" items="${students}">
        <tr>
            <td>${s.getId()}</td>
            <td>${s.getFname()}</td>
            <td>${s.getLname()}</td>
            <td>${s.getAge()}</td>
        </tr>
    </c:forEach>
</table>
<a href="/">
    <img src="https://image.flaticon.com/icons/svg/25/25694.svg" alt="Home" style="width:42px;height:42px;border:0">
</a>
</body>
</html>