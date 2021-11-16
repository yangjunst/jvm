package com.maomao.learn;

import java.io.Serializable;
import java.util.Arrays;

/********************************************
 * 文件名称: Demo.java
 * 功能说明: 
 * 开发人员: 雪域青竹
 * 开发时间: 2021/5/5 19:59
 *********************************************/
interface A extends Serializable{}
interface B extends A, Cloneable {}
class C implements B{}
public class Demo {
    public static void main(String[] args) {

    }
}
