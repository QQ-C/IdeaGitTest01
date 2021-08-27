package test03.demo;

/**
 * 方法的重载：
 * “两同一不同” ：同一个类 相同方法名
 *              参数列表不同，参数个数不同，参数类型不同
 *              跟方法的权限修饰符、返回值类型、形参变量名、方法体都没有关系
 */
/**2.
 编写程序，定义三个重载方法并调用。方法名为 mOL 。
 三个方法分别接收一个 int 参数、两个 int 参数、一个字符串参数。
 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
 在主类的 main () 方法中分别用参数区别调用三个方法。
 3.定义三个重载方法 max()，
 第一个方法求两个 int 值中的最大值，
 第二个方法求两个 double 值中的最大值，
 第三个方法求三个 double 值中的最大值，
 并分别调用三个方法。
 */
public class OverLoadTest01 {
    public static void main(String[] args){
        int a=8,b=9;
        double a1=8,b1=9,c1=10;
        String str="Hellow,World!";

        OverLoadTest01 test=new OverLoadTest01();
        test.mOL(a);
        test.mOL(a,b);
        test.mOL(str);
        System.out.println(test.max(a,b));
        System.out.println(test.max(a1,b1));
        System.out.println(test.max(a1,b1,c1));
    }
    //三个方法构成重载
    public void mOL(int a){
        System.out.println("平方："+a*a);
    }
    public void mOL(int a,int b){
        System.out.println("相乘：" + a * b);
    }
    public void mOL(String s){
        System.out.println("字符串信息："+s);
    }

    public int max(int a,int b){
        int max=(a>b)?a:b;
        return max;
    }
//    public double max(int a,int b){      //错误  与上面是同一个
//        return 0;
//    }
    public double max(double a, double b){
        double max=(a>b)?a:b;
        return max;
    }
    public double max(double a,double b,double c){
        double max=(((a>b)?a:b)>c)?((a>b)?a:b):c;
        return max;
    }

}
