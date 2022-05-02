package test06.demo;

/**
 * main()方法的使用：
 * 1.main()方法作为程序的入口
 * 2.main()方法也是一个普通的静态方法
 * 3.main()方法可以作为与控制台交互的方式
 */
public class MainTest {
    public static void main(String[] args){  //入口
        Main.main(new String[100]);
        MainTest test=new MainTest();
        test.show();
    }

    public void show(){
        System.out.println("hello");
    }
}

class Main{
    public static void main(String[] args){
//        args = new String[100];
        for (int i = 0; i < args.length; i++) {
            args[i]="args_"+i;
            System.out.println(args[i]);
        }
    }
}
