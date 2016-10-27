<%-- 

Copyright © 2016 Aaron Smith & Xenia Zantello

--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/header.html" %>
    <body>
        <jsp:useBean id="user" scope="request" class="homework2.user.User"/>
        <label>Investment Amount:</label> <span><fmt:setLocale value="en_US"/><fmt:formatNumber value="${user.amount}" type="currency"/></span><br>
    <label>Yearly Interest Rate:</label> <span><fmt:setLocale value="en_US"/><fmt:formatNumber minFractionDigits="1" maxFractionDigits="3" value="${user.rate / 100}" type="percent"/></span><br>
    <label>Number of Years:</label> <span><jsp:getProperty name="user" property="year"/></span><br>
    <label id="future">Future Value: </label> <span></span>
    

    
 <%@ include file="/footer.html" %>