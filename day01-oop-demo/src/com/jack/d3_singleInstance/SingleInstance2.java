package com.jack.d3_singleInstance;

public class SingleInstance2 {
    //懒汉，就是用的时候，才有

    private static SingleInstance2 instance;
    private SingleInstance2(){

    }

    public static SingleInstance2 getInstance(){
        if(instance == null){
            instance = new SingleInstance2();
        }

        return instance;
    }
    public static void main(String[] args) {


    }
}
