<%--
  Created by IntelliJ IDEA.
  User: NIUNIU
  Date: 2020-2-2
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <link href="../../css/managementsystem.css" rel="stylesheet" type="text/css"/>
    <link href="../../css/ks.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="leftbox">
    <div class="l_nav2">
        <div class="ta1">
            <strong>产品信息查询</strong>
            <div class="leftbgbt"></div>
        </div>
        <div class="cdlist">
            <div>
                <a href="/query/singleproduct_information">产品信息单个查询</a></div>
            <div>
                <a href="/query/products_information">产品信息批量查询</a></div>
            <div>
                <a href="/query/analyse_result">检验数据对比结果查询</a></div>
        </div>
        <div class="ta1">
            <strong>检验记录录入</strong>
            <div class="leftbgbt2"></div>
        </div>
        <div class="cdlist">
            <div>
                <a href="/forward/ErrValueTest">检验室检验记录</a></div>
            <div>
                <a href="/forward/AutoErrValueTest">自动线检验记录</a></div>
            <div>
                <a href="/forward/ProductTest">成品检验记录</a></div>
            <div>
                <a href="/forward/TempTestDataV1">外部检验记录v1</a></div>
            <div>
                <a href="/forward/TempTestDataV2">外部检验记录v2</a></div>
            <div>
                <a href="/forward/MeterNo">批量导入表号</a></div>
        </div>
        <div class="ta1">
            <strong>系统数据维护</strong>
            <div class="leftbgbt2"></div>
        </div>
        <div class="cdlist">
            <div>
                <a href="/maintenance/systemTable_items">系统数据记录维护</a></div>
            <div>
                <a href="/maintenance/systemRecord_items">系统数据保存和清除</a></div>
        </div>
    </div>
</div>
</body>
</html>
