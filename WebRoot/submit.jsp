<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<jsp:include page="head.jsp"></jsp:include>
  <head>
    <base href="<%=basePath%>">
  </head>
  
  <body>
  <script type="text/javascript">
  	document.getElementById("submit").setAttribute("class", "active");
  </script>
  <%
    if(session.getAttribute("ACMer")==null){
    	response.sendRedirect("home.jsp");
    }
     %>
    <div class="container">
	<div class="row">
		<div class="span12">
			<s:form action="Submit" method="post" theme="simple">
				<div style="text-align:center">
				<h2>Submit Your Solution</h2>
				<s:hidden name="solution.oj" value="POJ"></s:hidden>
				<s:hidden name="solution.subuser" value="%{#session.ACMer}"></s:hidden>
				<s:hidden name="solution.result" value="waitting"></s:hidden>
				<s:hidden name="solution.memory" value=" "></s:hidden>
				<s:hidden name="solution.runTime" value=" "></s:hidden>
				<s:hidden name="solution.subTime" value=" "></s:hidden>
				<s:hidden name="solution.codeLength" value=" "></s:hidden>
				<s:fielderror><s:param>solution.problemId</s:param></s:fielderror>
				<%
					if(request.getParameter("ID") != null){
					%>
					<s:textfield placeholder="Problem ID" name="solution.problemId" value="%{#parameters.ID}" disabled="true"></s:textfield>
						<!-- <input placeholder="Problem ID" type="text" name="solution.problemId" value="<%=request.getParameter("ID")%>" disabled="true"/> --><br />
					<%
					}
					else{
					%>
					<s:textfield placeholder="Problem ID" name="solution.problemId"></s:textfield>
						<!-- <input placeholder="Problem ID" type="text" name="solution.problemId" /> -->
					<%
					}
				 %>
				<br />
						<s:fielderror><s:param>solution.code</s:param></s:fielderror>
					<s:textarea cssStyle="width:500px;height:400px;resize:none" name="solution.code" placeholder="Your Code"></s:textarea>
				<div class="controls"><s:submit cssClass="btn btn-success" contenteditable="true" value="submit"></s:submit>
				<s:reset cssClass="btn btn-info" contenteditable="true" value="reset"></s:reset></div>
				</div>
			</s:form>
		</div>
	</div>
</div>
  </body>
<jsp:include page="foot.jsp"></jsp:include>
</html>
