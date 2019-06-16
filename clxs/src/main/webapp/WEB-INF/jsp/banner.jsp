<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/4
  Time: 19:53
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
    <json:object name="date">
            <json:property name="id" value="${banner.id}"/>
            <json:property name="url" value="${banner.url}"/>
            <json:property name="img" value="${banner.img}"/>
            <json:property name="status" value="${banner.status}"/>
            <json:property name="createAt" value="${banner.createAt}"/>
            <json:property name="createBy" value="${banner.createBy}"/>
            <json:property name="updateAt" value="${banner.updateAt}"/>
            <json:property name="updateBy" value="${banner.updateBy}"/>
    </json:object>
</json:object>

