<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<p>Edit Scenario</p>

<s:form action="saveScenario" method="post">
    <s:textfield key="scenarioBean.age" />
    <s:checkbox key="scenarioBean.fieldP" />
    <s:checkbox key="scenarioBean.fieldT" />
    <s:submit key="submit" />
</s:form>

</body>
</html>
