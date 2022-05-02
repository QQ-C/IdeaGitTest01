package test06.Exer01;

/**
 *  * （2) MyDate 类包含private成员 变量 year month,day
 *  * toDateString方法返回日期对应的字符串： xxxx 年 xx 月 xx 日
 */
public class Mydate {
    private int year;
    private int month;
    private int day;

    public Mydate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toDateString(){
        return year + "年" + month + "月" + day + "日";
    }
}
