<%--
  Created by IntelliJ IDEA.
  User: NIUNIU
  Date: 2020-2-2
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Auto-Err-Value-Test</title>
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
                <h1 align="center">Auto-Err-Value-Test</h1>
                <form action="/import/autoErrValueTestFile" method="post" enctype="multipart/form-data">
                    <table width="100%" bgcolor="EEEEEE" bordercolor="000000" border="2"
                           cellspacing="0px" cellpadding="5px" align="center">
                        <tr>
                            <td colspan="2" align="center">
                                自动线示值误差检验记录录入
                            </td>
                        </tr>
                        <tr>
                            <td>
                                选择Excel文件：
                            </td>
                            <td>
                                <input type="file" name="autoErrValueTestFile" id="autoErrValueTestFile" value="选择文件">
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
                                <textarea readonly="readonly" rows="1" cols="50">执行${importAutoErrValueTestFileResult.result}，插入${importAutoErrValueTestFileResult.items}条数据</textarea>
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
