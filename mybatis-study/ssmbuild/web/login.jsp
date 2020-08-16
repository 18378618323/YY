<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
    <script src="static/js/jquery-1.4.2.js"></script>

    <script>
            function checkName() {
                <%--$.post("${pageContext.request.contextPath}/user",function (data) {--%>
                <%--    --%>
                <%--})--%>
                $.post({
                    url:"${pageContext.request.contextPath}/user",
                    data:{"name":$("#name").val()},
                    success:function (data) {
                        console.log(data);
                        if(data.toString()==='ok'){
                            $("#userInfo").css("color","green").html(data);
                        }else{
                            $("#userInfo").css("color","red").html(data);
                        }
                    }
                })
            }
            function checkPwd() {
                $.post({
                    url:"${pageContext.request.contextPath}/user",
                    data:{"pwd":$("#pwd").val()},
                    success:function (data) {
                        console.log(data);
                        if(data.toString()==='ok'){
                            $("#pwdInfo").css("color","green").html(data);
                        }else{
                            $("#pwdInfo").css("color","red").html(data);
                        }
                    }
                })
            }

    </script>

</head>
<body>
    <p>
        用户名:<input type="text" id="name" onblur="checkName()">
        <span id="userInfo"></span>
    </p>

    <p>
        密码:<input type="password" id="pwd" onblur="checkPwd()">
        <span id="pwdInfo"></span>
    </p>
</body>
</html>
