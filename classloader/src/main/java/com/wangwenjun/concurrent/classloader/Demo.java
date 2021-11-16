package com.wangwenjun.concurrent.classloader;

import javax.script.ScriptException;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/10/7 16:13
 * Program Goal:
 *********************************************/
public class Demo {
    public static void main(String[] args) throws ScriptException {
        Runnable r=()->{
            System.out.println("ok");
        };
        r.run();

    }
}
