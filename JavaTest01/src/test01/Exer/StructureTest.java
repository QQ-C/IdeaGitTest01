package test01.Exer;

import java.util.Scanner;

//打印心形
class PrintHeart {
    public static void main(String[] args) {
        System.out.print("\t" + "*" + "\t\t\t\t\t\t\t\t\t\t\t\t" + "*" + "\t" + "\n");
        System.out.print("*" + "\t\t" + "*" + "\t\t\t\t" + "I love Java" + "\t\t\t\t" + "*" + "\t\t" + "*" + "\n");
        System.out.print("\t" + "*" + "\t\t\t\t\t\t\t\t\t\t\t\t" + "*" + "\t" + "\n");
        System.out.print("\t\t" + "*" + "\t\t\t\t\t\t\t\t\t\t" + "*" + "\t\t" + "\n");
        System.out.print("\t\t\t" + "*" + "\t\t\t\t\t\t\t\t" + "*" + "\t" + "\n");
        System.out.print("\t\t\t\t" + "*" + "\t\t\t\t\t\t" + "*" + "" + "\t" + "\n");
        System.out.print("\t\t\t\t\t" + "*" + "\t\t\t\t" + "*" + "" + "\t\t" + "\n");
        System.out.print("\t\t\t\t\t\t" + "*" + "\t\t" + "*" + "" + "\t\t" + "\n");
        System.out.print("\t\t\t\t\t\t\t" + "*" + "\n");
    }
}

//定义三个int型的变量并复制，使用三元运算符或者if-else获取三个数中的最大值
class test1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 50;
        int num3 = 30;
        int max = (((num1 > num2) ? num1 : num2) > num3) ? ((num1 > num2) ? num1 : num2) : num3;
        System.out.println(max);
        int max1;
        if (num1 >= num2 && num1 > num3) {
            max1 = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max1 = num2;
        } else {
            max1 = num3;
        }
        System.out.println(max1);
    }
}

//声明两个double型变量 判断第一个数大于10.0，第二个数小于20.0，打印两数之和，否则打印两数之差
class Test2 {
    public static void main(String[] args) {
        double d1 = 12.3;
        double d2 = 25.6;
        if (d1 > 10.0 && d2 < 20.0) {
            System.out.println(d1 + d2);
        } else {
            System.out.println(d1 * d2);
        }
    }
}

//交换两个变量值的代码实现
class Test3 {
    public static void main(String[] args) {
        String s1 = "beijing";
        String s2 = "nanjing";
        String temp = s1;
        s1 = s2;
        temp = s2;
        System.out.println("s1:" + s1 + ",s2:" + s2);
    }
}
//输入成绩：100-奖励BMW；(80,99],奖励iPhone；(60,80]奖励iPad，其他没有奖励

class IfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your acores:");
        float score = scan.nextFloat();
        if (score == 100) {
            System.out.println("BMW");
        } else if (score > 80 && score <= 99) {
            System.out.println("iphone");
        } else if (score >= 60 && score <= 80) {
            System.out.println("ipad");
        } else {
            System.out.println("nothing");
        }

    }
}

//5岁的狗相当于人类的几岁；狗的前两年每一年相当于人类的10.5岁。之后的每增加一年就增加4岁
class IfTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the age:");
        int age = scan.nextInt();
        if (age >= 0 && age <= 2) {
            System.out.println(age * 10.5);
        } else if (age > 2) {
            System.out.println(10.5 * 2 + (age - 2) * 4);
        } else {
            System.out.println("nothing");
        }
    }
}

//彩票问题 随机产生一个数，用户输入一个数。五种情况
class IfTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input number a:");
        int a = scan.nextInt();
        System.out.println("Please input number b");
        int b = scan.nextInt();
        int value = (int) (Math.random() * (b - a + 1) + a);   //[a,b]  10-99

        int valueShi = value / 10;
        int valueGe = value % 10;

        System.out.println("Please input a number[10,99]:");
        int number = scan.nextInt();
        int numberShi = number / 10;
        int numberGe = number % 10;

        if (number == value) {
            System.out.println("奖金10 000美元");
        } else if ((numberShi == valueGe) && (numberGe == valueShi)) {
            System.out.println("奖金3 000美元");
        } else if ((numberShi == valueShi) || (numberGe == valueGe)) {
            System.out.println("奖金1 000美元");
        } else if ((numberShi == valueGe) || (numberGe == valueShi)) {
            System.out.println("奖金500美元");
        } else {
            System.out.println("没中奖");
        }
        System.out.println("中奖号码是：" + value);
    }
}


class SwitchTest {
    public static void main(String[] args) {
        int number = 3;
        switch (number) {
            default:
                System.out.println("d");
//                break;
            case 0:
                System.out.println(0);
//                break;
            case 1:
                System.out.println(1);
//                break;
            case 2:
                System.out.println(2);
//                break;

        }

    }
}//d012

//学生成绩大于60 合格
class SwitchTest1 {
    public static void main(String[] args) {
        int num = 78;
        switch (num / 10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
                break;
        }
        switch (num / 60) {
            case 0:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("及格");
                break;
        }
    }
}

// 键盘输入2019年的month和day 输出输入日期为2019年的第几天
class SwitchTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input month:");
        int month = scan.nextInt();
        System.out.println("Pleasw input day:");
        int day = scan.nextInt();
        int sumDay = 0;

