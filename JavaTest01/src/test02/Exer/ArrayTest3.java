package test02.Exer;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest3 {
    public static void main(String[] args) {
        System.out.println("Hello,World");
    }
}

class ArrayExer01 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("总和为：" + sum);
    }
}

/**
 * 使用二维数组打印一个 10 行杨辉三 角 。
 * 【提示 】
 * 1.第一行有 1 个元素 , 第 n 行有 n 个元素
 * 2.每一行的第一个元素和最后一个元素都是 1
 * 3.从第三行开始 , 对于非第一个元素和最后一个元素的 元素。即：
 * yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 */
class YangHuiSanJiao {
    public static void main(String[] args) {
        //初始化
        int[][] yangHuiArray = new int[10][];
        //赋值
        for (int i = 0; i < yangHuiArray.length; i++) {
            yangHuiArray[i] = new int[i + 1];
            yangHuiArray[i][0] = 1;
            yangHuiArray[i][i] = 1;
            for (int j = 1; j < yangHuiArray[i].length - 1; j++) {
                yangHuiArray[i][j] = yangHuiArray[i - 1][j - 1] + yangHuiArray[i - 1][j];
            }
        }
        //遍历
        for (int i = 0; i < yangHuiArray.length; i++) {
            for (int j = 0; j < yangHuiArray[i].length; j++) {
                System.out.print(yangHuiArray[i][j] + "   ");
            }
            System.out.println();
        }
    }
}

/**
 * 创建一个长度为 6 的 int 型数组，要求数组元素的值都在 1-30 之间，且是随机赋值。同时，要求元素的值各不相同。
 */
class SuiJiShuTest {
    public static void main(String[] args) {
        //方式一
//        int[] arr=new int[6];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=(int)(Math.random()*30+1);
//            boolean flag=false;
//            while(true){
//                for(int j=0;j<i;j++){
//                    if(arr[i]==arr[j]){
//                        flag = true;
//                        break;
//                    }
//                }
//                if(flag){
//                    arr[i]=(int)(Math.random()*30+1);
//                    flag=false;
//                    continue;
//                }
//                break;
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+"\t");
//        }
//        System.out.println();

        //方式二
        int[] arr=new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*30+1);
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    i--;
                    break;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

    }
}

/*回形数*/
class HuiXingShu {
    public static void main(String[] args){
        //方式一
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入一个数字：");
        int len=scanner.nextInt();
        int[][] arr=new int[len][len];
        int s=len*len;

        // k=1 向右 k=2 向下 k=3 向左 k=4向上

        int k=1;
        int i=0,j=0;   // i 是行数 ； j是列数
        for(int m=1;m<=s;m++) {
            if (k == 1) {
                if (j < len && arr[i][j] == 0) {     //int型 默认是0
                    arr[i][j++] = m;
                } else {
                    k = 2;
                    i++;
                    j--;
                    m--;
                }
            } else if (k == 2) {
                if (i < len && arr[i][j] == 0) {
                    arr[i++][j] = m;
                } else {
                    k = 3;
                    i--;
                    j--;
                    m--;
                }
            } else if (k == 3) {
                if (j >= 0 && arr[i][j] == 0) {
                    arr[i][j--] = m;
                } else {
                    k = 4;
                    i--;
                    j++;
                    m--;
                }
            } else if (k == 4) {
                if (i >= 0 && arr[i][j] == 0) {
                    arr[i--][j] = m;
                } else {
                    k = 1;
                    i++;
                    j++;
                    m--;
                }
            }
        }
        for (int m = 0; m < arr.length; m++) {
            for (int n = 0; n < arr[m].length; n++) {
                System.out.print(arr[m][n] + "\t");
            }
            System.out.println();
        }

    }
}

class HuiXingShu1{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入一个数字：");
        int n=scanner.nextInt();
        int[][] arr=new int[n][n];

        int count=0;//要显示的数据
        int maxX = n - 1; // x轴的最大下标
        int maxY = n - 1; // Y轴的最大下标
        int minX = 0; // x轴的最小下标
        int minY = 0; // Y轴的最小下标
        while (minX <= maxX) {
            for (int x = minX; x <= maxX; x++) {
                arr[minY][x] = ++count;
            }
            minY++;
            for (int y = minY; y <= maxY; y++) {
                arr[y][maxX] = ++count;
            }
            maxX--;
            for (int x = maxX; x >= minX; x--) {
                arr[maxY][x] = ++count;
            }
            maxY--;
            for (int y = maxY; y >= minY; y--) {
                arr[y][minX] = ++count;
            }
            minX++;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                String space = (arr[i][j] + "").length() == 1 ? "0" : "";
                System.out.print(space + arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

class TestArraysExer{
    public static void main(String[] args){
        //1、声明一个数组并创建一个数组
        int[] scores = new int[5];

        //2、从键盘输入成绩
        Scanner input = new Scanner(System.in);
        for(int i=0; i<scores.length; i++){
            //成绩存在数组的元素中
            //为元素赋值
            System.out.print("请输入第" + (i+1) + "个学员的成绩:");
            scores[i] = input.nextInt();
        }

        //3、显示成绩
        //用foreach显示所有学员的成绩
        System.out.println("本组学员的成绩如下：");
        for(int s = 0; s < scores.length;s++){
            System.out.println(scores[s]);
        }
        //4、排序：从低到高
        Arrays.sort(scores);
        System.out.println("排序后的结果：" + Arrays.toString(scores));

        //5、查找60分
        int index = Arrays.binarySearch(scores, 60);
        if(index<0){
            System.out.println("没有正好60分的");
        }else{
            System.out.println("60分的索引位置：" + index);
        }

        //6、复制成绩最低三名构成新数组
        //int[] newArray = Arrays.copyOfRange(scores, 0, 3);
        int[] newArray = Arrays.copyOf(scores,  3);

        //7、用工具类打印成绩最低三名成绩
        System.out.println("成绩最低的三名同学是：" +  Arrays.toString(newArray));
    }
}
