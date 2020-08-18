<%--
  Created by IntelliJ IDEA.
  User: xutian
  Date: 2020/8/18
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="../blog/save">
        id:<input type="text" name="id" >
        name:<input type="text" name="name">
        authorId:<input type="text" name="authorId">
        content:<textarea name="content"></textarea>
        <input type="submit" value="submit">
    </form>
</body>
</html>
