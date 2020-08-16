<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/10/010
  Time: 下午 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加商品</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增商品</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/AddProduct" method="post">
        <input type="hidden" name="createtime" value="<%=new Date()%>" >
        <div class="form-group">
            <label>商品名称:</label>
            <input type="text" class="form-control" name="name" required>
        </div>
        <div class="form-group">
            <label>商品价格:</label>
            <input type="text" class="form-control" name="price" required>
        </div>
        <div class="form-group">
            <label>商品描述:</label>
            <input type="text" class="form-control" name="detail" required>
        </div>
        <div class="form-group">
            <label>商品图片:</label>
            <input type="text" class="form-control" name="pic" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="添加">
        </div>
    </form>


</div>

</body>
</html>
