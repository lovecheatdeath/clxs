<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<% String appPath = request.getContextPath();%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>上传测试页</title>
</head>
<body>
<form action="<%=appPath%>/a/u/upLoadImage" method="post" enctype="multipart/form-data">
    <label>上传图片：</label><input type="file" name="file"><br>
    <input type="submit">
</form>
</body>
</html>