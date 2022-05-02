package test05.Exer1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Vector;

/**
 * 利用Vector 代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
 * 提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度。而向量类 java.util.Vector 可以根据需要动态伸缩。
 * 创建 Vector 对象： Vector v=new Vector();
 * 给向量添加元素 v.addElement(Object obj ); obj 必须是对象
 * 取出向量中的元素： Object obj v.elementAt (
 * 注意第一个元素的下标是 0 ，返回值是 Object 类型的。
 * 计算向量的长度： v.size
 * 若与最高分相差 10 分内： A 等； 20 分内： B 等；30分内： C 等；其它： D 等
 */
public class ScoreTest {
    public static void main(String[] args) {
        //1.实例化Scanner
        Scanner scan =new Scanner(System.in);


        //2.创建 Vector 对象： Vector v=new Vector(); 相当于原来的数组
        Vector v=new Vector();
        int maxScore=0;
        //3.通过for循环，添加数组
        for (;;) {
            System.out.println("输入学生成绩（以负数代表输入结束）");
            int score=scan.nextInt();
            //3.2当是负数，挑出循环
            if(score<0){
                break;
            }
            if(score>100){
                System.out.println("input again");
                continue;
            }
            //3.1 add操作
            v.addElement(score); //自动装箱
            //jdk5.0之前
//            Integer inScore = new Integer(score);
//            v.addElement(inScore);    //多态


            //4.获取成绩最大值
           if(maxScore<score){
               maxScore=score;
           }
        }
        //5.遍历成绩 ，获取等级
        char level;
        for (int i = 0; i < v.size() ; i++) {
            Object obj=v.elementAt(i);
            // 转换成基本数据类型
            int score = (int)obj;
            //jdk5.0之前
//            Integer inScore =(Integer)obj;
//            int score = inScore.intValue();

            if(maxScore-score<=10){
                level='A';
            }else if(maxScore-score<=20){
                level='B';
            }else if(maxScore-score<=30){
                level='C';
            }else {
                level='D';
            }
            System.out.println(i+"学生等级为："+level);
        }
    }
}