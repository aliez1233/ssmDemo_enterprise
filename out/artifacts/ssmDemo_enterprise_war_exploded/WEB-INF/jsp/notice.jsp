<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
          integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu"
          crossorigin="anonymous">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <meta charset="UTF-8">
    <title>公告信息</title>
</head>
<body>
<table border=1>
    <tr>
        <td>公告编号</td>
        <td>公告标题</td>
        <td>公告内容</td>
        <td>发布时间</td>
    </tr>
    <tr>
        <td>${notice.noticeId}</td>
        <td>${notice.title}</td>
        <td>${notice.detail}</td>
        <td>${notice.noticeDate}</td>
    </tr>
</table>
</body>
</html>
