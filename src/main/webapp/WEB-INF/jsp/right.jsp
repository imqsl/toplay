<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
	 <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Bootstrap 101 Template</title>
    <script src="../../js/jquery1.12.4.min.js"></script>
    <!-- Bootstrap -->
    <link href="../../css/bootstrap.min.css" rel="stylesheet">
    <link href="../../images/fkjava.ico" rel="shortcut icon" type="image/x-icon" />
    <link href="../../css/css.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
			 <tr><td height="10"></td></tr>
			 <tr>
			    <td width="15" height="32"><img src="../../images/main_locleft.gif" width="15" height="32"></td>
				<td class="main_locbg font2"><img src="../../images/pointer.gif">&nbsp;&nbsp;&nbsp;当前位置：后台管理  &gt; 当前用户</td>
				<td width="15" height="32"><img src="../../images/main_locright.gif" width="15" height="32"></td>
			 </tr>
		</table>
		<table width="100%" height="90%" border="0" cellpadding="10" cellspacing="0" class="main_tabbor">
		  	<tr valign="top">
			    <td>
				  <table width="100%" border="0" cellpadding="0" cellspacing="10" class="main_tab">
				    <tr><td class="font3 fftd">用户名：<font color="red" size="2">${sessionScope.manager_session.name}</font></td></tr>


					</font></td></tr>

				  </table>
				</td>
		  	</tr>
		</table>
		<div style="height:10px;"></div>
</body>
</html>