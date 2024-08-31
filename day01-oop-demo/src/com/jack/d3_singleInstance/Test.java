package com.jack.d3_singleInstance;

public class Test {
    public static void main(String[] args) {
        SingleInstance s1 = SingleInstance.instance;
        SingleInstance s2 = SingleInstance.instance;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);//地址一样，说明是单例的
    }
}
