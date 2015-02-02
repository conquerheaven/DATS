<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
<jsp:include page="head.jsp"></jsp:include>
  <head>
  </head>
  
  <body>
<div style="text-align:center">
<h2>REGIST</h2>
<form action="Register" method="post" class="form-horizontal">
<s:fielderror><s:param>userinfo.username</s:param></s:fielderror>
<div class="control-group"><input name="userinfo.username" placeholder="ACMer" type="text" /></div>
<s:fielderror><s:param>userinfo.password</s:param></s:fielderror>
<div class="control-group"><input name="userinfo.password" placeholder="Password" type="password" /></div>
<s:fielderror><s:param>password</s:param></s:fielderror>
<div class="control-group"><input name="password" placeholder="Confirm Password" type="password" /></div>

<div class="control-group"><input type="submit" class="btn btn-info" contenteditable="true" value="Regist"></div>
</form>
</div>

  </body>
<jsp:include page="foot.jsp"></jsp:include>
</html>
