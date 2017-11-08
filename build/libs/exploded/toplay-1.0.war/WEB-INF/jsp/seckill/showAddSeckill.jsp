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
    <script src="../../../js/showDialog.js"></script>
    <script type="text/javascript"
            src="http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.min.js">
    </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap3-dialog/1.34.9/js/bootstrap-dialog.min.js"></script>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap3-dialog/1.34.9/css/bootstrap-dialog.min.css" rel="stylesheet" type="text/css" />
    <link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.2.2/css/bootstrap-combined.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" media="screen"
          href="http://tarruda.github.com/bootstrap-datetimepicker/assets/css/bootstrap-datetimepicker.min.css">
    <script>
        $(function(){
            /** 表单提交 */
            $("#seckillForm").submit(function(){
                var name = $("#name");
                var price = $("#price");
                var seckillNumber = $("#seckillNumber");
                var startTime = $("#startTime");
                var endTime = $("#endTime");
                var msg="";
                if ($.trim(name.val()) == ""){
                    msg = "商品名不能为空！";
                    name.focus();
                }else if ($.trim(price.val()) == ""){
                    msg = "价格不能为空！";
                    price.focus();
                }else if ($.trim(seckillNumber.val()) == ""){
                    msg = "数量不能为空！";
                    seckillNumber.focus();
                }else if ($.trim(startTime.val()) == ""){
                    msg = "开始时间不能为空！";
                    startTime.focus();
                }else if ($.trim(endTime.val()) == ""){
                    msg = "结束时间不能为空！";
                    endTime.focus();
                }
                else if ($.trim(name.val()).length > 20){
                    msg = "商品名长度太长！";
                    name.focus();
                }else if ($.trim(price.val()).length > 20){
                    msg = "价格长度太长！";
                    price.focus();
                }else if (!/^[+]{0,1}(\d+)$|^[+]{0,1}(\d+\.\d+)$/.test($.trim(price.val()))){
                    msg = "价格必须为正数！";
                    price.focus();
                }else if (!/^[+]{0,1}(\d+)$/.test($.trim(seckillNumber.val()))){
                    msg = "数量必须为正整数！";
                    seckillNumber.focus();
                }
                else if ($.trim(seckillNumber.val()).length > 10){
                    msg = "数量长度太长！";
                    seckillNumber.focus();
                }

                if (msg != ""){
                    $.showErr(msg);
                    return false;
                }else{
                    return true;
                }
                $("#seckillForm").submit();
            });
        });
    </script>
</head>
<body>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr><td height="10"></td></tr>
    <tr>
        <td width="15" height="32"><img src="../../../images/main_locleft.gif" width="15" height="32"></td>
        <td class="main_locbg font2"><img src="../../../images/pointer.gif">&nbsp;&nbsp;&nbsp;当前位置：后台管理  &gt; 添加秒杀</td>
        <td width="15" height="32"><img src="../../../images/main_locright.gif" width="15" height="32"></td>
    </tr>
</table>
<div style="width: 100%;border:1px solid #c2c6cc;background-color: #f5f7fa">
    <form action="addSeckill" id="seckillForm" method="post">
        <!-- 隐藏表单，flag表示添加标记 -->
        <input type="hidden" name="flag" value="2">
    <table  style="width: 500px;margin: 30px; padding: 10px">
        <tr style="height: 60px;">
            <td>商品名<input type="text" name="name" id="name"></td>
            <td>价格<input type="text" name="price" id="price"></td>
            <td >数量<input type="text" name="seckillNumber" id="seckillNumber"></td>
        </tr>
        <tr style="height: 60px;">
            <input type="hidden" name="createTime" id="createTime">
            <td>开始时间
                <div id="datetimepicker" class="input-append date">
                    <input type="text" value="" type="both" dateStyle="medium" name="startTime"
                           id="startTime"/></input>
                    <span class="add-on">
        <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i>
      </span>
                </div>
            </td>
            <td>结束时间
                <div id="datetimepicker2" class="input-append date">
                    <input type="text" value="" type="both" dateStyle="medium" name="endTime"
                           id="endTime"/></input>
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

<script type="text/javascript">
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
    $('#datetimepicker2').datetimepicker({
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
