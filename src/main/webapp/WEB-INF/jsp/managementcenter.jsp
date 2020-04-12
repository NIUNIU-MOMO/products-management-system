<%--
  Created by IntelliJ IDEA.
  User: NIUNIU
  Date: 2020-2-2
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Product Management System</title>
    <link href="../../css/managementsystem.css" rel="stylesheet" type="text/css"/>
    <link href="../../css/ks.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<%@include file="head.jsp" %>
<div class="page">
    <div class="box mtop">
        <%@include file="menu.jsp" %>
        <div class="rightbox">
            <h2 class="mbx">
                NERV -- 產品追溯計劃
            </h2>
            <div class="morebt">
                <div class="dhbg">
                    <div class="dh1" style="margin: 0 15px 5px 0;">
                        <div class="dhwz">
                            <a>
                                <img src="../../images/managementcenter/EVA-01.jpg" width="300" height="200"/>
                            </a>
                        </div>
                    </div>
                    <div class="dh2">
                        <div class="dhwz">
                            <a>
                                <img src="../../images/managementcenter/EVA-02.jpg" width="300" height="200"/>
                            </a>
                        </div>
                    </div>
                    <div class="dh3" style="margin: 0 15px 5px 0;">
                        <div class="dhwz">
                            <a>
                                <img src="../../images/managementcenter/EVA-03.jpg" width="300" height="200"/>
                            </a>
                        </div>
                    </div>
                    <div class="dh4">
                        <div class="dhwz">
                            <a>
                                <img src="../../images/managementcenter/EVA-04.jpg" width="300" height="200"/>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
<%@include file="foot.jsp" %>
</div>
</body>
</html>
