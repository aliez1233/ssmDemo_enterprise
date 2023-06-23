<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Bootstrap核心CSS文件 -->
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
          integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu"
          crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>添加公告</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div clss="col-md-12">
            <h2>新增公告</h2>
        </div>
    </div>
    <div class="row">
        <form class="form-horizontal" action="${pageContext.request.contextPath}/notice/addNotice">

            <div class="form-group">
                <label for="title" class="col-sm-2 control-label">公告标题：</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="title" name="title">
                </div>
            </div>

            <div class="form-group">
                <label for="detail" class="col-sm-2 control-label">公告内容：</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="detail" name="detail">
                </div>
            </div>

            <div class="form-group">
                <label for="noticeDate" class="col-sm-2 control-label">发布时间：</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="noticeDate" name="noticeDate">
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">添加</button>
                </div>
            </div>

        </form>
    </div>
</div>
</body>
</html>
