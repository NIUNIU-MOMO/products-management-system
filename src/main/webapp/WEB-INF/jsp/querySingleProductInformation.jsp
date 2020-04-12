<%--
  Created by IntelliJ IDEA.
  User: NIUNIU
  Date: 2020-2-2
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Single-Product-Information</title>
    <script src="../../js/jquery-1.4.2.js" type="text/javascript"></script>
</head>
<body>
<script type="text/javascript">
    $(function () {
        // var formdata = new FormData(document.getElementById("upload-form"));
        $("input[name='submit']").click(function () {
            // console.log($("input[name='meterNoFile']").val());
            $.ajax({
                url: "/getSingleMeterInformation",
                type: "post",
                // dataType:"jason",
                data: {
                    "meterNo": $("input[name='meterNo']").val(),
                    // meterNoFile: $("input[name='meterNoFile']").val()
                },
                success: function (data) {
                    // console.log(data);
                    // alert(data);
                    $.each(data, function (i, item) {
                        $("#datas").text("");
                        console.log(item);
                        alert(item == null ? "未查询到相关记录，请完善产品信息！" : "查询成功！");
                        var tbBody = "<tr>\n" +
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
                        $("#datas").append(tbBody);
                    })
                },
                error: function () {
                    alert("查询失败！");
                }
            })
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
                <span>1、输入表号，点击 "查询"</span><br>
            </div>
            <div class="morebt">
                <h1 align="center">Single-Product-Information</h1>
                <form id="upload-form" method="post" action="/getMeterInformation">
                    <table bgcolor="#EEEEEE" bordercolor="#000000" border="2" cellspacing="0px" cellpadding="5px"
                           align="center">
                        <tr>
                            <td>
                                表号：
                            </td>
                            <td>
                                <input type="text" name="meterNo" id="meterNo">
                            </td>
                            <td>
                                <input type="button" value="查询" name="submit">
                            </td>
                        </tr>
                        <%--                        <tr>--%>
                        <%--                            <td>--%>
                        <%--                                许多表号：--%>
                        <%--                            </td>--%>
                        <%--                            <td >--%>
                        <%--                                <input type="file" name="meterNoFile" id="meterNoFile">--%>
                        <%--                            </td>--%>
                        <%--                        </tr>--%>
                        <%--                        <tr>--%>
                        <%--                            <td colspan="2" align="center">--%>
                        <%--                                <input type="button" value="查询" name="submit">--%>
                        <%--                            </td>--%>
                        <%--                        </tr>--%>
                    </table>
                </form>
                <h3 align="left"><strong>查询结果</strong></h3>
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
                </table>
            </div>
        </div>
    </div>
    <%@include file="foot.jsp" %>
</div>
</body>
</html>
