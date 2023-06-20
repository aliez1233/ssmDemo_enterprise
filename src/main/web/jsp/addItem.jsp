<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2023/6/19
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet"
        href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
        integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu"
        crossorigin="anonymous">
  <meta charset="UTF-8">
  <title>添加项目</title>
</head>
<body>
<div class="container">
  <div class="row">
    <div clss="col-md-12">
      <h2>新增项目</h2>
    </div>
  </div>
  <div class="row">
    <form class="form-horizontal" action="${pageContext.request.contextPath}/item/addItem">
      <div class="form-group">
        <label for="UserName" class="col-sm-2 control-label">员工名称：</label>
        <div class="col-sm-4">
          <input type="text" class="form-control" id="UserName" name="UserName">
        </div>
      </div>
      <div class="form-group">
        <label for="ItemTitle" class="col-sm-2 control-label">项目标签：</label>
        <div class="col-sm-4">
          <input type="text" class="form-control" id="ItemTitle" name="ItemTitle">
        </div>
      </div>
      <div class="form-group">
        <label for="ItemDate" class="col-sm-2 control-label">项目时间：</label>
        <div class="col-sm-4">
          <input type="text" class="form-control" id="ItemDate" name="ItemDate">
        </div>
      </div>
      <div class="form-group">
        <label for="ItemContent" class="col-sm-2 control-label">项目内容：</label>
        <div class="col-sm-4">
          <input type="text" class="form-control" id="ItemContent" name="ItemContent">
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
</div>
</body>
</html>
