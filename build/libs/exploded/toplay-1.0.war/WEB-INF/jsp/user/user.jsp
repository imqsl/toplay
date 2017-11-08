<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>组队网</title>
    <script src="../../../js/jquery1.12.4.min.js"></script>
    <script src="../../../js/bootstrap.min.js"></script>
    <script src="../../../js/showDialog.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap3-dialog/1.34.9/js/bootstrap-dialog.min.js"></script>

    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap3-dialog/1.34.9/css/bootstrap-dialog.min.css"
          rel="stylesheet" type="text/css"/>
    <link href="../../../css/bootstrap.min.css" rel="stylesheet">

    <script>
        $(function () {
            var boxs = $("input[type='checkbox'][id^='box_']");
            $("#checkAll").click(function () {
                boxs.attr("checked", this.checked);
            });
            $("#delete").click(function () {
                var checkedBoxs = boxs.filter(":checked");
                if (checkedBoxs.length < 1) {
                    $.showErr("请选择一个需要删除的用户！");
                } else {
                    /** 得到用户选中的所有的需要删除的ids */
                    var ids = checkedBoxs.map(function () {
                        return this.value;
                    });
                    $.showConfirm("确定删除用户吗？", function () {
                        window.location = "deleteUser?ids=" + ids.get();
                    })
                }
            })
            if (1 ==${requestScope.pageNum}) {
                $("#previous").addClass("disabled");
            }
            if (${requestScope.count}==${requestScope.pageNum}) {
                $("#next").addClass("disabled");
            }
            $("#curr${requestScope.pageNum}").addClass("active");
        })
    </script>
</head>
<body style="margin: 10px;">
<table width="100%">
    <tr>
        <td width="15" height="32"><img src="../../../images/main_locleft.gif" width="15" height="32"></td>
        <td><img src="../../../images/pointer.gif">&nbsp;&nbsp;&nbsp;当前位置：用户管理 &gt; 用户查询</td>
        <td width="15" height="32"><img src="../../../images/main_locright.gif" width="15" height="32"></td>
    </tr>
</table>
<table width="100%" height="90%">
    <tr>
        <td>
            <table class="table table-bordered">
                <form action="/user/selectUser?pageNum=1" method="post">
                    <tr>
                        <td>
                            用户名：<input type="text" name="username">
                            学号：<input type="text" name="stuId">
                            <input type="submit" class="btn btn-default" value="搜索">
                            <input type="button" class="btn btn-default" id="delete" value="删除">
                        </td>
                    </tr>
                </form>
            </table>
        </td>
    </tr>
    <tr>
        <td>
            <table class="table table-bordered">
                <tr>
                    <td><input type="checkbox" name="checkAll" id="checkAll"></td>
                    <th>用户名</th>
                    <th>性别</th>
                    <th>密码</th>
                    <th>学号</th>
                    <th>电话</th>
                    <th>地址</th>
                    <th>学院</th>
                    <th>信用</th>
                    <th align="center">操作</th>
                </tr>
                <c:forEach items="${requestScope.users}" var="user" varStatus="stat">
                    <tr>
                        <td><input type="checkbox" id="box_${stat.index}" value="${user.id}"></td>
                        <td>${user.username}</td>
                        <td>${user.gender}</td>
                        <td>${user.password}</td>
                        <td>${user.stuId}</td>
                        <td>${user.phone}</td>
                        <td>${user.address}</td>
                        <td>${user.college}</td>
                        <td>${user.credit}</td>
                        <td align="center"><a href="updateUser?flag=1&id=${user.id}"><img title="修改"
                                                                                          src="../../../images/update.gif"></a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </td>
    </tr>
</table>
<nav aria-label="Page navigation" style="text-align: center;">
    <ul class="pagination pagination-lg">
        <li id="previous">
            <a
                    <c:if test="${requestScope.pageNum!=1}">
                        href="selectUser?pageNum=${requestScope.pageNum-1}"
                    </c:if>
                    aria-label="Previous">
                <span aria-hidden="true">&laquo;</span>
            </a>
        </li>
        <c:forEach items="${requestScope.pageInfo}" var="page" varStatus="stat">
            <li id="curr${stat.index+1}"><a href="selectUser?pageNum=${stat.index+1}">${stat.index+1}</a></li>
        </c:forEach>
        <li id="next">
            <a  <c:if test="${requestScope.pageNum!=requestScope.count}">
                href="selectUser?pageNum=${requestScope.pageNum+1}"
            </c:if> aria-label="Next">
                <span aria-hidden="true">&raquo;</span>
            </a>
        </li>
    </ul>
</nav>
</body>
</html>