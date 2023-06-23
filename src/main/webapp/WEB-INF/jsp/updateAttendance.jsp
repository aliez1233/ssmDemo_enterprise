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
    <title>修改考勤信息</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div clss="col-md-12">
            <h2>修改考勤信息</h2>
        </div>
    </div>
    <div class="row">
        <form class="form-horizontal" action="${pageContext.request.contextPath}/attendance/updateAttendance">
            <input type="hidden" name="attendanceId" value="${attendance.getAttendanceId()}"/>

            <div class="form-group">
                <label for="employeeId" class="col-sm-2 control-label">员工编号：</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="employeeId" name="employeeId" value="${attendance.getEmployeeId()}">
                </div>
            </div>
            <div class="form-group">
                <label for="employeeName" class="col-sm-2 control-label">员工姓名：</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="employeeName" name="employeeName" value="${attendance.getEmployeeName()}">
                </div>
            </div>
            <div class="form-group">
                <label for="appearTimes" class="col-sm-2 control-label">出勤天数：</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="appearTimes" name="appearTimes" value="${attendance.getAppearTimes()}">
                </div>
            </div>
            <div class="form-group">
                <label for="leaveTimes" class="col-sm-2 control-label">请假天数：</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="leaveTimes" name="leaveTimes" value="${attendance.getLeaveTimes()}">
                </div>
            </div>
            <div class="form-group">
                <label for="lateEarlyLeave" class="col-sm-2 control-label">迟到或早退：</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="lateEarlyLeave" name="lateEarlyLeave" value="${attendance.getLateEarlyLeave()}">
                </div>
            </div>
            <div class="form-group">
                <label for="absentWork" class="col-sm-2 control-label">旷工天数：</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="absentWork" name="absentWork" value="${attendance.getAbsentWork()}">
                </div>
            </div>
            <div class="form-group">
                <label for="overtime" class="col-sm-2 control-label">加班天数：</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="overtime" name="overtime" value="${attendance.getOvertime()}">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">提交 </button>
                </div>
            </div>
        </form>
    </div>

</div>
</div>
</body>
</html>