//        if(month==1){
//            sumDay=day;
//        }else if(month==2){
//            sumDay=31+day;
//        }else if(month==3){
//            //...
//        }
        switch (month) {
            case 12:
                sumDay += 31;
            case 11:
                sumDay += 31;
            case 10:
                sumDay += 30;
            case 9:
                sumDay += 31;
            case 8:
                sumDay += 31;
            case 7:
                sumDay += 30;
            case 6:
                sumDay += 31;
            case 5:
                sumDay += 30;
            case 4:
                sumDay += 31;
            case 3:
                sumDay += 28;
            case 2:
                sumDay += 31;
            case 1:
                sumDay += day;
        }
        System.out.println("2019年" + month + "月" + day + "日是当年的第" + sumDay + "天");
    }
}

//输入年月日，判断是第一天
class SwitchTest3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input year:");
        int year = scan.nextInt();
        System.out.println("Please input month:");
        int month = scan.nextInt();
        System.out.println("Pleasw input day:");
        int day = scan.nextInt();
        int sumDay = 0;

        switch (month) {
            case 12:
                sumDay += 31;
            case 11:
                sumDay += 31;
            case 10:
                sumDay += 30;
            case 9:
                sumDay += 31;
            case 8:
                sumDay += 31;
            case 7:
                sumDay += 30;
            case 6:
                sumDay += 31;
            case 5:
                sumDay += 30;
            case 4:
                sumDay += 31;
            case 3:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    sumDay += 29;
                } else {
                    sumDay += 28;
                }
            case 2:
                sumDay += 31;
            case 1:
                sumDay += day;
        }
        System.out.println("2019年" + month + "月" + day + "日是当年的第" + sumDay + "天");
    }
}

class ForTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World!");
        }
    }
}

//遍历100以内的偶数 获取所有偶数的和
class ForTest1 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
//                System.out.println(i);
                sum += i;
                count++;
            }
        }
        System.out.println(sum);
        System.out.println(count);
    }
}

class ForTest11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 120; i++) {

        }
    }
}

/*
输入两个正整数m和n，求其最大公约数和最小公倍数 12和20的最大公约数是4，最小公倍数是60
 */
class ForTest2 {
    public static void main(String[] aegs) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input num1:");
        int num1 = scan.nextInt();
        System.out.println("Please input num2:");
        int num2 = scan.nextInt();
        //获取两个数中的较小值
        int min = (num1 <= num2) ? num1 : num2;
        for (int i = min; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("最大公约数：" + i);
                break;
            }
        }
        //获取两个数的最大值
        int max = (num1 >= num2) ? num1 : num2;
        for (int i = max; i <= num1 * num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.println("最小公倍数：" + i);
                break;
            }
        }

    }
}

//求三位数的水仙花数 各位上的和等于这个数
class ForTest3 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int iBai = i / 100;
            int iShi = i % 100 / 10;
            int iGe = i % 10;
            double num = Math.pow(iBai, 3) + Math.pow(iShi, 3) + Math.pow(iGe, 3);
            if (i == num) {
                System.out.println(i);
            }
        }
    }
}

class WhileTest {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

//从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时程序结束
class WhileTest1 {
    public static void main(String[] aegs) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a number:");
        int positiveNumber = 0;
        int negativeNumber = 0;
        for (; ; ) {//while (true) {
            int number = scan.nextInt();
            if (number > 0) {
                positiveNumber++;
            } else if (number < 0) {
                negativeNumber++;
            } else {
                break;
            }
        }
        System.out.println("positiveNumber:" + positiveNumber);
        System.out.println("negativeNumber:" + negativeNumber);
    }
}

class ForWhileTest {
    public static void main(String[] args) {
        //输出n个*
        for (int i = 1; i <= 6; i++) {
            System.out.print('*');
        }
        System.out.println();
        //输出4行 n个*
        for (int j = 1; j <= 4; j++) {
            for (int i = 1; i <= 6; i++) {
                System.out.print('*');
            }
            System.out.println();
        }
        //每行多一个*
        for (int i = 1; i <= 5; i++) {   //控制行数
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        //每行少一个*
        for (int i = 1; i <= 5; i++) {   //控制行数
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }
}

//九九乘法表
class NineNineTable {
    public static void main(String[] args) {
        System.out.println("九九乘法表");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + " ");
            }
            System.out.println();
        }
    }
}

//100以内的质数  只能被1和自身整除的数   (2----n-1)或者(2---- n/2+1)  最小的质数是2
class PrimeNumberTest {
    public static void main(String[] args) {
        boolean isFlag = true;
        //获取当前时间距离 1970-01-01 00:00:00 的毫秒数
        long startTime=System.currentTimeMillis();


        int count=0;
        for (int i = 2; i <= 100; i++) {
//            boolean isFlag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {   //除尽了
                    isFlag = false;
                    break;   //优化一  只对本身非质数有效
                }
            }
            if (isFlag == true) {
                System.out.println(i);
                count++;
            }
            isFlag = true;

        }
        System.out.println("number:"+count);
        //结束时间
        long endTime=System.currentTimeMillis();
        System.out.println("Time:"+(endTime-startTime));
    }
}