<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>组队网登录</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>组队网</title>
    <script src="../../js/jquery1.12.4.min.js"></script>
    <script src="../../js/bootstrap.min.js"></script>
    <!-- Bootstrap -->
    <link href="../../css/bootstrap.min.css" rel="stylesheet">
    <style>
        .col-center-block {
            float: none;
            display: block;
            margin-left: auto;
            margin-right: auto;
        }
    </style>
</head>
<%--<body style="text-align: center">
<form class="form-horizontal" action="/login" method="post" >
    <h1 >toplay后台管理系统</h1>
    <div class="center-block">

        <span><font color="red"> ${requestScope.message}</font> </span>
    </div>
    <div class="form-group center-block">

        <label class="col-sm-1 control-label">用户名：</label>
        <div class="col-sm-2">
            <input type="text" id="name" name="name" class="form-control" placeholder="输入学号">
        </div>
    </div>
    <div class="form-group center-block">
        <label class="col-sm-1 control-label">密码：</label>
        <div class="col-sm-2">
            <input type="password" id="password" name="password"  class="form-control" placeholder="输入密码">
        </div>
    </div>
    <div class="form-group center-block">
        <div class="col-sm-offset-1 col-sm-10">
            <div class="checkbox">
                <label>
                    <input type="checkbox"> 记住我
                </label>
            </div>
        </div>
    </div>
    <div class="form-group center-block">
        <div class="col-sm-offset-1 col-sm-4">
            <button type="submit" class="btn btn-default">登录</button>
            <button type="submit" class="btn btn-default">注册</button>
        </div>

    </div>
    </div>
</form>

</body>--%>
<body>
<div class="container">
    <div class="row myCenter">
        <div class="col-xs-6 col-md-4 col-center-block">
            <form class="form-signin" action="/login" method="post" >
                <h2 class="form-signin-heading">请登录</h2>
                <div>
                    <span><font color="red"> ${requestScope.message}</font> </span>
                </div>
                <label for="name" class="sr-only">用户名</label>
                <input type="text" id="name" name="name" class="form-control" placeholder="用户名" required autofocus>
                <label for="password" class="sr-only">密码</label>
                <input type="password" id="password" name="password" class="form-control" placeholder="密码" required>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" value="remember-me">
                        记住我 </label>
                </div>
                <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
