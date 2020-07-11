<%--
  Created by IntelliJ IDEA.
  User: 17102
  Date: 2020/7/9
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/uploadFile" method="post" enctype="multipart/form-data">
        <input type="file" name="file"><br>
        <input type="submit" value="上传">
    </form>
</body>
</html>
