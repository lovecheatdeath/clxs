<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/4
  Time: 20:23
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
        <json:object name="work">
            <json:property name="id" value="${work.id}"/>
            <json:property name="parentId" value="${work.parentId}"/>
            <json:property name="name" value="${work.name}"/>
            <json:property name="status" value="${work.status}"/>
            <json:property name="introduce" value="${work.img}"/>
            <json:property name="minipicture" value="${work.article}"/>
            <json:property name="createAt" value="${work.createAt}"/>
            <json:property name="createBy" value="${work.createBy}"/>
            <json:property name="updateAt" value="${work.updateAt}"/>
            <json:property name="updateBy" value="${work.updateBy}"/>
        </json:object>
</json:object>