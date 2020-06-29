<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

hello from spring-mvc jsp

<form action="/springmvc/user/param2.action" method="post">
    用户名：<input type="text" name="username"><br>
    年龄：<input type="text" name="age"><br>
    生日：<input type="text" name="birthday"><br>
    省份：<input type="text" name="address.province"><br>
    城市：<input type="text" name="address.city"><br>
    <input type="submit" value="提交">
</form>

</body>
</html>
