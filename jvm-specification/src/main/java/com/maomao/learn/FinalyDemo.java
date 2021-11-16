package com.maomao.learn;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/6/15 17:15
 *********************************************/
public class FinalyDemo {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Love");
        }finally {
            System.out.println("finaly...");
        }
    }
}
