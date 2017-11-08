<%--
  Created by IntelliJ IDEA.
  User: imqsl
  Date: 2017/9/28
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
    <script src="../../../js/bootstrap-select.js"></script>
    <script src="../../../js/showDialog.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap3-dialog/1.34.9/js/bootstrap-dialog.min.js"></script>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap3-dialog/1.34.9/css/bootstrap-dialog.min.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="../../../css/bootstrap-select.css">
    <!-- Bootstrap -->
    <link href="../../../css/bootstrap.min.css" rel="stylesheet">
    <script>
        $(function(){
            /** 表单提交 */
            $("#playForm").submit(function(){
                var id = $("#id");
                var actId = $("#actId");
                var sponsorId = $("#sponsorId");
                var partId = $("#partId");
                var msg="";
                if ($.trim(id.val()) == ""){
                    msg = "id不能为空！";
                    id.focus();
                }else if ($.trim(actId.val()) == ""){
                    msg = "活动id不能为空！";
                    actId.focus();
                }else if ($.trim(sponsorId.val()) == ""){
                    msg = "活动发起者id不能为空！";
                    sponsorId.focus();
                }else if ($.trim(partId.val()) == ""){
                    msg = "参与者id不能为空！";
                    partId.focus();
                }
                else if ($.trim(id.val()).length > 20){
                    msg = "id长度太长！";
                    id.focus();
                }else if ($.trim(actId.val()).length > 20){
                    msg = "活动id长度太长！";
                    actId.focus();
                }else if ($.trim(sponsorId.val()).length > 20){
                    msg = "活动发起者id长度太长！";
                    sponsorId.focus();
                }else if ($.trim(partId.val()).length > 20){
                    msg = "参与者id长度太长！";
                    partId.focus();
                }

                if (msg != ""){
                    $.showErr(msg);
                    return false;
                }else{
                    return true;
                }
                $("#playForm").submit();
            });
        });
    </script>
</head>
<body>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr><td height="10"></td></tr>
    <tr>
        <td width="15" height="32"><img src="../../../images/main_locleft.gif" width="15" height="32"></td>
        <td class="main_locbg font2"><img src="../../../images/pointer.gif">&nbsp;&nbsp;&nbsp;当前位置：后台管理  &gt; 添加详情</td>
        <td width="15" height="32"><img src="../../../images/main_locright.gif" width="15" height="32"></td>
    </tr>
</table>
<div style="width: 100%;border:1px solid #c2c6cc;background-color: #f5f7fa">
    <form action="addPlay" id="playForm" method="post">
        <!-- 隐藏表单，flag表示添加标记 -->
        <input type="hidden" name="flag" value="2">
    <table  style="width: 500px;margin: 30px;">
        <tr style="height: 60px;">
            <td >详情id<div></div><input type="text" name="id" id="id"></td>
            <td >活动id<div></div><input type="text" name="actId" id="actId"></td>
        </tr>
        <tr style="height: 60px;">
            <td >发起者id<div></div><input type="text" name="sponsorId" id="sponsorId"></td>
            <td >参与者id<div></div><input type="text" name="partId" id="partId"></td>

        </tr>
        <tr style="height: 60px;">
            <td>状态<div class="form-group">
                <select id="stat" class="selectpicker" data-live-search="true" title="1" name="stat">
                    <option>1</option>
                    <option>0</option>
                </select>
            </div>
            </td>
            <td >备注<div></div><input type="text" name="description" id="description"></td>
        </tr>
    </table>
    <div style="width: 100%; height: 100px; border-top: 1px dashed #c2c6cc">
        <input type="submit" value="提交" class="btn btn-default" style="margin-left:80px; margin-top: 10px;">
        <input type="reset" value="取消" class="btn btn-default" style="margin-left:30px;margin-top:10px; ">
    </div>
    </form>
</div>
</body>
</html>
