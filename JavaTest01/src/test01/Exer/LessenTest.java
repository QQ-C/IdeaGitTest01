package test01.Exer;

import java.util.Arrays;
import java.util.Scanner;

public class LessenTest {
    //战士连续作战89小时。是多少天多少小时？
    public static void main(String[] args) {
        int hours = 89;
        int day = hours / 24;
        hours = hours % 24;
        System.out.println("为了抵抗洪水，战士连续作战" + day + "天" + hours + "小时");
    }
}

//今天是周二，100天以后是周几？
class LessenTest2 {
    public static void main(String[] args) {
        int week = 2;
        week += 100;
        week = week % 7;
        System.out.println(week);
    }
}

//将华氏温度（80）转换为摄氏温度，C=(F-32)/1.8;并以华氏度和摄氏度分别表示该温度
class LessenTest3 {
    public static void main(String[] args) {
        int h = 80;
        double s = (h - 32) / 1.8;
        System.out.println("华氏温度：" + h + ",摄氏温度：" + s);
        System.out.println(h + "华氏度，是摄氏度" + Math.round(s)); //返回一个最接近的int、long型值 四舍五入
    }
}

// 实现对三个整数进行排序，从小到大的顺序输出
//从键盘输入三个数 对他们进行排序，从小到大输出
class LessenTest4 {
    public static void main(String[] args) {
//        int a = 100;
//        int b = 20;
//        int c = 200;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a:");
        int a=scan.nextInt();
        System.out.println("Please input b:");
        int b=scan.nextInt();
        System.out.println("Please input c:");
        int c=scan.nextInt();
        //先比较其中两个 再与第三个做比较
        if (a >= b) {
            if (c >= a) {
                System.out.println(b + "," + a + "," + c);
            } else if (c <= b) {
                System.out.println(c + "," + b + "," + a);
            } else {
                System.out.println(b + "," + c + "," + a);
            }
        } else {
            if (c <= a) {
                System.out.println(c + "," + a + "," + b);
            } else if (c >= b) {
                System.out.println(a + "," + b + "," + c);
            } else {
                System.out.println(a + "," + c + "," + b);
            }
        }
    }
}

/**一个数如果恰好等于它的因子之和。这个数就称为“完数” 例如 6 = 1 + 2 + 3
 * 因数：初去这个数本身的其他约数
 * 编程找到1000以内的所有完数
 */
class LessenTest5{
    public static void main(String[] args){
        int factor=0;
        for(int i=1;i<=1000;i++){
            for(int j=1;j<=i/2;j++){
                if(i%j==0){
                    factor+=j;
                }
            }
            if(i==factor){
                System.out.println(i);
            }
            factor=0;
        }
    }
}