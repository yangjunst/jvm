package com.maomao.learn;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/6/2 15:54
 *********************************************/
public class LockDemo {
    public static void main(String[] args) {
        ReadWriteLock readWriteLock=new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock= (ReentrantReadWriteLock.ReadLock) readWriteLock.readLock();
        System.out.println(readLock.getClass().getSuperclass());
        System.out.println(readLock.getClass().getSuperclass().getDeclaringClass());
    }
}
