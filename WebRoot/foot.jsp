<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap-responsive.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap-responsive.min.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">

  </head>
  
  <body>
<div style="margin: auto;margin-top: 30px;width: 800px;height: 30px;background: url(bootstrap/img/footer-bg.png) bottom center no-repeat;text-align: center;font-family: 'Times New Roman', Times, Georgia;font-weight: normal;font-size: 16px;color: #8d8d8d;">
	Copyright © 2014 ~ 2044 Donghua University 曾彬|Email:conquerheaven@126.com|Telephone:18817326438|QQ:519806773
</div>
  </body>
</html>
