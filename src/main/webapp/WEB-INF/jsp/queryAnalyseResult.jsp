<%--
  Created by IntelliJ IDEA.
  User: NIUNIU
  Date: 2020-2-2
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Analyse-Result</title>
    <script src="../../js/jquery-1.4.2.js" type="text/javascript"></script>
</head>
<body>
<script type="text/javascript">

    // 处理查询结果返回的数据
    function analyseQueryResult(data) {
        var resultList = data.resultSet;
        var tbHead = "<tr>\n" +
            "<td align=\"center\" style='font-size: 2'>表号</td>\n" +
            "<td align=\"center\" style='font-size: 2'>检验编号</td>\n" +
            "<td align=\"center\" style='font-size: 2'>QMAX_QC</td>\n" +
            "<td align=\"center\" style='font-size: 2'>QMID_QC</td>\n" +
            "<td align=\"center\" style='font-size: 2'>QMAX_JBS</td>\n" +
            "<td align=\"center\" style='font-size: 2'>QMID_JBS</td>\n" +
            "<td align=\"center\" style='font-size: 2'>QMAX_ERR</td>\n" +
            "<td align=\"center\" style='font-size: 2'>QMID_ERR</td>\n" +
            "</tr>";
        var tbBody = "";
        $.each(resultList, function (i, item) {
            tbBody += "<tr>\n" +
                "<td align='center' style='font-size: 1'>" + item.meterNo + "</td>\n" +
                "<td align='center' style='font-size: 1'>" + item.testNo + "</td>\n" +
                "<td align='center' style='font-size: 1'>" + item.qmaxQc + "</td>\n" +
                "<td align='center' style='font-size: 1'>" + item.qmidQc + "</td>\n" +
                "<td align='center' style='font-size: 1'>" + item.qmaxJbs + "</td>\n" +
                "<td align='center' style='font-size: 1'>" + item.qmidJbs + "</td>\n" +
                "<td align='center' style='font-size: 1'>" + item.qmaxErr + "</td>\n" +
                "<td align='center' style='font-size: 1'>" + item.qmidErr + "</td>\n" +
                "</tr>";
        });
        $("#results").append(tbHead).append(tbBody);
        $("input[name='amount']").attr("value", data.amount);
        $("input[name='currentPage']").attr("value", data.currentPage);
        $("input[name='totalPage']").attr("value", data.totalPage);
        // $("#footdatas").append(tbFoot);
    };

    $(function () {
        // 执行匹配V1
        $("input[name='execMatchV1']").click(function () {
            $.ajax({
                url: "/execMatchV1",
                type: "get",
                success: function (data) {
                    alert(data);
                },
                error: function () {
                    alert(data);
                }
            });
        });

        // 执行匹配V2
        $("input[name='execMatchV2']").click(function () {
            $.ajax({
                url: "/execMatchV2",
                type: "get",
                success: function (data) {
                    alert(data);
                },
                error: function () {
                    alert(data);
                }
            });
        });

        // 查询匹配结果
        $("input[name='execQuery']").click(function () {
            $.ajax({
                url: "/getAnalyseResult",
                type: "get",
                success: function (data) {
                    $("#results").text("");
                    analyseQueryResult(data);
                },
                error: function () {
                    alert("查询失败");
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
                    url: "/getPrePagetesterrvalueanalyse",
                    type: "post",
                    data: {
                        amount: amount,
                        currentPage: currentPage,
                        totalPage: totalPage
                    },
                    success: function (data) {
                        $("#results").text("");
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
                    url: "/getNextPagetesterrvalueanalyse",
                    type: "get",
                    data: {
                        amount: amount,
                        currentPage: currentPage,
                        totalPage: totalPage
                    },
                    success: function (data) {
                        $("#results").text("");
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
                url:"/execExportErrValueAnalyse",
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
                <span>1、在查询检验数据对比结果前，先在 "检验记录录入" —— "外部检验记录" 中导入外部的检验数据文件</span><br>
                <span>2、"外部检验记录V1" ： 示值误差大中小流量数据是分开的</span><br>
                <span>3、"外部检验记录V2" ： 示值误差大中小流量数据都在同一列中</span><br>
                <span>4、外部检验数据录入完成后，点击 "执行查询" ，查看查询结果</span><br>
                <span>5、点击 "导出" ，将查询结果导出为Excel文件到本地</span><br>
                <span>6、☆☆ 数据检验结果导出后，必须将结果剪切出此路径。否则下一次导出的结果将会覆盖本次导出的结果</span>
            </div>
            <div class="morebt">
                <h1 align="center">Analyse-Result</h1>
                <table bgcolor="#EEEEEE" bordercolor="#000000" border="2" cellspacing="0px" cellpadding="5px"
                       align="center">
                    <tr>
                        <td>
                            <span>
                                已导入外部检验记录V1数据：${tempTestDataV1Items}条
                            </span>
                        </td>
                        <td>
                            <input type="button" value="执行匹配V1" name="execMatchV1" id="execMatchV1"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span>
                                已导入外部检验记录V2数据：${tempTestDataV2Items}条
                            </span>
                        </td>
                        <td>
                            <input type="button" value="执行匹配V2" name="execMatchV2" id="execMatchV2"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="button" value="查询匹配结果" name="execQuery" id="execQuery"/>
                        </td>
                        <td >
                            <input type="button" value="导出" name="execExport" id="execExport"/>
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
                                <input type="button" value="上一页" name="prePage" id="prePage" align="right"/>
                                第
                                <input type="text" readonly="readonly" name="currentPage" style="width: 30px"
                                       align="right"/>
                                页
                                <input type="button" value="下一页" name="nextPage" id="nextPage" align="right"/.
                                >
                            </td>
                        </tr>
                    </table>
                    <table width="100%" bgcolor="#EEEEEE" bordercolor="#000000" border="2" cellspacing="0px"
                           cellpadding="5px" align="center" class="memb-table" id="results">

                    </table>
                </div>
            </div>
        </div>
    </div>
    <%@include file="foot.jsp" %>
</div>
</body>
</html>
