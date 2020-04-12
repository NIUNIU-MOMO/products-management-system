<%--
  Created by IntelliJ IDEA.
  User: NIUNIU
  Date: 2020-2-2
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>System-Data-Save-Or-Clear</title>
    <script src="../../js/jquery-1.4.2.js" type="text/javascript"></script>
    <meta http-equiv="Content-Type" content="multipart/form-data; charset=utf-8"/>
</head>
<body>
<script type="text/javascript">
    $(function () {
        // 保存成品检验记录
        $("#saveProductTest").click(function () {
            $.ajax({
                url:"/saveProductTest",
                type:"get",
                success:function (data) {
                    alert("保存成功！");
                    $("#productTestSavedItems").attr("value",data.savedItems);
                    $("#productTestUnSavedItems").attr("value",data.unsavedItems);
                },
                error:function () {
                    alert("保存失败！");
                }
            });
        });

        // 保存检验室检验记录
        $("#saveErrValueTest").click(function () {
            $.ajax({
                url:"/saveErrValueTest",
                type:"get",
                success:function (data) {
                    alert("保存成功！");
                    $("#errValueTestSavedItems").attr("value",data.savedItems);
                    $("#errValueTestUnSavedItems").attr("value",data.unsavedItems);
                },
                error:function () {
                    alert("保存失败！");
                }
            });
        });

        // 保存自动线检验记录
        $("#saveAutoErrValueTest").click(function () {
            $.ajax({
                url:"/saveAutoErrValueTest",
                type:"get",
                success:function (data) {
                    alert("保存成功！");
                    $("#autoErrValueTestSavedItems").attr("value",data.savedItems);
                    $("#autoErrValueTestUnSavedItems").attr("value",data.unsavedItems);
                },
                error:function () {
                    alert("保存失败！");
                }
            });
        });

        // 删除成品检验记录
        $("#clearUnSaveProductTest").click(function () {
            $.ajax({
                url:"/clearUnSaveProductTest",
                type:"get",
                success:function (data) {
                    alert("删除成功！");
                    $("#productTestSavedItems").attr("value",data.savedItems);
                    $("#productTestUnSavedItems").attr("value",data.unsavedItems);
                },
                error:function () {
                    alert("删除失败！");
                }
            });
        });

        // 删除检验室检验记录
        $("#clearUnSaveErrValueTest").click(function () {
            $.ajax({
                url:"/clearUnSaveErrValueTest",
                type:"get",
                success:function (data) {
                    alert("删除成功！");
                    $("#errValueTestSavedItems").attr("value",data.savedItems);
                    $("#errValueTestUnSavedItems").attr("value",data.unsavedItems);
                },
                error:function () {
                    alert("删除失败！");
                }
            });
        });

        // 删除自动线检验记录
        $("#clearUnSaveAutoErrValueTest").click(function () {
            $.ajax({
                url:"/clearUnSaveAutoErrValueTest",
                type:"get",
                success:function (data) {
                    alert("删除成功！");
                    $("#autoErrValueTestSavedItems").attr("value",data.savedItems);
                    $("#autoErrValueTestUnSavedItems").attr("value",data.unsavedItems);
                },
                error:function () {
                    alert("删除失败！");
                }
            });
        });





    });
