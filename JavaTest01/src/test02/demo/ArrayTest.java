package test02.demo;

import java.util.Scanner;

/**
 * 一维数组的使用：
 * 声明和初始化
 * 调用指定位置的元素
 * 获取数组的长度
 * 遍历数组
 * 默认初始化值
 * 数组的内存解析
 */

public class ArrayTest {
    public static void main(String[] args) {
        int[] ids;
        ids = new int[]{1001, 1002, 1003};  //静态初始化：数组的初始化和数组元素的赋值同时进行
        String[] names = new String[5]; //动态初始化：数组的初始化和数组元素的赋值分开进行
        names[0] = "cqq0";
        names[1] = "cqq1";
        names[2] = "cqq2";
        names[3] = "cqq3";
        names[4] = "cqq4";
        System.out.println(names.length);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}

//数组元素的默认初始化值
//int 0 ; float: 0.0 ; char 0 不是‘0’ ; boolean : false ;
//String : null  ;
class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("*********");
        char[] arr1 = new char[4];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}

//数组的内存解析
class ArrayTest02 {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 2, 1, 0, 3};
        int[] index = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};
        String tel = "";
        for (int i = 0; i < index.length; i++) {
            tel += arr[index[i]];
        }
        System.out.println(" 联系方式：" + tel);
    }
}

//学生成绩
class ArrayTest03{
    public static void main(String[] args) {
        //读取学生个数 Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int number=scanner.nextInt();
        //创建数组存储学生成绩 动态初始化
        int[] scores = new int[number];
        int maxScore=0;
        //给数组中的元素赋值
        System.out.println("请输入："+number+"个学生成绩：");
        for (int i = 0; i < scores.length; i++) {
            scores[i]=scanner.nextInt();
            if(maxScore<scores[i]){
                maxScore=scores[i];
            }
        }
        //获取最大值
//        int maxScore=0;
//        for (int i = 0; i < scores.length; i++) {
//            if(maxScore<scores[i]){
//                maxScore=scores[i];
//            }
//        }
        //根据差值得到等级，并输出等级
        char level;
        for (int i = 0; i < scores.length; i++) {
            if(maxScore-scores[i]<=10){
                level='A';
            }else if(maxScore-scores[i]<=20){
                level = 'B';
            }else if(maxScore-scores[i]<=30){
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println("student " +i+"score is"+scores[i]+",grade is"+level);
        }

    }
}
