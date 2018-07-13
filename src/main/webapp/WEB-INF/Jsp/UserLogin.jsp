<%--
  Created by IntelliJ IDEA.
  User: cango
  Date: 2018/7/9
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登陆界面</title>
</head>
<body>
<form class="login-form" action="login.do" method="post">
<div class="form-group" style="min-height:0px;">
    <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
    <label class="control-label visible-ie8 visible-ie9">用户名：</label>
    <div class="input-icon">
        <i class="fa fa-user"></i>
        <input class="form-control placeholder-no-fix" type="text" autocomplete="off" placeholder="用户名" name="userid"/>
    </div>
</div>
<div class="form-group" style="min-height:0px;">
    <label class="control-label visible-ie8 visible-ie9">密码：</label>
    <div class="input-icon">
        <i class="fa fa-lock"></i>
        <input class="form-control placeholder-no-fix" type="password" autocomplete="off" placeholder="密码" name="password"/>
    </div>
</div>
<div class="form-group" style="text-align:center;min-height:0px;">
    <button type="submit" class="btn green-haze">
        登录&nbsp;<i class="m-icon-swapright m-icon-white"></i>
    </button>
</div>
</form>
</body>
</html>
