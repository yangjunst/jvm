package com.maomao.learn;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/14 18:49
 * Program Goal:
 * public native String intern();
 * String���������������ɷ���
 *********************************************/
public class ConstantDemo {
    private String name;
    private float salary;
    private Float degree;

    @Override
    public String toString() {
        return "ConstantDemo{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", degree=" + degree +
                '}';
    }

    public static void main(String[] args) {
        String s1=new String("hello");
        String s2=new String("hello");
        System.out.println("hello"==s1.intern());
        System.out.println("hello"==s2.intern());
        System.out.println(s1.intern()==s2.intern());

        System.out.println(new ConstantDemo());
    }
}
