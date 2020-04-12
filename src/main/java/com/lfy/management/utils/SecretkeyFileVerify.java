package com.lfy.management.utils;

import com.lfy.management.exception.MsgException;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class SecretkeyFileVerify {
    // 秘钥文件名
    private static final String KEY_NAME = "SecretkeyFile.key";
    // 秘钥序列
    private static final List<String> INDEX = new ArrayList();

    static {
        // 初始化秘钥序列
        INDEX.add("8");
        INDEX.add("18");
        INDEX.add("27");
        INDEX.add("38");
        INDEX.add("41");
        INDEX.add("53");
        INDEX.add("36");
        INDEX.add("21");
    }

    private SecretkeyFileVerify(){}

    /**找秘钥文件*/
    private static File findSecretkeyFile(){
        String secretkeyFilePath;
        boolean flag = false;
        File secretkeyFile = null;
        File[] files = File.listRoots();
        for (File file:files) {
            secretkeyFilePath = "";
            secretkeyFilePath = file.toString() + KEY_NAME;
            secretkeyFile = new File(secretkeyFilePath);
            if (secretkeyFile.exists()) {
                flag = true;
                break;
            }
        }
        return secretkeyFile;
    }

    /**读秘钥文件*/
    private static String readSecretkeyFile(File file) throws IOException {
        RandomAccessFile keyFile = new RandomAccessFile(file, "rw");
        String key = "";
        String line = null;
        int index = 1;
        while ((line = keyFile.readLine()) != null) {
            if (INDEX.contains(String.valueOf(index))) {
                key = key + line.charAt(0);
            }
            index++;
        }
        return key;
    }

    public static boolean checkSecretkeyFile() throws Exception {
        File secretkeyFile = findSecretkeyFile();
        if ( secretkeyFile.exists()) {
            String key = readSecretkeyFile(secretkeyFile);
            if ("passWOrd".equals(key)) {
//                System.out.println(key);
                return true;
            } else {
//                System.out.println(key);
                return false;
            }
        } else {
            throw new MsgException("未检测到秘钥文件，不允许登录!");
        }
    }

}
