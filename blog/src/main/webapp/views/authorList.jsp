<%--
  Created by IntelliJ IDEA.
  User: xutian
  Date: 2020/8/26
  Time: 15:12
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
        <c:forEach var="blog" items="${requestScope.blogList}">
            <tr>
                <td><a href="../blog/find/one?id=${blog.id}">${blog.id}</a></td>
                <td>${blog.name}</td>
                <td>${blog.authorId}</td>
                <td>${blog.createTime}</td>
                <td>${blog.content}</td>
                <td><a href="../blog/delete/one/?id=${blog.id}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
