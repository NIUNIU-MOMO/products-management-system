<%--
  Created by IntelliJ IDEA.
  User: NIUNIU
  Date: 2020-2-2
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Products-Information</title>
    <script src="../../js/jquery-1.4.2.js" type="text/javascript"></script>
</head>
<body>
<script type="text/javascript">

    function analyseQueryResult(data) {
        var resultList = data.resultSet;
        var tbHead = "<tr>\n" +
            "<td align=\"center\" style='font-size: 2'>表号</td>\n" +
            "<td align=\"center\" style='font-size: 2'>检验编号</td>\n" +
            "<td align=\"center\" style='font-size: 2'>Qmax</td>\n" +
            "<td align=\"center\" style='font-size: 2'>Qmid</td>\n" +
            "<td align=\"center\" style='font-size: 2'>Qmin</td>\n" +
            "<td align=\"center\" style='font-size: 2'>压损</td>\n" +
            "<td align=\"center\" style='font-size: 2'>压损检验结果</td>\n" +
            "<td align=\"center\" style='font-size: 2'>大气压强</td>\n" +
            "<td align=\"center\" style='font-size: 2'>室温</td>\n" +
            "<td align=\"center\" style='font-size: 2'>相对湿度</td>\n" +
            "<td align=\"center\" style='font-size: 2'>检验人员</td>\n" +
            "<td align=\"center\" style='font-size: 2'>检验时间</td>\n" +
            "<td align=\"center\" style='font-size: 2'>制造厂商</td>\n" +
            "</tr>";
        var tbBody = "";
        $.each(resultList, function (i, item) {
            // alert(item == null ? "未查询到相关记录，请完善产品信息！" : "查询成功！");
            // console.log(item.meterNo);
            tbBody += "<tr>\n" +
                "<td align='center' style='font-size: 1'>" + item.meterNo + "</td>\n" +
                "<td align='center' style='font-size: 1'>" + item.testNo + "</td>\n" +
                "<td align='center' style='font-size: 1'>" + item.qmaxValue + "</td>\n" +
                "<td align='center' style='font-size: 1'>" + item.qmidValue + "</td>\n" +
                "<td align='center' style='font-size: 1'>" + item.qminValue + "</td>\n" +
                "<td align='center' style='font-size: 1'>" + item.pressureLoss + "</td>\n" +
                "<td align='center' style='font-size: 1'>" + item.pressurelossResult + "</td>\n" +
                "<td align='center' style='font-size: 1'>" + item.atmosphericPressure + "</td>\n" +
                "<td align='center' style='font-size: 1'>" + item.temperature + "</td>\n" +
                "<td align='center' style='font-size: 1'>" + item.relativeHumidity + "</td>\n" +
                "<td align='center' style='font-size: 1'>" + item.qualityInspector + "</td>\n" +
                "<td align='center' style='font-size: 1'>" + item.testTime + "</td>\n" +
                "<td align='center' style='font-size: 1'>" + item.manufacturer + "</td>\n" +
                "</tr>";
        });
        // var tbFoot = "<tr>\n" +
        //     "<td colspan='2' align='left' style='font-size: 2'>\n" +
        //     "共" + "<input style='width: 50' type='text' readonly='readonly' name='amout' value='" + data.amount + "'>" + "条记录\n" +
        //     "</td>\n" +
        //     "<td align='right' colspan='11' style='font-size: 2'>\n" +
        //     "<input type='button' value='上一页' name='prePage'>\n" +
        //     "第" + "<input  style='width: 30' type='text' readonly='readonly' name='currentPage' value='" + data.currentPage + "'>" + "页\n" +
        //     "<input type='button' value='下一页' name='nextPage'>\n" +
        //     "</td>\n" +
        //     "</tr>";

        $("#datas").append(tbHead).append(tbBody);
        $("input[name='amount']").attr("value", data.amount);
        $("input[name='currentPage']").attr("value", data.currentPage);
        $("input[name='totalPage']").attr("value", data.totalPage);
        // $("#footdatas").append(tbFoot);
    };

    $(function () {
        // 执行匹配
        $("#execMatch").click(function () {
            $.ajax({
                url: "/execMatch",
                type: "get",
                success: function (data) {
                    alert(data);
                },
                error: function () {
                    alert("查询失败！")
                }
            });
        });

        // 查询匹配结果
        $("input[name='execQuery']").click(function () {
            $.ajax({
                url: "/getProductsInformation",
                type: "get",
                success: function (data) {
                    $("#datas").text("");
                    // $("#footdatas").text("");
                    analyseQueryResult(data);
                },
                error: function () {
                    alert("查询失败！")
                }
            });
        });

        // 上一页
        $("input[name='prePage']").click(function () {
            var amount = $("input[name='amount']").attr("value");
            var currentPage = $("input[name='currentPage']").attr("value");
            var totalPage = $("input[name='totalPage']").attr("value");
            if (eval(currentPage) <= 1) {
                alert("没有上一页啦！")
            } else {
                $.ajax({
                    url: "/getPrePageProductsInformation",
                    type: "post",
                    data: {
                        amount: amount,
                        currentPage: currentPage,
                        totalPage: totalPage
                    },
                    success: function (data) {
                        $("#datas").text("");
                        analyseQueryResult(data);
                    }
                    ,
                    error: function () {
                        alert("查询失败！")
                    }
                });
            }
            ;

        });

        // 下一页
        $("input[name='nextPage']").click(function () {
            var amount = $("input[name='amount']").attr("value");
            var currentPage = $("input[name='currentPage']").attr("value");
            var totalPage = $("input[name='totalPage']").attr("value");
            if (eval(currentPage) >= eval(totalPage)) {
                alert("没有下一页啦！")
            } else {
                $.ajax({
                    url: "/getNextPageProductsInformation",
                    type: "get",
                    data: {
                        amount: amount,
                        currentPage: currentPage,
                        totalPage: totalPage
                    },
                    success: function (data) {
                        $("#datas").text("");
                        analyseQueryResult(data);
                    },
                    error: function () {
                        alert("查询失败！")
                    }
                });
            }
            ;
        });

        // 导出结果
        $("#execExport").click(function () {
            $.ajax({
                url:"/execExportProductsInformation",
                type:"get",
                success:function (data) {
                    alert(data);
                },
                error:function () {
                    alert("导出失败！")
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
                <span>1、在进行产品信息批量查询时，必须先在 "检验记录录入" —— "批量导入表号" 中，导入表号信息（Excel文件：Meter_No）</span><br>
                <span>2、导入表号信息后，点击 "执行匹配" ，匹配成功后点击 "查询匹配结果" 查看匹配结果</span><br>
                <span>3、点击 "导出" ，将查询结果导出为Excel文件到本地</span>
            </div>
            <div class="morebt">
                <h1 align="center">Products-Information</h1>
                <table bgcolor="#EEEEEE" bordercolor="#000000" border="2" cellspacing="0px" cellpadding="5px" align="center">
                    <tr>
                        <td>
                            <span>
                                已导入表号：${meterNoItems} 条
                            </span>
                        </td>
                        <td>
                            <input type="button" name="execMatch" id="execMatch" value="执行匹配">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="button" name="execQuery" id="execQuery" value="查询匹配结果">
                        </td>
                        <td>
                            <input type="button" name="execExport" id="execExport" value="导出">
                        </td>
                    </tr>
                </table>
                <div>
                    <table width="100%" bgcolor="#EEEEEE" bordercolor="#000000" border="2" cellspacing="0px"
                           cellpadding="5px" align="center" class="result-table" id="resultdatas">
                        <tr>
                            <strong>查询结果：</strong>
                        </tr>
                        <tr>
                            <td align="left" style='font-size: 2' colspan="4">
                                共
                                <input type="text" readonly="readonly" name="amount" style="width: 50px">
                                条记录，
                                共
                                <input type="text" readonly="readonly" name="totalPage" style="width: 50px">
                                页
                            </td>
                            <td align="rihlt" style='font-size: 2' colspan="9">
                                <input type="button" value="上一页" name="prePage" id="prePage" align="right">
                                第
                                <input type="text" readonly="readonly" name="currentPage" style="width: 30px"
                                       align="right">
                                页
                                <input type="button" value="下一页" name="nextPage" id="nextPage" align="right">
                            </td>
                        </tr>
                    </table>
                    <table width="100%" bgcolor="#EEEEEE" bordercolor="#000000" border="2" cellspacing="0px"
                           cellpadding="5px" align="center" class="memb-table" id="datas">
                        <%--                    <tr>--%>
                        <%--                        <td align="center" style='font-size: 2'>表号</td>--%>
                        <%--                        <td align="center" style='font-size: 2'>检验编号</td>--%>
                        <%--                        <td align="center" style='font-size: 2'>Qmax</td>--%>
                        <%--                        <td align="center" style='font-size: 2'>Qmid</td>--%>
                        <%--                        <td align="center" style='font-size: 2'>Qmin</td>--%>
                        <%--                        <td align="center" style='font-size: 2'>压损</td>--%>
                        <%--                        <td align="center" style='font-size: 2'>压损检验结果</td>--%>
                        <%--                        <td align="center" style='font-size: 2'>大气压强</td>--%>
                        <%--                        <td align="center" style='font-size: 2'>室温</td>--%>
                        <%--                        <td align="center" style='font-size: 2'>相对湿度</td>--%>
                        <%--                        <td align="center" style='font-size: 2'>检验人员</td>--%>
                        <%--                        <td align="center" style='font-size: 2'>检验时间</td>--%>
                        <%--                        <td align="center" style='font-size: 2'>制造厂商</td>--%>
                        <%--                    </tr>--%>
                        <%--                    <tr>--%>
                        <%--                        <td colspan="13" align="center">NULL</td>--%>
                        <%--                    </tr>--%>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <%@include file="foot.jsp" %>
</div>
</body>
</html>
