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
    <title>修改信息</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div clss="col-md-12">
            <h2>修改信息</h2>
        </div>
    </div>
    <div class="row">
        <form class="form-horizontal" action="${pageContext.request.contextPath}/file/updateFile">
            <input type="hidden" name="fileId" value="${file.getFileId()}"/>
            <div class="form-group">
                <label for="fileTitle" class="col-sm-2 control-label">文件标题：</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="fileTitle" name="fileTitle" value="${file.getFileTitle()}">
                </div>
            </div>
            <div class="form-group">
                <label for="fromUserName" class="col-sm-2 control-label">发件人：</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="fromUserName" name="fromUserName" value="${file.getFromUserName()}">
                </div>
            </div>
            <div class="form-group">
                <label for="toUserName" class="col-sm-2 control-label">收件人：</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="toUserName" name=toUserName" value="${file.getToUserName()}">
                </div>
            </div>
            <div class="form-group">
                <label for="fileStatus" class="col-sm-2 control-label">文件状态：</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="fileStatus" name="fileStatus" value="${file.getFileStatus()}">
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