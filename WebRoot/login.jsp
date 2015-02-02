<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
  </head>
  
  <body>
  <div class="container">
	<div class="row">
		<div class="span12" style="text-align:center">
  <h2>LOGIN</h2>

<s:form action="Login" method="post" class="form-horizontal" theme="simple">
<div style="text-align:center;">
<s:textfield id="input" placeholder="ACMer" name="userinfo.username"></s:textfield><br>
<s:password name="userinfo.password" placeholder="Password" id="inputPassword"></s:password><br>
<s:submit cssClass="btn btn-success" contenteditable="true" value="GO"></s:submit>
</div>
</s:form>

</div>
</div>
</div>
  </body>
</html>
