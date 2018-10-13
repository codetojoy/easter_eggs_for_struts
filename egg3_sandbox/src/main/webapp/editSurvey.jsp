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
<p>Edit Session</p>

<s:form action="save" method="post">
    <p>Age: <s:property value="surveyBean.age" /></p>
    <p>fieldP: <s:property value="surveyBean.isFieldP" /></p>
    <p>fieldT: <s:property value="surveyBean.isFieldT" /></p>

    <hr/>
    <s:if test="surveyBean.age >= 65">
        <p>user is senior</p>
    </s:if>
    <s:else>
        <p>user is NOT senior</p>
    </s:else>
    <hr/>

    <s:textfield label="Answer A" key="surveyBean.answerA" />
    <br/>
    <s:textfield label="Answer B" key="surveyBean.answerB" />
    <br/>

    <s:submit key="submit" />
</s:form>

</body>
</html>
