package com.lfy.management.utils;

import com.lfy.management.entity.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class PackagingUtils {

    private PackagingUtils() {
    }

    // 封装许多表号
    public static List<MeterNo> packagingMeterNo(List<List<Object>> lists) {
        List<MeterNo> meterNoList = new ArrayList<>();
        for (int i = 0; i < lists.size(); i++) {
            List<Object> meterNo = lists.get(i);
            meterNoList.add(
                    new MeterNo(meterNo.get(0).toString())
            );
        }
//        System.out.println(meterNoList);
        return meterNoList;
    }

    // 检验室检验记录
    public static List<ErrValueTest> packagingErrValueTest(List<List<Object>> lists) {
        List<ErrValueTest> errValueTestList = new ArrayList<>();
        for (int i = 0; i < lists.size(); i++) {
            List<Object> errValueTest = lists.get(i);
//            System.out.println("errValueTest : " + errValueTest);
            errValueTestList.add(
                    new ErrValueTest(
                            errValueTest.get(0).toString(), // testNo
                            errValueTest.get(1).toString(), // benchNo
                            errValueTest.get(2).toString(), // certificateNo
                            errValueTest.get(3).toString(), // meterNo
                            errValueTest.get(4).toString(), // insideTightnessNo
                            Double.valueOf(errValueTest.get(5).toString()), // qmaxValue
                            Double.valueOf(errValueTest.get(6).toString()), // qmidValue
                            Double.valueOf(errValueTest.get(7).toString()), // qminValue
                            errValueTest.get(8).toString(), // printWheel
                            errValueTest.get(9).toString(), // direction
                            errValueTest.get(10).toString(), // tightnessResult
                            errValueTest.get(11).toString(), // pressureLoss
                            errValueTest.get(12).toString(), // pressurelossResult
                            errValueTest.get(13).toString(), // finallyResult
                            errValueTest.get(14).toString(), // linearResult
                            errValueTest.get(15).toString(), // repetitiveResult
                            errValueTest.get(16).toString(), // atmosphericPressure
                            errValueTest.get(17).toString(), // testTime
                            Integer.valueOf(errValueTest.get(18).toString()), // meterOrder
                            errValueTest.get(19).toString(), // models
                            errValueTest.get(20).toString(), // defect
                            Double.valueOf(errValueTest.get(21).toString()), // temperature
                            Double.valueOf(errValueTest.get(22).toString()), // relativeHumidity
                            errValueTest.get(23).toString(), // qualityInspector
                            errValueTest.get(24).toString(), // manufacturer
                            errValueTest.get(25).toString()  // remarks
                    )
            );
        }
//        System.out.println("errValueTestList : " + errValueTestList);
        return errValueTestList;
    }

    // 自动线检验记录
    public static List<AutoErrValueTest> packagingAutoErrValueTest(List<List<Object>> lists) {
        List<AutoErrValueTest> autoErrValueTestList = new ArrayList<>();
        for (int i = 0; i < lists.size(); i++) {
            List<Object> autoErrValueTest = lists.get(i);
//            System.out.println(autoErrValueTest);
            autoErrValueTestList.add(
                    new AutoErrValueTest(
                            autoErrValueTest.get(0).toString(),    // firstorSecond
                            autoErrValueTest.get(1).toString(),    // equipNum
                            autoErrValueTest.get(2).toString(),    // stationNum
                            autoErrValueTest.get(3).toString(),    // transTime
                            autoErrValueTest.get(4).toString(),    // serialNum
                            autoErrValueTest.get(5).toString(),    // flowPoint
                            autoErrValueTest.get(6).toString(),    // times
                            autoErrValueTest.get(7).toString(),    // flowVolumn
                            Double.valueOf(autoErrValueTest.get(8).toString()),    // errorValue
                            autoErrValueTest.get(9).toString(),    // pressureLossValue
                            autoErrValueTest.get(10).toString(), // atmosphericPressure
                            autoErrValueTest.get(11).toString(), // temperature
                            autoErrValueTest.get(12).toString(), // relativeHumidity
                            autoErrValueTest.get(13).toString(), // diffValue
                            autoErrValueTest.get(14).toString(), // startTime
                            autoErrValueTest.get(15).toString(), // endTime
                            autoErrValueTest.get(16).toString() // testNo
                    )
            );
        }
//        System.out.println(autoErrValueTestList);
        return autoErrValueTestList;
    }

    // 成品检验记录
    public static List<ProductTest> packagingProductTest(List<List<Object>> lists) {
        List<ProductTest> productTestList = new ArrayList<>();
        for (int i = 0; i < lists.size(); i++) {
            List<Object> productTest = lists.get(i);
            productTestList.add(
                    new ProductTest(
                            productTest.get(0).toString(), // testNo
                            productTest.get(1).toString(), // meterNo
                            productTest.get(2).toString(), // models
                            productTest.get(3).toString(), // meterVersion
                            Double.valueOf(productTest.get(4).toString()), // importAmount
                            Double.valueOf(productTest.get(5).toString()), // initialValue
                            Double.valueOf(productTest.get(6).toString()), // terminalValue
                            Double.valueOf(productTest.get(7).toString()), // errorValue
                            productTest.get(8).toString(), // voltage
                            productTest.get(9).toString(), // outage
                            productTest.get(10).toString(), // controlValve
                            productTest.get(11).toString(), // remains
                            productTest.get(12).toString(), // IC
                            productTest.get(13).toString(), // dataMemories
                            productTest.get(14).toString(), // controlLongdistance
                            productTest.get(15).toString(), // finallyResult
                            productTest.get(16).toString(), // commDescribe
                            productTest.get(17).toString(), // unqualifiedDescribe
                            productTest.get(18).toString(), // qualityInspector
                            productTest.get(19).toString(), // testTime
                            productTest.get(20).toString(), // direction
                            productTest.get(21).toString(), // IMEI
                            productTest.get(22).toString(), // SIM
                            productTest.get(23).toString() // remarks
                    )
            );
        }
//        System.out.println(productTestList);
        return productTestList;
    }

    // 外部检验记录V1
    public static List<TempTestDataV1> packagingTempTestDataV1(List<List<Object>> lists) {
        List<TempTestDataV1> tempTestDataV1List = new ArrayList<>();
        for (int i = 0; i < lists.size(); i++) {
            List<Object> tempTestDataV1 = lists.get(i);
            tempTestDataV1List.add(
                    new TempTestDataV1(
                            tempTestDataV1.get(0).toString(),
                            Double.valueOf(tempTestDataV1.get(1).toString()),
                            Double.valueOf(tempTestDataV1.get(2).toString()),
                            Double.valueOf(tempTestDataV1.get(3).toString())
                    )
            );
        }
//        System.out.println(tempTestDataV1List);
        return tempTestDataV1List;
    }

    // 外部检验记录V2
    public static List<TempTestDataV2> packagingTempTestDataV2(List<List<Object>> lists) {
        List<TempTestDataV2> tempTestDataV2List = new ArrayList<>();
        for (int i = 0; i < lists.size(); i++) {
            List<Object> tempTestDataV2 = lists.get(i);
            tempTestDataV2List.add(
                    new TempTestDataV2(
                            tempTestDataV2.get(0).toString(),
                            tempTestDataV2.get(1).toString(),
                            Double.valueOf(tempTestDataV2.get(2).toString())
                    )
            );
        }
//        System.out.println(tempTestDataV2List);
        return tempTestDataV2List;
    }


    // 产品信息
    public static List<List<String>> dePackagingMetersInformaution(List<MeterInformation> meterInformationList) {
        List<List<String>> lists = new ArrayList<>();
        for (int i = 0; i < meterInformationList.size(); i++) {
            List<String> list = new ArrayList<>();
            MeterInformation meterInformation = meterInformationList.get(i);
            list.add(meterInformation.getMeterNo());
            list.add(meterInformation.getTestNo());
            list.add(String.valueOf(meterInformation.getQmaxValue()));
            list.add(String.valueOf(meterInformation.getQmidValue()));
            list.add(String.valueOf(meterInformation.getQminValue()));
            list.add(meterInformation.getPressureLoss());
            list.add(meterInformation.getPressurelossResult());
            list.add(meterInformation.getAtmosphericPressure());
            list.add(String.valueOf(meterInformation.getTemperature()));
            list.add(String.valueOf(meterInformation.getRelativeHumidity()));
            list.add(meterInformation.getQualityInspector());
            list.add(meterInformation.getTestTime());
            list.add(meterInformation.getManufacturer());
            lists.add(list);
        }
        return lists;
    }

    // 检验数据对比结果
    public static List<List<String>> dePackagingErrValueAnalyse(List<TestErrValueAnalyse> errValueAnalyseList) {
        List<List<String>> lists = new ArrayList<>();
        for (int i = 0; i < errValueAnalyseList.size(); i++) {
            List<String> list = new ArrayList<>();
            TestErrValueAnalyse testErrValueAnalyse = errValueAnalyseList.get(i);
            list.add(testErrValueAnalyse.getMeterNo());
            list.add(testErrValueAnalyse.getTestNo());
            list.add(String.valueOf(testErrValueAnalyse.getQmaxQc()));
            list.add(String.valueOf(testErrValueAnalyse.getQmidQc()));
            list.add(String.valueOf(testErrValueAnalyse.getQmaxJbs()));
            list.add(String.valueOf(testErrValueAnalyse.getQmidJbs()));
            list.add(String.valueOf(testErrValueAnalyse.getQmaxErr()));
            list.add(String.valueOf(testErrValueAnalyse.getQmidErr()));
            lists.add(list);
        }
        return lists;
    }

}
