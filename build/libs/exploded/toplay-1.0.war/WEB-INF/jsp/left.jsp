<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
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
    <script language="javascript" type="text/javascript"> 
            $(function(){
                /** 给左侧功能菜单绑定点击事件  */
                //匹配id以navbg开头的td标签
                $("td[id^='navbg']").click(function(){
                     /** 获取一级菜单的id */
                     var navbgId = this.id;
                     /** 获取对应的二级菜单id */
                     var submenuId = navbgId.replace('navbg','submenu');
                     /** 控制二级菜单显示或隐藏  */
                     $("#"+submenuId).toggle();//切换事件使隐藏或显示
                     $("#"+navbgId+" span").toggleClass("glyphicon-chevron-down");
                     /** 控制其他的一级菜单的二级菜单隐藏按钮都关闭  */
                     $("tr[id^='submenu']").not("#"+submenuId).hide();
            
                     
                })
            })
        </script>
        <style>
.table { width: 200px;
    height: 100%;
}
        </style>
</head>
<body style="background-color: #e5f0ff">
	<div style="background-color:#FFFFFF;margin: 10px; text-align:left;">
<table class="table table-bordered" >
<tr><td class="left_nav_top"><div class="font1"><span class="glyphicon glyphicon-user">&nbsp;</span>用户管理</div></td></tr>
<tr><td>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="user/selectUser?pageNum=1" target="main">用户查询</a></p>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="user/addUser?flag=1" target="main">添加用户</a></p>
</td>
</tr>
<tr><td id="navbg1"><div class="font1"><span class="glyphicon glyphicon-chevron-right">&nbsp;</span>活动管理</div></td></tr>
<tr id="submenu1" style="display: none">
<td>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="activity/selectActivity" target="main">活动查询</a></p>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="activity/addActivity?flag=1" target="main">添加活动</a></p>
</td>
</tr>
<tr><td id="navbg2"><div class="font1"><span class="glyphicon glyphicon-chevron-right">&nbsp;</span>通知管理</div></td></tr>
<tr id="submenu2" style="display: none">
<td>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="note/selectNote" target="main">通知查询</a></p>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="note/addNote?flag=1" target="main">添加通知</a></p>
</td></tr>
<tr ><td id="navbg3"><div class="font1"><span class="glyphicon glyphicon-chevron-right">&nbsp;</span>消息管理</div></td></tr>
<tr id="submenu3" style="display: none">
<td>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="message/selectMessage" target="main">消息查询</a></p>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="message/addMessage?flag=1" target="main">添加消息</a></p>
</td></tr>
<tr><td id="navbg4"><div class="font1"><span class="glyphicon glyphicon-chevron-right">&nbsp;</span>秒杀管理</div></td></tr>
<tr id="submenu4" style="display: none">
<td>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="seckill/selectSeckill" target="main">秒杀查询</a></p>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="seckill/addSeckill?flag=1" target="main">添加秒杀</a></p>
</td>
</tr>
<tr><td id="navbg5"><div class="font1"><span class="glyphicon glyphicon-chevron-right">&nbsp;</span>管理员管理</div></td></tr>
<tr id="submenu5" style="display: none">
<td>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="mymanager/selectManager" target="main">管理员查询</a></p>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="mymanager/addManager?flag=1" target="main">添加管理员</a></p>
</td>
</tr>
<tr><td id="navbg6"><div class="font1"><span class="glyphicon glyphicon-chevron-right">&nbsp;</span>详情管理</div></td></tr>
<tr id="submenu6" style="display: none">
<td>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="play/selectPlay" target="main">详情查询</a></p>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="play/addPlay?flag=1" target="main">添加详情</a></p>
</td></tr>
<tr><td id="navbg7"><div class="font1"><span class="glyphicon glyphicon-chevron-right">&nbsp;</span>秒杀详情管理</div></td></tr>
<tr id="submenu7" style="display: none">
<td>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="successKilled/selectSuccessKilled" target="main">秒杀详情查询</a></p>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="successKilled/addSuccessKilled?flag=1" target="main">添加秒杀详情</a></p>
</td>
</tr>
</table>
</div>
</body>
</html>