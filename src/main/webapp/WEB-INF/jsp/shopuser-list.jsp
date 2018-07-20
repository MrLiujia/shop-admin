<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<t:layout title="用户列表">
  <table>
    <tr>
      <th>用户名</th>
      <th>最后一次登录时间</th>
    </tr>
    <c:forEach items="${shopusers}" var="shopuser">
      <tr>
        <td>${shopuser.username}</td>
        <td>
          <fmt:formatDate value="${shopuser.lastTime}" 
                          pattern="yyyy-MM-dd HH:mm:ss"/>
        </td>
      </tr>
    </c:forEach>
  </table>
</t:layout>
