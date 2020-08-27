<%--
  Created by IntelliJ IDEA.
  User: xutian
  Date: 2020/8/27
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="../author/solr/search">
    <input type="text" name="all"/>
    <input type="submit" value="submit"><br/>
    <hr/>
    <table border="2px">
        <c:forEach var="author" items="${requestScope.authorList}">
            <tr>
                <td>${author.name}</td>
                <td>${author.phone}</td>
                <td>${author.email}</td>
                <td>${author.score}</td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
