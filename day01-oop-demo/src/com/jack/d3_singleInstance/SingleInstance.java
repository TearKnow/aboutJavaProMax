package com.jack.d3_singleInstance;

public class SingleInstance {
    //饿汉单例模式，就是加载的时候已经有了
    public static SingleInstance instance = new SingleInstance();

    private SingleInstance(){

    }
}
