<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/4
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<json:object>
    <json:property name="code" value="${code}"/>
    <json:property name="message">
        <spring:message code="${code}"/>
    </json:property>
    <json:array name="products" items="${products}" var="items">
        <json:property name="id" value="${items.id}"/>
        <json:property name="name" value="${items.name}"/>
        <json:property name="parentId" value="${items.parentId}"/>
        <json:property name="status" value="${items.status}"/>
        <json:property name="createAt" value="${items.createAt}"/>
        <json:property name="createBy" value="${items.createBy}"/>
    </json:array>
</json:object>