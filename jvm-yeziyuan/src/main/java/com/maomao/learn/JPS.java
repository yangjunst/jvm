package com.maomao.learn;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.TimeUnit;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/19 19:49
 * Program Goal:
 *********************************************/
public class JPS {

    public static void main(String[] args) {

        new Thread(()->{
            try {
                ServerSocket serverSocketA = new ServerSocket(1024);
                serverSocketA.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }).start();
        new Thread(()->{
            try {
                ServerSocket serverSocketB = new ServerSocket(2048);
                serverSocketB.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }).start();
        new Thread(()->{
            try {
                ServerSocket serverSocketC = new ServerSocket(3072);
                serverSocketC.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }).start();
        new Thread(()->{
            try {
                ServerSocket serverSocketC = new ServerSocket(4096);
                serverSocketC.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }).start();
        try {
            TimeUnit.SECONDS.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
