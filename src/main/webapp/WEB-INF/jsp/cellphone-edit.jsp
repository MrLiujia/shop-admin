<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<c:set var="title" value="${cellphone.id == null ? '添加手机' : '修改手机'}"></c:set>
<t:layout title="${title}">

 	<jsp:attribute name="css">
    	<link href="${contextPath}/assets/css/form.css" rel="stylesheet">
    </jsp:attribute>


	<jsp:body>
	<form:form action="" method="post" commandName="cellphone">
	    <sec:csrfInput />
		<div>
			<label for="brand">品牌</label> 
			<form:input type="text" path="brand" id="brand"/>
			<form:errors path="brand" cssClass="field-error" />
		</div>
		<div>
			<label for="model">型号</label> 
			<form:input type="text" path="model" id="model"/>
			<form:errors path="model" cssClass="field-error" />
		</div>
		<div>
			<label for="os">操作</label> 
			<form:input type="text" path="os" id="os"/>
			<form:errors path="os" cssClass="field-error" />
		</div>
		<div>
			<label for="cpubrand">CPU</label> 
			<form:input type="text" path="cpubrand" id="cpubrand"/>
			<form:errors path="cpubrand" cssClass="field-error" />
		</div>
		<div>
			<label for="ram">内存</label> 
			<form:input type="text" path="ram" id="ram"/>
			<form:errors path="ram" cssClass="field-error" />
		</div>
		<div>
			<label for="storage">储存容量</label> 
			<form:input type="text" path="storage" id="storage"/>
			<form:errors path="storage" cssClass="field-error" />
		</div>
		<div>
			<label for="color">颜色</label> 
			<form:input type="text" path="color" id="color"/>
			<form:errors path="color" cssClass="field-error" />
		</div>
		<div>
			<label for="price">价格</label> 
			<form:input type="text" path="price" id="price"/>
			<form:errors path="price" cssClass="field-error" />
		</div>
		<div>
			<label for="description">描述</label>
			<form:textarea rows="3" cols="80" path="description" id="description"></form:textarea>
			<form:errors path="description" cssClass="field-error" />
		</div>
		<div>
			<button type="submit">确定</button>
		</div>

	</form:form>
	</jsp:body>
</t:layout>