<%--
  Created by IntelliJ IDEA.
  User: NIUNIU
  Date: 2020-2-2
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Product-Test</title>
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
                <h1 align="center">Product-Test</h1>
                <form action="/import/productTestFile" method="post" enctype="multipart/form-data">
                    <table width="100%" bgcolor="EEEEEE" bordercolor="000000" border="2"
                           cellspacing="0px" cellpadding="5px" align="center">
                        <tr>
                            <td colspan="2" align="center">
                                成品检验记录录入
                            </td>
                        </tr>
                        <tr>
                            <td>
                                选择Excel文件：
                            </td>
                            <td>
                                <input type="file" name="productTestFile" id="productTestFile" value="选择文件">
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
                                <textarea readonly="readonly" rows="1" cols="50">执行${importProductTestFileResult.result}，插入${importProductTestFileResult.items}条数据</textarea>
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
