package com.maomao.learn;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/15 20:14
 * Program Goal:
 *********************************************/
class A {

    B b;

    public A() {
    }


    public A(B b) {
        this.b = b;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(A.class + "--->finalize");
    }
}

class B {
    C c;

    public B(C c) {
        this.c = c;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(B.class + "--->finalize");
    }
}

class C {
    A a;

    public C(A a) {
        this.a = a;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(C.class + "--->finalize");
    }
}

class D {
    @Override
    protected void finalize() throws Throwable {
        System.out.println(D.class + "--------->finalize");
    }
}

public class JvmObjectDemo {
    public static void main(String[] args) {
        A a = new A();
        C c = new C(a);
        B b = new B(c);
        A a1 = new A(b);
        a = null;
        b = null;
        c = null;
        System.gc();
    }
}
