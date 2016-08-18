<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/3
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Index Page</title>
  </head>
  <body>
  <h3>用户登录</h3>
  <form action="/user/login" method="post">
    用户名：<input type="text" name="username" placeholder="用户名"><br>
    密码：<input type="password" name="password" placeholder="密码"><br>
    <input type="submit" value="登录">
  </form>
  <hr>
  ${sessionScope.message}
  ${sessionScope.user}
  </body>
</html>
