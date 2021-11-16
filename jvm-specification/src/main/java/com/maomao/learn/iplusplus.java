package com.maomao.learn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/5/19 19:22
 *********************************************/
public class iplusplus {

    private  FileInputStream fis = new FileInputStream(new java.io.File(""));

    public iplusplus() throws FileNotFoundException {
    }

    public static void main(String[] args) {
        int i=0;
        for(int j=0;j<50;j++){
            i=i++;
            System.out.println(i);
        }
        System.out.println(i);
    }
}
