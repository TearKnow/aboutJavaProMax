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


        String a = "1234";
        System.out.println(a.charAt(1));//第二位的字符是什么

        //查看char的int值
        Character i = 'a';
        int b = i;
        System.out.println(b);

        System.out.println("ab".matches("[abc]"));



        // 这里是时间的一些使用。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。
        LocalDate d = LocalDate.now(); // 当前日期
        LocalTime t = LocalTime.now(); // 当前时间
        LocalDateTime dt = LocalDateTime.now(); // 当前日期和时间
        System.out.println(d); // 严格按照ISO 8601格式打印
        System.out.println(t); // 严格按照ISO 8601格式打印
        System.out.println(dt); // 严格按照ISO 8601格式打印
        System.out.println(dt.toLocalDate());
        System.out.println(dt.toLocalTime());

        System.out.println("========================");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(dt));

        LocalDateTime dt2 = LocalDateTime.parse("2019/11/30 15:16:17", dtf);
        System.out.println(dt2);
        LocalDateTime dt3 = LocalDateTime.parse("2019-11-19T15:16:17");
        System.out.println(dt3);

        LocalDateTime dt4 = LocalDateTime.parse("2019/11/30 15:16:17", dtf);
        System.out.println(dt4.minusDays(10));//10天前的时间
        System.out.println(dt4.plusSeconds(1000).format(dtf) + "------自己格式-----");//1000秒后的时间，用自己的格式
        System.out.println(dt4.withSecond(59));//秒变成59秒

        System.out.println("========================");

        ZonedDateTime zbj = ZonedDateTime.now();
        ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(zbj);
        System.out.println(zny);

        //北京时间转换成new york时间
        ZonedDateTime zbj2 = ZonedDateTime.now();
        ZonedDateTime zny2 = zbj2.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(zbj2);
        System.out.println(zny2);
        System.out.println(zbj2.toLocalDateTime());
        System.out.println(zny2.toLocalDateTime());


        /**
         2024-09-18T15:08:59.263754300---当前北京时间用localDateTime转成new york时间
         2024-09-18T15:08:59.263754300-04:00[America/New_York]
         2024-09-18T15:08:59.263754300-04:00[America/New_York]

         * 这里是不同时刻！！！！！！！！！
         */
        LocalDateTime ldt5 = LocalDateTime.now();
        ZonedDateTime zdt5 = ldt5.atZone(ZoneId.of("America/New_York"));
        System.out.println(ldt5 + "---这里请注意");
        System.out.println(ldt5.atZone(ZoneId.of("America/New_York")));
        System.out.println(zdt5.withZoneSameInstant(ZoneId.of("America/New_York")));


        System.out.println("===========练习=============");
        //某航线从北京飞到纽约需要13小时20分钟，请根据北京起飞日期和时间计算到达纽约的当地日期和时间。
        LocalDateTime nowBeiJin = LocalDateTime.of(2019, 9, 15, 13, 0, 0);
        LocalDateTime arrivedBeiJin = nowBeiJin.plusHours(13).plusMinutes(20);
        ZonedDateTime zArrivedBeiJin = arrivedBeiJin.atZone(ZoneId.of("Asia/Shanghai"));//到达时的北京时间
        System.out.println(zArrivedBeiJin.withZoneSameInstant(ZoneId.of("America/New_York")));//转换new york时间


    }
}