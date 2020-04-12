<%--
  Created by IntelliJ IDEA.
  User: NIUNIU
  Date: 2020-2-2
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Temp-Test-DataV1</title>
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
                <h1 align="center">Temp-Test-DataV1</h1>
                <form action="/import/tempTestDataV1File" method="post" enctype="multipart/form-data">
                    <table width="100%" bgcolor="EEEEEE" bordercolor="000000" border="2"
                           cellspacing="0px" cellpadding="5px" align="center">
                        <tr>
                            <td colspan="2" align="center">
                                外部检验记录V1录入
                            </td>
                        </tr>
                        <tr>
                            <td>
                                选择Excel文件：
                            </td>
                            <td>
                                <input type="file" name="tempTestDataV1File" id="tempTestDataV1File" value="选择文件">
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <input type="submit" value="导入" id="upload">
                            </td>
                        </tr>
                        <tr>
                            <td rowspan="2">
                                结果：
                            </td>
                            <td rowspan="2">
                                <input type="text" readonly="readonly" value="">
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </div>
<%@include file="foot.jsp" %>
</div>
</body>
</html>
