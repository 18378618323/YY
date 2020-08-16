<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajax</title>
    <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.ajax({

                    url:"${pageContext.request.contextPath}/btnAjax.action",
                    data:{"name":"iphoneX爆款手机","price":8000.9},
                    contentType:"application/json;charset=utf-8",
                    success:function (data) {
                        alert(data.name);
                        alert(data.price);
                    }
                })
            })
        })
    </script>
</head>
<body>
<button id="btn">点我发送ajax</button>
</body>
</html>
