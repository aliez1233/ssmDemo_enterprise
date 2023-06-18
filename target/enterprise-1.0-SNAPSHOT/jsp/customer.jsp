<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>员工信息</title>
</head>
<body>
<table border=1>
    <tr>
        <td>编号</td>
        <td>名称</td>
        <td>密码</td>

    </tr>
    <tr>
        <td>${customer.userId}</td>
        <td>${customer.username}</td>
        <td>${customer.userPassword}</td>

    </tr>
</table>
</body>
</html>
