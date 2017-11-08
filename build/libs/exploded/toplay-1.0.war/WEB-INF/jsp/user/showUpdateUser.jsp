<%--
  Created by IntelliJ IDEA.
  User: imqsl
  Date: 2017/9/29
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <title>组队网</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>组队网</title>
    <script src="../../../js/jquery1.12.4.min.js"></script>
    <script src="../../../js/bootstrap.js"></script>
    <script src="../../../js/showDialog.js"></script>
    <script src="../../../js/jquery.fs.stepper.js"></script>
    <script type="text/javascript" src="../../../js/bootstrap-select.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap3-dialog/1.34.9/js/bootstrap-dialog.min.js"></script>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap3-dialog/1.34.9/css/bootstrap-dialog.min.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="../../../css/bootstrap-select.css">
    <link href="../../../css/jquery.fs.stepper.css" rel="stylesheet">
    <!-- Bootstrap -->
    <link href="../../../css/bootstrap.min.css" rel="stylesheet">
    <script>
        $(function(){
            /** 表单提交 */
            $("#userUpdateForm").submit(function(){
                var username = $("#username");
                var stuId = $("#stuId");
                var phone = $("#phone");
                var password = $("#password");
                var address = $("#address");
                var msg="";
                if ($.trim(username.val()) == ""){
                    msg = "姓名不能为空！";
                    username.focus();
                }else if ($.trim(stuId.val()) == ""){
                    msg = "学号不能为空！";
                    stuId.focus();
                }else if ($.trim(phone.val()) == ""){
                    msg = "电话不能为空！";
                    phone.focus();
                }else if ($.trim(password.val()) == ""){
                    msg = "密码不能为空！";
                    password.focus();
                }else if (!/^1[3|5|7|8]\d{9}$/.test($.trim(phone.val()))){
                    msg = "电话号码格式不正确！";
                    phone.focus();
                }else if (!/^\d{13}$/.test($.trim(stuId.val()))){
                    msg = "学号格式不正确！";
                    stuId.focus();
                }else if ($.trim(username.val()).length > 16){
                    msg = "用户名长度太长！";
                    username.focus();
                }else if ($.trim(password.val()).length > 16){
                    msg = "密码最多16位！";
                    password.focus();
                }
                if (msg != ""){
                    $.showErr(msg);
                    return false;
                }else{
                    return true;
                }

            });
        });
    </script>
</head>
<body>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr><td height="10"></td></tr>
    <tr>
        <td width="15" height="32"><img src="../../../images/main_locleft.gif" width="15" height="32"></td>
        <td class="main_locbg font2"><img src="../../../images/pointer.gif">&nbsp;&nbsp;&nbsp;当前位置：后台管理  &gt; 修改用户</td>
        <td width="15" height="32"><img src="../../../images/main_locright.gif" width="15" height="32"></td>
    </tr>
</table>
<div style="width: 100%;border:1px solid #c2c6cc;background-color: #f5f7fa">
    <form action="updateUser" id="userUpdateForm" method="post">
        <input type="hidden" name="flag" value="2">
        <input type="hidden" name="id" value="${user.id }">
        <table  style="width: 500px;margin: 30px;">
            <tr style="height: 60px;">
                <td >姓名<input type="text" name="username" id="username" value="${user.username}"></td>
                <td>
                    性别
                    &nbsp; &nbsp; &nbsp; &nbsp;
                    <c:choose>
                        <c:when test="${user.gender=='男'}">
                            <label class="radio-inline">
                                <input type="radio" name="gender" id="boy" value="男" checked="checked"> 男
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="gender" id="girl" value="女"> 女
                            </label>
                        </c:when>
                        <c:otherwise>
                            <label class="radio-inline">
                                <input type="radio" name="gender" value="男" > 男
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="gender" value="女" checked="checked"> 女
                            </label>
                        </c:otherwise>
                    </c:choose>

                </td>
            </tr>

            <tr style="height: 60px;">
                <td>密码<input type="text" name="password" id="password" value="${user.password}"></td>
                <td >学号<input type="text" name="stuId" id="stuId" value="${user.stuId}"></td>

            </tr>
            <tr style="height: 60px;">
                <td >电话<input type="text" name="phone" id="phone" value="${user.phone}"></td>
                <td >地址<input type="text" name="address" id="address" value="${user.address}"></td>

            </tr>
            <tr style="height: 60px;">
                <td>
                    <div class="form-group">
                        学院
                        <select id="college" class="selectpicker" data-live-search="true" title="${user.college}" name="college">
                            <option>商学院</option>
                            <option>法学院</option>
                            <option>化学学院</option>
                            <option>艺术学院</option>
                            <option>经济学院</option>
                            <option>计算机学院</option>
                            <option>外国语学院</option>
                            <option>华西药学院</option>
                            <option>公共管理学院</option>
                            <option>历史文化学院</option>
                            <option>电子信息学院</option>
                            <option>电气信息学院</option>
                            <option>化学工程学院</option>
                            <option>水利水电学院</option>
                            <option>生命科学学院</option>
                            <option>国际关系学院</option>
                            <option>文学与新闻学院</option>
                            <option>马克思主义学院</option>
                            <option>建筑与环境学院</option>
                            <option>网络空间安全学院</option>
                            <option>轻纺与食品学院</option>
                            <option>空天科学与工程学院</option>
                            <option>高分子科学与工程学院</option>
                        </select>
                    </div>
                </td>
                <td >信用
                    <input type="number" min="0" max="100" step="1" name="credit" value="${user.credit}" />
                </td>
            </tr>
        </table>
        <div style="width: 100%; height: 100px; border-top: 1px dashed #c2c6cc">
            <input type="submit" value="修改" class="btn btn-default" style="margin-left:150px; margin-top: 10px;">
            <input type="reset" value="取消" class="btn btn-default" style="margin-left:50px;margin-top:10px; ">
        </div>
    </form>
</div>
</body>
</html>
