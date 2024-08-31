package com.jack.d2_static_code;

public class StaticDemo {
    public static String schoolName;

    static {
        System.out.println("----静态代码块被执行了，比main早----");
        schoolName = "fengjing";
    }

    public static void main(String[] args) {
        System.out.println("-------main 方法执行了--------");
        System.out.println(schoolName);
    }
}
