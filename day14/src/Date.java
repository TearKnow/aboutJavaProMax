import java.time.Duration;
import java.time.LocalDateTime;

public class Date {
    public static void main(String[] args) {
        java.util.Date d = new java.util.Date();
        System.out.println(d);//Thu Sep 12 22:07:37 CST 2024
        System.out.println(d.getTime());// 1726150057319



        //计算x秒后的时间
        LocalDateTime now = LocalDateTime.now();
        // 设定要增加的秒数
        long secondsToAdd = 60; // 例如，增加60秒
        // 计算当前时间加上x秒后的时间
        LocalDateTime futureTime = now.plus(Duration.ofSeconds(secondsToAdd));// minus是减去时间
        // 打印结果
        System.out.println("当前时间: " + now);
        System.out.println("增加 " + secondsToAdd + " 秒后的时间: " + futureTime);



    }
}