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
    <title>System-Table-Items</title>
    <script src="../../js/jquery-1.4.2.js" type="text/javascript"></script>
    <meta http-equiv="Content-Type" content="multipart/form-data; charset=utf-8"/>
</head>
<body>
<script type="text/javascript">
    $(function () {
        // 成品检验记录 删除最近一次更新数据
        $("#delRecentProdectTest").click(function () {
            $.ajax({
                url:"/delRecentProdectTest",
                type:"get",
                success:function (data) {
                    alert(data.maintenanceTesult + "删除记录：" + data.deleteItems + "条");
                    $("#productTest").attr("value",data.remainItems);
                },
                error:function () {
                    alert("执行失败");
                }
            });
        });

        // 检验室检验记录 删除最近一次更新数据
        $("#delRecentErrValueTest").click(function () {
            $.ajax({
                url:"/delRecentErrValueTest",
                type:"get",
                success:function (data) {
                    alert(data.maintenanceTesult + "删除记录：" + data.deleteItems + "条");
                    $("#errValueTest").attr("value",data.remainItems);
                },
                error:function () {
                    alert("执行失败");
                }
            });
        });

        // 自动线检验记录 删除最近一次更新数据
        $("#delRecentAutoErrValueTest").click(function () {
            $.ajax({
                url:"/delRecentAutoErrValueTest",
                type:"get",
                success:function (data) {
                    alert(data.maintenanceTesult + "删除记录：" + data.deleteItems + "条");
                    $("#autoErrValueTest").attr("value",data.remainItems);
                },
                error:function () {
                    alert("执行失败");
                }
            });
        });

        //清空表号信息记录
        $("#truncateMeterNo").click(function () {
            $.ajax({
                url:"/truncateMeterNo",
                type:"get",
                success:function (data) {
                    alert(data.maintenanceTesult);
                    $("#meterNo").attr("value",data.remainItems);
                },
                error:function () {
                    alert("执行失败");
                }
            });
        });

        //清空外部检验记录V1
        $("#truncateTempDataV1").click(function () {
            $.ajax({
                url:"/truncateTempDataV1",
                type:"get",
                success:function (data) {
                    alert(data.maintenanceTesult);
                    $("#tempTestDataV1").attr("value",data.remainItems);
                },
                error:function () {
                    alert("执行失败");
                }
            });
        });

        //清空外部检验记录V2
        $("#truncateTempDataV2").click(function () {
            $.ajax({
                url:"/truncateTempDataV2",
                type:"get",
                success:function (data) {
                    alert(data.maintenanceTesult);
                    $("#tempTestDataV2").attr("value",data.remainItems);
                },
                error:function () {
                    alert("执行失败");
                }
            });
        });

        //清空产品信息查询结果
        $("#truncateMeterInformation").click(function () {
            $.ajax({
                url:"/truncateMeterInformation",
                type:"get",
                success:function (data) {
                    alert(data.maintenanceTesult);
                    $("#meterInformation").attr("value",data.remainItems);
                },
                error:function () {
                    alert("执行失败");
                }
            });
        });

        //清空外部检验数据对比结果
        $("#truncateTestErrValueAnalyse").click(function () {
            $.ajax({
                url:"/truncateTestErrValueAnalyse",
                type:"get",
                success:function (data) {
                    alert(data.maintenanceTesult);
                    $("#testErrValueAnalyse").attr("value",data.remainItems);
                },
                error:function () {
                    alert("执行失败");
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
                <span>1、"删除最近一次更新"只能删除最近一次更新且 "未保存" 状态的数据</span><br>
                <span>2、"删除最近一次更新"不能删除上上次，或者更之前更新的数据</span><br>
                <span>3、"清空"将会清空表中所有的数据</span><br>
                <span>4、除去"成品检验记录"、"检验室检验记录"、"自动线检验记录"，其余都是临时表，表中的数据是可以清空的</span><br>
                <span>5、在每次执行新的查询和计算之前必须先将"表号信息记录"、"外部检验数据V1"和"外部检验数据V2" 表中的数据清空</span><br>
                <span>6、"产品信息查询结果"和"外部检验数据对比结果" 在执行查询和计算时，会覆盖上一次的数据，不是必须清空</span><br>
            </div>
            <div class="morebt">
                <h1 align="center">System-Table-Items</h1>
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
                                条数
                            </strong>
                        </td>
                        <td>
                            <strong>
                                操作
                            </strong>
                        </td>
                    </tr>
                    <tr>
                        <td>成品检验记录</td>
                        <td>T_PRODUCTTEST</td>
                        <td>
                            <input type="text" name="productTest" id="productTest" value="${tableCountResult.product}" readonly="readonly">
                        </td>
                        <td>
                            <input type="button" name="delRecentProdectTest" id="delRecentProdectTest" value="删除最近一次更新" >
                        </td>
                    </tr>
                    <tr>
                        <td>检验室检验记录</td>
                        <td>T_ERRVALUETEST</td>
                        <td>
                            <input type="text" name="errValueTest" id="errValueTest" value="${tableCountResult.errValue}" readonly="readonly">
                        </td>
                        <td>
                            <input type="button" name="delRecentErrValueTest" id="delRecentErrValueTest" value="删除最近一次更新">
                        </td>
                    </tr>
                    <tr>
                        <td>自动线检验记录</td>
                        <td>T_AUTOERRVALUETEST</td>
                        <td>
                            <input type="text" name="autoErrValueTest" id="autoErrValueTest" value="${tableCountResult.autoErrValue}" readonly="readonly">
                        </td>
                        <td>
                            <input type="button" name="delRecentAutoErrValueTest" id="delRecentAutoErrValueTest" value="删除最近一次更新">
                        </td>
                    </tr>
                    <tr>
                        <td>表号信息记录</td>
                        <td>T_METERNO</td>
                        <td>
                            <input type="text" name="meterNo" id="meterNo" value="${tableCountResult.meterNo}" readonly="readonly">
                        </td>
                        <td>
                            <input type="button" name="truncateMeterNo" id="truncateMeterNo" value="清空">
                        </td>
                    </tr>

                    <tr>
                        <td>外部检验数据V1</td>
                        <td>T_TEMPTESTDATAV1</td>
                        <td>
                            <input type="text" name="tempTestDataV1" id="tempTestDataV1" value="${tableCountResult.tempDataV1}" readonly="readonly">
                        </td>
                        <td>
                            <input type="button" name="truncateTempDataV1" id="truncateTempDataV1" value="清空">
                        </td>
                    </tr>
                    <tr>
                        <td>外部检验数据V2</td>
                        <td>T_TEMPTESTDATAV2</td>
                        <td>
                            <input type="text" name="tempTestDataV2" id="tempTestDataV2" value="${tableCountResult.tempDataV2}" readonly="readonly">
                        </td>
                        <td>
                            <input type="button" name="truncateTempDataV2" id="truncateTempDataV2" value="清空">
                        </td>
                    </tr>
                    <tr>
                        <td>产品信息查询结果</td>
                        <td>T_METERINFORMATION</td>
                        <td>
                            <input type="text" name="meterInformation" id="meterInformation" value="${tableCountResult.meterInformation}" readonly="readonly">
                        </td>
                        <td>
                            <input type="button" name="truncateMeterInformation" id="truncateMeterInformation" value="清空">
                        </td>
                    </tr>
                    <tr>
                        <td>外部检验数据对比结果</td>
                        <td>T_TESTERRVALUEANALYSE</td>
                        <td>
                            <input type="text" name="testErrValueAnalyse" id="testErrValueAnalyse" value="${tableCountResult.errValueAnalyse}" readonly="readonly">
                        </td>
                        <td>
                            <input type="button" name="truncateTestErrValueAnalyse" id="truncateTestErrValueAnalyse" value="清空">
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
