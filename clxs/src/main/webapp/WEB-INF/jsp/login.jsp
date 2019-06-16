<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<% String appPath = request.getContextPath();%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<script>alert("请先登录")</script>
<form action="<%=appPath%>/doLogin" method="post">
    <label>账号：</label>
    <input type="text" id="txtUsername" name="username" placeholder="请输入账号" /><br/>
    <label>密码：</label>
    <input type="password" id="txtPassword" name="password" placeholder="请输入密码" /><br/>
    <input type="submit" value="提交" />
    <input type="reset" value="重置" />
</form>
</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/3
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java"%>--%>
<%--<form class="form-horizontal" onclick="return false;">--%>
    <%--<div class="form-group">--%>
        <%--<label for="inputName" class="col-sm-2 control-label">账号:</label>--%>
        <%--<div class="col-sm-10">--%>
            <%--<input type="text" class="form-control" id="inputName" placeholder="请输入你的账号" name="username">--%>
        <%--</div>--%>
    <%--</div>--%>
    <%--<div class="form-group">--%>
        <%--<label for="inputPassword" class="col-sm-2 control-label">密码:</label>--%>
        <%--<div class="col-sm-10">--%>
            <%--<input type="password" class="form-control" id="inputPassword" placeholder="请输入密码" name="password">--%>
        <%--</div>--%>
    <%--</div>--%>
    <%--<div id="error_box"><br></div>--%>
    <%--<div class="form-group">--%>
        <%--<div class="col-sm-offset-2 col-sm-10">--%>
            <%--<button type="button" class="btn btn-success" onclick="fnLogin()">登录</button>--%>
            <%--<button class="btn btn-primary" type="reset">重置</button>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</form>--%>
<%--<script src="https://cdn.bootcss.com/jquery/2.2.4/jquery.js"></script>--%>
<%--<script  type="text/javascript">--%>
    <%--function fnLogin() {--%>
        <%--var name = $("input[name='username']").val();--%>
        <%--var pwd = $("input[name='password']").val();--%>
        <%--var data = {--%>
            <%--'username':name,--%>
            <%--'password':pwd,--%>
        <%--};--%>
        <%--var error = document.getElementById("error_box")--%>
        <%--var isError = true;--%>
        <%--if (name.value.length > 20 || name.value.length < 6) {--%>
            <%--error.innerHTML = "用户名请输入6-20位字符";--%>
            <%--isError = false;--%>
            <%--return;--%>
        <%--}else if((name.value.charCodeAt(0)>=48) && (name.value.charCodeAt(0)<=57)){--%>
            <%--error.innerHTML = "首字符必须为字母";--%>
            <%--return;--%>
        <%--}else for(var i=0;i<name.value.charCodeAt(i);i++){--%>
            <%--if((name.value.charCodeAt(i)<48)||(name.value.charCodeAt(i)>57) && (name.value.charCodeAt(i)<97)||(name.value.charCodeAt(i)>122)){--%>
                <%--error.innerHTML = "必须为字母跟数字组成";--%>
                <%--return;--%>
            <%--}--%>
        <%--}--%>

        <%--if (pwd.value.length > 20 || pwd.value.length < 6) {--%>
            <%--error.innerHTML = "密码请输入6-20位字符"--%>
            <%--isError = false;--%>
            <%--return;--%>
        <%--}--%>
        <%--$.ajax({--%>
            <%--url: "/doLogin",--%>
            <%--type: "POST",--%>
            <%--data: data--%>
        <%--});--%>
        <%--window.alert("登录成功")--%>
    <%--}--%>
<%--</script>--%>