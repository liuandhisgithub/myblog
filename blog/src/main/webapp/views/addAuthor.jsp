<%--
  Created by IntelliJ IDEA.
  User: xutian
  Date: 2020/8/26
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
    <form action="../author/save">
        id:<input type="text" name="id" >
        name:<input type="text" name="name">
        eMail:<input type="text" name="eMail">
        phone:<textarea name="phone"></textarea>
        <input type="submit" value="submit">
    </form>
</body>
</html>
