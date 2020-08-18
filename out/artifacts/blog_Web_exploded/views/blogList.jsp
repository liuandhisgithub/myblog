<%--
  Created by IntelliJ IDEA.
  User: xutian
  Date: 2020/8/18
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td>id</td>
            <td>name</td>
            <td>authorId</td>
            <td>createTime</td>
            <td>content</td>
        </tr>
        <c:forEach var="blog" items="${requestScope.blogList}">
                <tr>
                    <td>${blog.id}</td>
                    <td>${blog.name}</td>
                    <td>${blog.authorId}</td>
                    <td>${blog.createTime}</td>
                    <td>${blog.content}</td>
                </tr>
        </c:forEach>
    </table>
</body>
</html>
