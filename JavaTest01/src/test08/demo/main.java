package test08.demo;

import java.util.Scanner;
//在整数中插入一个数，使之能被7整除
public class main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int num=scan.nextInt();
            String str = String.valueOf(num);     //num为需要转化的整数   C++ 转为字符串
            int[] tmp = new int[str.length()];    // C++ 建立数组
            //C++新建一个数组  存放结果
            int[] result = new int[str.length()+1];
            for(int i=0;i<str.length();i++){
                tmp[i]=Integer.parseInt(String.valueOf(str.charAt(i)));  //C++字符转为整数
                result[i]=tmp[i];
            }
            int sum=0;  //   输出结果
            boolean flag=false;//找到的标志
            //开始找整数  两个for循环
            for(int j=result.length-1;j>=0;j--) {         //  待插入的位置
                for(int i=0;i<9;i++){       //要插入的数字
                    for(int k=result.length-1;k>=j;k--){
                        result[k]=tmp[k-1];
                    }
                    result[j]=i; //插入数字i
                    for(int d=0;d<=result.length-1;d++){
                        sum=sum*10+result[d];
                    }
                    if(sum%7==0){
                        flag=true;
                        break;
                    }
                    sum=0;
                }
                if(flag){
                    break;
                }
            }
//        return sum;
            System.out.println(sum);
        }

        }

    }