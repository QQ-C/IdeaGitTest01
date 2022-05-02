package test07.demo01;

import java.util.Date;

public class DateTimeTest {
    /**
     * java.util.Date类
     *      Date()构造器
     *      toString()方法 显示当前的 年月日时分秒
     *      getTime()方法  显示 时间戳
     * Java.sql.Date 对应数据库中的日期类型
     */
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(time);

        Date date1 = new Date();
        System.out.println(date1.toString());
        System.out.println(date1.getTime());

        java.sql.Date date2=new java.sql.Date(1638952522601L);
        System.out.println(date2);
    }
}
