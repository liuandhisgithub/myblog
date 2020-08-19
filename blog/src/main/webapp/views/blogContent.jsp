<%--
  Created by IntelliJ IDEA.
  User: xutian
  Date: 2020/8/19
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
name:${requestScope.blog.name} <br/>
content:${requestScope.blog.content}<br/>
<hr/>

    <c:forEach var="comment" items="${requestScope.commentList}">
        <ul>
            <li>${comment.authorId}</li>
            <li>${comment.content}</li>
        </ul>
    </c:forEach>

<hr/>

<form action="../../comment/submitComment" method="post">
    <input type="hidden" value="${requestScope.blog.id}" name="blogId">
    <input type="hidden" value="123" name="authorId">
    id:<input type="text" name="id">
    <textarea id="content"></textarea>
    <input type="submit" value="submit">
</form>
</body>
</html>
