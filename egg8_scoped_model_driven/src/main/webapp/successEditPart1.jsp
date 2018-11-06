<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h3>Welcome</h3>

<p>success on edit part1: <s:property value="name" /></p>
<p><s:property value="id" /></p>

<s:form action="editEmployeePart2" method="post">
    <s:textfield key="part1" />
    <s:submit key="submit" />
</s:form>

</body>
</html>
