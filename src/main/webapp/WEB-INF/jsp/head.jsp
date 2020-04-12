<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/11/18
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE HTML>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/head.css"/>
<meta http-equiv="Content-type" content="text/html; charset=UTF-8" />

<div id="common_head">
    <div id="line1">
        <div id="content">
                <a>${sessionScope.systemuser.getUserName()}</a>&nbsp;&nbsp;|&nbsp;&nbsp;
                <a href="${pageContext.request.contextPath}/quit.do">退出</a>
        </div>
    </div>
    <div id="line3">
        <div id="content2">

        </div>
    </div>
</div>