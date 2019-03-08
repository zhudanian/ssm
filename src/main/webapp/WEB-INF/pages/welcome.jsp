<%--
  Created by IntelliJ IDEA.
  User: ZDN
  Date: 2019/3/6
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/WEB-INF/css/bootstrap.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/WEB-INF/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/WEB-INF/js/bootstrap.js"></script>
    <title>Welcome</title>
    <script type="text/css">
        login {
            margin-top: 50px;
            background-color: blanchedalmond;
            text-align: center;
        }
    </script>
</head>
<body>
<div class="container">
    <div class="container-fluid login">
        <form action="welcome/login" method="post">
            姓名：<input type="text" name="name">
            密码：<input type="password" name="password">
            <input type="submit" value="提交">
        </form>
    </div>
</div>
</body>
</html>