</script>
<%@include file="head.jsp" %>
<div class="page">
    <div class="box mtop">
        <%@include file="menu.jsp" %>
        <div class="rightbox">
            <h2 class="mbx">
                NERV -- 產品追溯計劃
            </h2>
            <div style="color:red ;font-size: xx-small">
                <span>注意事项：</span><br>
                <span>1、检验记录导入系统后都是 "未保存" 的状态</span><br>
                <span>2、"未保存" 状态并不影响检验数据的匹配和对比计算</span><br>
                <span>3、确认导入的检验记录信息准确无误后，点击 "保存未保存记录" 来将其状态修改为 "已保存" 的状态</span><br>
                <span>4、"已保存" 状态的记录无法更改或删除，"未保存" 状态的记录可以删除</span><br>
                <span>5、"未保存" 状态的记录在确认信息正确后必须保存，否则在删除 "未保存" 状态记录的时候会将这些记录全部删除！！！</span><br>
            </div>
            <div class="morebt">
                <h1 align="center">System-Data-Save-Or-Clear</h1>
                <table width="100%" bgcolor="EEEEEE" bordercolor="000000" border="2"
                       cellspacing="0px" cellpadding="5px" align="center">
                    <tr>
                        <td>
                            <strong>
                                记录
                            </strong>
                        </td>
                        <td>
                            <strong>
                                表名
                            </strong>
                        </td>
                        <td>
                            <strong>
                                保存记录数
                            </strong>
                        </td>
                        <td>
                            <strong>
                                未保存记录数
                            </strong>
                        </td>
                        <td colspan="2">
                            <strong>
                                操作
                            </strong>
                        </td>
                    </tr>

                    <tr>
                        <td style='font-size: 2'>成品检验记录</td>
                        <td style='font-size: 2'>T_PRODUCTTEST</td>
                        <td style='font-size: 2'>
                            <input type="text" name="productTestSavedItems" id="productTestSavedItems" value="${systemRecordItems.productSavedItems}" readonly="readonly"/>
                        </td>
                        <td style='font-size: 2'>
                            <input type="text" name="productTestUnSavedItems" id="productTestUnSavedItems" value="${systemRecordItems.productUnSavedItems}" readonly="readonly"/>
                            <a name="queryProductTest" id="queryProductTest" href="">查看</a>
                        </td>
                        <td style='font-size: 2'>
                            <input type="button" name="saveProductTest" id="saveProductTest" value="保存未保存记录"/>
                            <input type="button" name="clearUnSaveProductTest" id="clearUnSaveProductTest" value="删除未保存记录"/>
                        </td>
                    </tr>

                    <tr>
                        <td style='font-size: 2'>检验室检验记录</td>
                        <td style='font-size: 2'>T_ERRVALUETEST</td>
                        <td style='font-size: 2'>
                            <input type="text" name="errValueTestSavedItems" id="errValueTestSavedItems" value="${systemRecordItems.errValueSavedItems}" readonly="readonly"/>
                        </td>
                        <td style='font-size: 2'>
                            <input type="text" name="errValueTestUnSavedItems" id="errValueTestUnSavedItems" value="${systemRecordItems.errValueUnSavedItems}" readonly="readonly"/>
                            <a name="queryErrValueTest" id="queryErrValueTest" href="">查看</a>
                        </td>
                        <td style='font-size: 2'>
                            <input type="button" name="saveErrValueTest" id="saveErrValueTest" value="保存未保存记录"/>
                            <input type="button" name="clearUnSaveErrValueTest" id="clearUnSaveErrValueTest" value="删除未保存记录"/>
                        </td>
                    </tr>

                    <tr>
                        <td style='font-size: 2'>自动线检验记录</td>
                        <td style='font-size: 2'>T_AUTOERRVALUETEST</td>
                        <td style='font-size: 2'>
                            <input type="text" name="autoErrValueTestSavedItems" id="autoErrValueTestSavedItems" value="${systemRecordItems.autoErrValueSavedItems}" readonly="readonly"/>
                        </td>
                        <td style='font-size: 2'>
                            <input type="text" name="autoErrValueTestUnSavedItems" id="autoErrValueTestUnSavedItems" value="${systemRecordItems.autoErrValueUnSavedItems}" readonly="readonly"/>
                            <a name="queryAutoErrValueTest" id="queryAutoErrValueTest" href="">查看</a>
                        </td>
                        <td style='font-size: 2'>
                            <input type="button" name="saveAutoErrValueTest" id="saveAutoErrValueTest" value="保存未保存记录"/>
                            <input type="button" name="clearUnSaveAutoErrValueTest" id="clearUnSaveAutoErrValueTest" value="删除未保存记录"/>
                        </td>
                    </tr>

                </table>
            </div>
        </div>
    </div>
    <%@include file="foot.jsp" %>
</div>
</body>
</html>
