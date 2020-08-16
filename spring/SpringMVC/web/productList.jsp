<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<html>
<head>
    <title>使用layUI+PageHelper分页插件</title>
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
</head>
<body>
<table id="demo" lay-filter="test"></table>

<script src="layui/layui.js"></script>
<script>
    layui.use('table', function(){
        var table = layui.table;

        //第一个实例
        table.render({
            elem: '#demo'
            ,height: 312
               ,url:'${pageContext.request.contextPath}/productList'
               ,page:true
               ,cols:[[
                    {field:'id', width:100, title: '商品编号', sort: true}
                    ,{field:'name', width:130, title: '商品名称'}
                    ,{field:'price', width:100, title: '价格', sort: true}
                    ,{field:'detail', width:100, title: '描述'}
                    ,{field:'pic', title: '图片', width: 150}
                    ,{field:'createtime', width:150, title: '上架日期', sort: true}
                ]]
            });
        });
    </script>
</body>
</html>
