package com.maomao.learn;

import com.test.learn.ObjectShallowSize;

import java.io.IOException;
import java.io.Serializable;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/17 16:27
 * Program Goal:
 *********************************************/
class InstanceDemo implements Serializable {
    static {
        a=0;
//        System.out.println(a);
    }
    static int a=1;
}

class RealInstanceDemo implements Serializable {
    InstanceDemo demo = new InstanceDemo();
}

public class CalculateObjectSize {
    public static void main(String[] args) throws IOException {
        long l = ObjectShallowSize.sizeOf(new InstanceDemo());
        System.out.println(l);
    }

}