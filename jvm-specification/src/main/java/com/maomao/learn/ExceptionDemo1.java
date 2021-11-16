package com.maomao.learn;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/5/23 18:49
 *********************************************/
public class ExceptionDemo1 {
    public static void main(String[] args) {
        love();
    }
    public static void love() {
        show();
    }
    public static void show(){
        hello();
    }
    public static void hello() {
        display();
    }
    public static void display() {
        new Exception("hello").printStackTrace();
    }
}
