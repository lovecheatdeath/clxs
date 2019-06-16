<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/4
  Time: 17:13
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
    <json:object name="product">
        <json:property name="id" value="${product.id}"/>
        <json:property name="parentId" value="${product.parentId}"/>
        <json:property name="name" value="${product.name}"/>
        <json:property name="status" value="${product.status}"/>
        <json:property name="createAt" value="${product.createAt}"/>
        <json:property name="createBy" value="${product.createBy}"/>
        <json:property name="updateAt" value="${product.updateAt}"/>
        <json:property name="updateBy" value="${product.updateBy}"/>
        <json:property name="introduce" value="${product.introduce}"/>
        <json:property name="minipicture" value="${product.minipicture}"/>
        <json:property name="video" value="${product.videoUrl}"/>
        <json:property name="picture" value="${product.picture}"/>
        <json:property name="article" value="${product.article}"/>
        </json:object>
</json:object>