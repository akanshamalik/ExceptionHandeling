<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Here are your recorded response</h3>
<tr>FirstName="<%= request.getAttribute("firstname") %>"</tr><br>
<tr>LastName="<%= request.getAttribute("lastname") %>"</tr><br>
<tr>Gender="<%= request.getAttribute("gender") %>"</tr><br>
<% 
String clrs[] = request.getParameterValues("meal");
if(clrs != null)
{
%>
<tr>Meals:</tr>
<%
for(int i=0; i<clrs.length; i++)
{
%>
<li><%=clrs[i]%></li>
<%
}
%>
<%
}
%>
<tr>Station from="<%= request.getAttribute("list1") %>"</tr><br>
<tr>station to="<%= request.getAttribute("list2") %>"</tr>
</body>
</html>