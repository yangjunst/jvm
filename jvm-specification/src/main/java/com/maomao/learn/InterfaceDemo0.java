package com.maomao.learn;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/6/16 15:56
 *********************************************/
interface AA{}
public interface InterfaceDemo0 extends AA {
    static void main(String[] args) {
        Class<? super InterfaceDemo0> superclass = InterfaceDemo0.class.getSuperclass();
        System.out.println(InterfaceDemo0.class.getInterfaces()[0]);
    }
}
