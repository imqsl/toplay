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
            $("#noteForm").submit(function(){
                var title = $("#title");
                var content = $("#content");
                var msg="";
                if ($.trim(title.val()) == ""){
                    msg = "标题不能为空！";
                    title.focus();
                }else if ($.trim(content.val()) == ""){
                    msg = "内容不能为空！";
                    content.focus();
                }else if ($.trim(title.val()).length > 20){
                    msg = "标题长度太长！";
                    title.focus();
                }else if ($.trim(content.val()).length > 50){
                    msg = "内容长度太长！";
                    content.focus();
                }

                if (msg != ""){
                    $.showErr(msg);
                    return false;
                }else{
                    return true;
                }
                $("#noteForm").submit();
            });
        });
    </script>
</head>
<body>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr><td height="10"></td></tr>
    <tr>
        <td width="15" height="32"><img src="../../../images/main_locleft.gif" width="15" height="32"></td>
        <td class="main_locbg font2"><img src="../../../images/pointer.gif">&nbsp;&nbsp;&nbsp;当前位置：后台管理  &gt; 添加通知</td>
        <td width="15" height="32"><img src="../../../images/main_locright.gif" width="15" height="32"></td>
    </tr>
</table>
<div style="width: 100%;border:1px solid #c2c6cc;background-color: #f5f7fa">
    <form action="addNote" id="noteForm" method="post">
        <!-- 隐藏表单，flag表示添加标记 -->
        <input type="hidden" name="flag" value="2">
    <table  style="width: 500px;margin: 30px;">
        <tr style="height: 60px;">
         <td>标题<input type="text" name="title" id="title"></td>
        </tr>
        <tr style="height: 60px;">
        <td >内容<input type="text" name="content" id="content"></td>
        </tr>
        <tr style="height: 60px;">
        <td >
            <div class="form-group">类型
                <select id="type" class="selectpicker" data-live-search="true" title="系统通知" name="type">
                    <option>系统通知</option>
                    <option>好消息</option>
                    <option>其他</option>
                </select>
            </div>
        </td>
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
