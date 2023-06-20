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
    <title>添加员工</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div clss="col-md-12">
            <h2>新增员工</h2>
        </div>
    </div>
    <div class="row">
        <form class="form-horizontal" action="${pageContext.request.contextPath}/employee/addEmployee">
            <div class="form-group">
                <label for="EmployeeName" class="col-sm-2 control-label">员工名称：</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="EmployeeName" name="EmployeeName">
                </div>
            </div>
            <div class="form-group">
                <label for="EmployeeSex" class="col-sm-2 control-label">员工性别：</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="EmployeeSex" name="EmployeeSex">
                </div>
            </div>
            <div class="form-group">
                <label for="EmployeeDepartment" class="col-sm-2 control-label">员工部门：</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="EmployeeDepartment" name="EmployeeDepartment">
                </div>
            </div>
            <div class="form-group">
                <label for="EmployeeDutyType" class="col-sm-2 control-label">员工职务：</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="EmployeeDutyType" name="EmployeeDutyType">
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
