<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<body>
<form action="/save" method="post">
    <label>ID</label><br>
    <input type="number" name="id" value="${student.getId()}" readonly> <br>
    <label> First Name</label><br>
    <input type="text" name="fname" placeholder="${student.getFname()}"><br>
    <label>Last Name</label><br>
    <input type="text" name="lname" placeholder="${student.getLname()}"><br>
    <label>Age</label><br>
    <input type="number" name="age" placeholder="${student.getAge()}"><br>
    <input type="submit" value="Save"><br>
</form>
</body>
</html>