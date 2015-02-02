<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="org.model.*" %>
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
<div class="container">
	<div class="row">
		<div class="span12">
			<table class="table table-hover table-bordered">
				<thead>
					<tr>
						<th>
							#
						</th>
						<th>
							Problem ID
						</th>
						<th>
							Problem Tile
						</th>
						<th>
							Knowledge
						</th>
						<th>
							Year
						</th>
						<th>
							Total Accepted
						</th>
						<th>
							VIEW
						</th>
						<th>
							SUBMIT
						</th>
						<th>
							DISCUSS
						</th>
					</tr>
				</thead>
				<tbody>
					<%
					ArrayList<Problem> ls = (ArrayList<Problem>) request.getAttribute("ls");
					if(ls != null){
						Iterator<Problem> it = ls.iterator();
						int ID = 1;
						while(it.hasNext()){
							Problem P = it.next();
							if(ID%2 == 0){
								%>
								<tr class="info">
								<%
							}else{
								%>
								<tr class="warning">
								<%
							}
							%>
							<td><%=ID %></td>
							<td><%=P.getOj()+" "+P.getProblemId() %></td>
							<td><%=P.getProblemTitle() %></td>
							<td><%=P.getKnowledgePoint() %></td>
							<td><%=P.getYear() %></td>
							<td><%=P.getAc() %></td>
							<td><a href="http://poj.org/problem?id=<%=P.getProblemId() %>" target="_blank">Desctption</a></td>
							<td><a href="submit.jsp?ID=<%=P.getProblemId() %>">Submit</a></td>
							<td><a href="Content?problemId=<%=P.getProblemId() %>">Discuss</a></td>
							</tr>
							<%
							ID++;
						}
					}
					 %>
				</tbody>
			</table>
		</div>
	</div>
</div>
  </body>
<jsp:include page="foot.jsp"></jsp:include>
</html>
