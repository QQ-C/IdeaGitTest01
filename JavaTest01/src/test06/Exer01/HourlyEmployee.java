package test06.Exer01;

/**
 * （4 ）参照 SalariedEmployee 类定义 HourlyEmployee 类，实现按小时计算工资的员工处理。该类包括：
 * private成员变量 wage 和 hour
 * 实现父类的抽象方法earnings(), 该方法返回 wage*hour 值
 * toString方法输出员工类型信息及员工的 name number,birthday 。
 */
public class HourlyEmployee extends Employee {
    private int wage;  //每小时的工资
    private int hour;  //月工作小时数

    public HourlyEmployee(String name, int number, Mydate birthday) {
        super(name, number, birthday);
    }
    public HourlyEmployee(String name, int number, Mydate birthday,int wage,int hour) {
        super(name, number, birthday);
        this.hour=hour;
        this.wage=wage;
    }
    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage*hour;
    }
    public String toString(){
        return "HourlyEmployee" + super.toString();
    }

}
