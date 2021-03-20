<%--
  Created by IntelliJ IDEA.
  User: 79178
  Date: 2021/3/18
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>java第一天</title>
</head>
<body>
<tbody>
<c:forEach var="student" items="${studentinfo}">
    <tr>
        <td>${student.id}</td>
        <td>${student.name}
        </td>
        <td>${student.age}</td>
        <td>${student.birth}</td>
        <td>${student.high}</td>
    </tr>
</c:forEach>

</tbody>



</body>
</html>
