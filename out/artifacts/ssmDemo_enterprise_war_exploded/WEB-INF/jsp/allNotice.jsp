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
    <title>公告列表</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <h1>公告列表 —— 显示所有公告</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/notice/toAddNotice" role="button">新增</a>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="col-md-12">
                <table class="table table-hover">
                    <thead>
                    <tr>
                        <td>公告编号</td>
                        <td>公告标题</td>
                        <td>公告内容</td>
                        <td>发布时间</td>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${pageInfo.list}" var="notice">
                        <tr>
                            <td>${notice.noticeId}</td>
                            <td>${notice.title}</td>
                            <td>${notice.detail}</td>
                            <td>${notice.noticeDate}</td>
                            <td><a href="${pageContext.request.contextPath}/notice/toUpdateNotice?id=${notice.getNoticeId()}">更改</a>|
                                <a href="${pageContext.request.contextPath}/notice/delete/${notice.getNoticeId()}">删除</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>

            </div>
        </div>
        <div class="row">
            <div class="col-md-6">当前${pageInfo.pageNum}页总${pageInfo.pages}页，共${pageInfo.total}条记录</div>
        </div>
        <div class="col-md-6">
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <li>
                        <a href="${pageContext.request.contextPath}/notice/allNotice?pn=1">首页</a>
                    </li>
                    <li><c:if test="${pageInfo.hasPreviousPage}">
                        <a href="${pageContext.request.contextPath}/notice/allNotice?pn=${pageInfo.pageNum-1}"
                           aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
                        </a>
                    </c:if>
                    </li>
                    <c:forEach items="${pageInfo.navigatepageNums}" var="pNum">
                        <c:if test="${pNum == pageInfo.pageNum}">
                            <li class="active"><a href="#">${pNum}</a></li>
                        </c:if>
                        <c:if test="${pNum != pageInfo.pageNum}">
                            <li><a
                                    href="${pageContext.request.contextPath}/notice/allNotice?pn=${pNum}">${pNum}</a>
                            </li>
                        </c:if>
                    </c:forEach>
                    <c:if test="${pageInfo.hasNextPage}">
                        <li><a
                                href="${pageContext.request.contextPath}/notice/allNotice?pn=${pageInfo.pageNum+1}"
                                aria-label="Next"> <span aria-hidden="true">&raquo;</span>
                        </a></li>
                    </c:if>
                    <li>
                    <a href="${pageContext.request.contextPath}/notice/allNotice?pn="${pageInfo.pages}>末页</a>
                </li>
                </ul>
            </nav>
        </div>
    </div>
</div>
</body>
</html>
