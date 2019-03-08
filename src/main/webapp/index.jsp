<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>index.jsp</head>
<body>
<h2>Hello World!</h2>
    <% request.getRequestDispatcher("WEB-INF/pages/welcome.jsp").forward(request,response);%>
</body>
</html>
