package com.jack.d1_static;


public class User {

    //在内存中只有一份
    public static int onlineNumber  = 161;

    //无static
    private String name;
    private int age;

    public static void main(String[] args) {
        User u = new User();
        u.name = "jack";
        u.age = 18;
        u.onlineNumber++;
        System.out.println(User.onlineNumber);
        System.out.println(onlineNumber);

        User u2 = new User();
        u2.name = "零四";
        u2.age = 28;
        u2.onlineNumber++;
        System.out.println(User.onlineNumber);//只有一份



    }
}
