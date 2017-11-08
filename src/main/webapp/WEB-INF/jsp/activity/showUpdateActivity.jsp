<%--
  Created by IntelliJ IDEA.
  User: imqsl
  Date: 2017/9/29
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
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
    <script type="text/javascript" src="../../../js/bootstrap-select.js"></script>
    <script type="text/javascript" src="http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap3-dialog/1.34.9/js/bootstrap-dialog.min.js"></script>
    <script src="../../../js/showDialog.js"></script>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap3-dialog/1.34.9/css/bootstrap-dialog.min.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="../../../css/bootstrap-select.css">
    <link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.2.2/css/bootstrap-combined.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" media="screen"
          href="http://tarruda.github.com/bootstrap-datetimepicker/assets/css/bootstrap-datetimepicker.min.css">
<script>
    $(function(){
        /** 表单提交 */
        $("#activityForm").submit(function(){
            var actTitle = $("#actTitle");
            var sponsorId = $("#sponsorId");
            var actContent = $("#actContent");
            var endTime = $("#endTime");
            var msg="";
            if ($.trim(actTitle.val()) == ""){
                msg = "标题不能为空！";
                actTitle.focus();
            }else if ($.trim(sponsorId.val()) == ""){
                msg = "活动发起者id不能为空！";
                sponsorId.focus();
            }else if ($.trim(actContent.val()) == ""){
                msg = "活动内容不能为空！";
                actContent.focus();
            }else if ($.trim(endTime.val()) == ""){
                msg = "截止时间不能为空！";
                endTime.focus();
            }else if ($.trim(actTitle.val()).length > 20){
                msg = "标题长度太长！";
                actTitle.focus();
            }else if ($.trim(actContent.val()).length > 100){
                msg = "内容长度太长！";
                actContent.focus();
            }

            if (msg != ""){
                $.showErr(msg);
                return false;
            }else{
                return true;
            }
            $("#activityForm").submit();
        });
    });
</script>
</head>
<body>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr><td height="10"></td></tr>
    <tr>
        <td width="15" height="32"><img src="../../../images/main_locleft.gif" width="15" height="32"></td>
        <td class="main_locbg font2"><img src="../../../images/pointer.gif">&nbsp;&nbsp;&nbsp;当前位置：后台管理  &gt; 修改活动</td>
        <td width="15" height="32"><img src="../../../images/main_locright.gif" width="15" height="32"></td>
    </tr>
</table>
<div style="width: 100%;border:1px solid #c2c6cc;background-color: #f5f7fa">
    <form action="updateActivity" id="activityForm" method="post">
        <!-- 隐藏表单，flag表示添加标记 -->
        <input type="hidden" name="flag" value="2">
        <input type="hidden" name="id" id="id" value="${activity.id}">
        <table  style="width: 500px;margin: 30px;">
            <tr style="height: 60px;">
                <td >活动标题<input type="text" name="actTitle" id="actTitle" value="${activity.actTitle}"></td>
            </tr>
            <tr style="height: 60px;">
                <td>活动发起者id<input type="text" name="sponsorId" id="sponsorId" value="${activity.sponsorId}"></td>
                <td >活动内容<input type="text" name="actContent" id="actContent" value="${activity.actContent}"></td>
            </tr>

            <tr style="height: 60px;">
                <td >活动类型  <div class="form-group">
                    <select id="type" class="selectpicker" data-live-search="true" title="${activity.type}" name="type">
                        <option>吃饭</option>
                        <option>运动</option>
                        <option>桌游</option>
                        <option>开黑</option>
                        <option>出游</option>
                        <option>其他</option>
                    </select>
                </div>
                </td>
                <td>
                    <div class="form-group">状态
                        <select id="stat" class="selectpicker" data-live-search="true" title="${activity.stat}" name="stat" value="${activity.stat}">
                            <option>1</option>
                            <option>0</option>
                        </select>
                    </div>
                </td>
            </tr>
            <tr style="height: 60px;">
                <td >创建时间 <div><f:formatDate value="${activity.createTime}" type="both" dateStyle="medium"/></div></td>
                <td >截止时间
                    <div id="datetimepicker" class="input-append date">
                        <input type="text" value="<f:formatDate value="${activity.endTime}" type="both" dateStyle="medium"/>" name="endTime" id="endTime"></input>
                        <span class="add-on">
        <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i>
      </span>
                    </div>
                </td>
            </tr>
        </table>
        <div style="width: 100%; height: 100px; border-top: 1px dashed #c2c6cc">
            <input type="submit" value="提交" class="btn btn-default" style="margin-left:150px; margin-top: 10px;">
            <input type="reset" value="取消" class="btn btn-default" style="margin-left:50px;margin-top:10px; ">
        </div>
    </form>
</div>
</body>

<script>
    $('#datetimepicker').datetimepicker({
        format: 'yyyy-MM-dd hh:mm:ss',
        language: 'en',
        pickDate: true,
        pickTime: true,
        hourStep: 1,
        minuteStep: 15,
        secondStep: 30,
        inputMask: true
    });
</script>
</html>
