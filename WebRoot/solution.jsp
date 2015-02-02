<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="org.model.*" import="org.dao.imp.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<jsp:include page="head.jsp"></jsp:include>
  <head>
  </head>
  
  <body>
  <script type="text/javascript">
  	document.getElementById("solution").setAttribute("class", "active");
  </script>
<div class="container">
	<div class="row">
		<div class="span12">
			<table class="table table-bordered table-hover table-condensed">
				<thead>
					<tr><th>Solution Id</th><th>User</th><th>Problem ID</th><th>Result</th>
					<th>Memory</th><th>Run Time</th><th>Language</th><th>Code Length</th><th>Submit Time</th></tr>
				</thead>
				<tbody>
				<%
				int top = Integer.parseInt(request.getAttribute("top").toString());
				ArrayList<Solution> ls = (ArrayList<Solution>)request.getAttribute("ls");
				if(ls != null){
					Iterator<Solution> it = ls.iterator();
					top = 0;
					while(it.hasNext()){
						Solution solution = it.next();
						if(solution.getSolutionId() > top){
							top = solution.getSolutionId();
						}
						if(solution.getResult().equals("Accepted")){
						%>
						<tr class="success">
						<%
						}else if(solution.getResult().equals("waitting")){
						%>
						<tr>
						<%
						}else{
						%>
						<tr class="error">
						<%
						}
						%>
						<td><%=solution.getSolutionId().toString() %></td>
						<td><%=solution.getSubuser() %></td>
						<td><%=solution.getProblemId().toString() %></td>
						<td><%=solution.getResult() %></td>
						<td><%=solution.getMemory() %></td>
						<td><%=solution.getRunTime() %></td>
						<td><%=solution.getLanguage() %></td>
						<td><%=solution.getCodeLength() %></td>
						<td><%=solution.getLocTime() %></td>
						</tr>
						<%
					}
				}
				 %>
				</tbody>
			</table>
			<div class="pagination pagination-centered">
				<ul>
					<li>
						<a href="getSolution?top=1000000000">首页</a>
					</li>
					<li>
						<a href="getSolution?top=<%=top+20 %>">上一页</a>
					</li>
					<%
					if(top > 20){
						%>
						<li>
							<a href="getSolution?top=<%=top-20 %>">下一页</a>
						</li>
						<%
					}
					 %>
					<li>
						<a href="getSolution?top=<%=20 %>">末页</a>
					</li>
				</ul>
			</div>
		</div>
	</div>
</div>
  </body>
<jsp:include page="foot.jsp"></jsp:include>
</html>
