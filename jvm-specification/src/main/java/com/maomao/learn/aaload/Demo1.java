package com.maomao.learn.aaload;
import java.io.File;
/********************************************
 * 文件名称: Demo1.java
 * 功能说明: 
 * 开发人员: 雪域青竹
 * 开发时间: 2021/5/2 16:12
 *********************************************/
public class Demo1 {
    private static class Command{

    }

    public Demo1(){
        Command[] commands=new Command[10];
        Command c=commands[0];
    }

    public Demo1(int[] ints){
        System.out.println(ints[0]);
    }

    public Demo1(Integer[] is){
        System.out.println(is[0]);
    }

    public Demo1(String[] strs){
        System.out.println(strs[0]);
    }

    public Demo1(File[] fs){
        System.out.println(fs[0]);
    }
}
