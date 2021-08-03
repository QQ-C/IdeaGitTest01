package test01.demo;
// 包名:xxyyzz 类名、接口名 XxxYyyZzz 变量名、方法名：xxxYyyZzz 常量名：XXX_YYY_ZZZ
        /*
         * 在一个Java源文件中可以声明多个类class，但只能有一个public，且声明为public的类的类名必须与源文件名相同
         * 程序的入口是main方法，格式固定
         * 输出 System.out.println()   先输出后换行
         * 语句末尾 ； 结束*/

        import java.util.Scanner;
/*
 * 从键盘获取不同类型的变量 需要Scanner类
 * 1.导包： import java.util.Scanner   写在类的声明的上面
 * 2. Scanner的实例化  Scanner scan = new Scanner(System.in)
 * 3.调用Scanner类的相关方法，获取指定类型的变量
 * */
public class Hello {
    //main方法是程序的入口 main格式是固定的
    public static void main(String[] args){    //arguments 参数
        // 单行注释 输出到控制台
        System.out.println("Hello World!");
        Scanner scan=new Scanner(System.in);

        System.out.println("name:");
        String name=scan.next();
        System.out.println(name);

        System.out.println("age:");
        int num=scan.nextInt();
        System.out.println(num);
    }
}

