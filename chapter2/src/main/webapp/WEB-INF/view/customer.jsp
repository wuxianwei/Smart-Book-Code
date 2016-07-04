<%--
  Created by IntelliJ IDEA.
  User: miraclewong
  Date: 16/6/29
  Time: 下午5:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="BASE" value="${pageContext.request.contextPath}"></c:set>


<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.js"></script>
    <script type="text/javascript" src="js/common.js"></script>
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <link href="css/bootstrap-theme.css" rel="stylesheet" type="text/css">
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <title>客户管理</title>
</head>
<body>
<div class="wrapper">
    <div class="navbar">
        <div class="navbar-inner">
            <div class="pull-right">
                <div class="input-group search-input-group">
                    <input class="search-box" type="text" placeholder="email or rushId or groupId ..."
                           class="form-control" aria-label="..." style="height:36px">

                    <div class="input-group-btn">
                        <button type="button" class="btn btn-default dropdown-toggle" style="height:36px"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">搜索
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu dropdown-menu-right">
                            <li><a href="javascript:void(0);" onclick="searchUser()">搜索用户</a></li>
                            <li><a href="javascript:void(0);" onclick="searchGroup()">搜索群组</a></li>
                        </ul>
                    </div>
                </div>
            </div>

            <ul class="nav nav-top pull-right">
                <li><a href="mailIndex">邮件</a></li>
                <li><a href="#">聊天</a></li>
                <li><a href="otherIndex">其他</a></li>
            </ul>
        </div>
    </div>
    <h1>客户列表</h1>

    <div class="panel panel-primary">
        <!-- Default panel contents -->
        <div class="panel-heading">客户列表</div>

        <!-- Table -->
        <table class="table">
            <tr>
                <th>客户名称</th>
                <th>联系人</th>
                <th>电话号码</th>
                <th>邮箱管理</th>
                <th>操作</th>
            </tr>
            <c:forEach var="customer" items="${customerList}">
                <tr>
                    <td>${customer.name}</td>
                    <td>${customer.contact}</td>
                    <td>${customer.telephone}</td>
                    <td>${customer.email}</td>
                    <td>
                        <a href="${BASE}/customer_edit?id=${customer.id}">编辑</a>
                        <a href="${BASE}/customer_delete?id=${customer.id}">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
