<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/14/014
  Time: 上午 9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/fileUpload" method="post" enctype="multipart/form-data">
    <div class="form-group">
        <label>商品照片:</label>
        <input type="file" class="form-control" name="pictrueFile"/>
    </div>
    <div class="form-group">
        <input type="submit" class="form-control" value="文件上传">
    </div>
</form>
</body>
</html>
