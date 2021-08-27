package test02.demo;

/**
 * 求数值型数组中元素的最大值、最小值、平均数、总和等
 * 定义一个int 型的一维数组，包含 10 个元素，分别赋一些随机整数，然后求出所有元素的最大值，最小值,和值,平均值， 并输出.
 * 要求：所有随机数都是两位数。
 * 10-99
 * Math.random() * (b - a + 1) + a);   //[a,b]
 */
public class ArrayTest4 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
            System.out.print(arr1[i]);
        }
        int minNum = arr1[0];
        int maxNum = arr1[0];
        int sum = 0;
        int countNum = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < minNum) {
                minNum = arr1[i];
            } else if (arr1[i] > maxNum) {
                maxNum = arr1[i];
            }
            sum += arr1[i];
            countNum++;
        }
        System.out.println("MaxNumber:" + maxNum);
        System.out.println("minNumber:" + minNum);
        System.out.println("sum:" + sum);
        System.out.println("Average:" + sum / countNum);

    }
}

/*
* 使用简单数组
(1)创建一个 名为 ArrayTest 的 类，在 main() 方法中声明 array1 和 array2 两 个 变量，他们 是 int 类型的数组。
(2)使用大括号 {}，把 array1 初始化为 8 个素数： 2,3,5,7,11,13,17,19 。
(3)显示 array1 的内容。
(4)赋值 array2 变量等于 array1 ，修改 array2 中的偶索引元素，使其等于索引值如 array[0]=0,array[2]=2) 。打印出 array1 。
思考：array1 和 array2 是什么关系？    地址值相同，都指向了堆空间中唯一的数组            array2=array1;    //只是地址赋值得Array2   不是数组的复制

拓展：修改题目，实现 array2 对 array1 数组的复制
* */
class ArrayExr41 {
    public static void main(String[] args) {
        int[] array1, array2;
        array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();

//        array2=array1;    //只是地址赋值得Array2   不是数组的复制

        array2 = new int[array1.length];      //新建了一个数组
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0) {
                array2[i] = i;
            }
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();

    }
}

// 数组的复制 反转 查找（线性查找 二分法查找）
class ArrayExr42 {
    public static void main(String[] args) {
        String[] arr = new String[]{"JJ", "DD", "MM", "BB", "AA"};

        //数组的复制
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }

        //数组的反转   方法一
//        for(int i=0;i<arr1.length/2;i++){
//            String temp =arr1[i];
//            arr1[i]=arr1[arr1.length-i-1];
//            arr1[arr1.length-i-1]=temp;
//        }
        //数组反转   方法二
        for (int i = 0, j = arr1.length - 1; i < j; i++, j--) {
            String temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
        }
        //遍历
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();

        //查找 搜索
        //线性查找
        String destination = "BB";
        boolean isFlag = true;
        for (int i = 0; i < arr.length; i++) {
            if (destination.equals(arr[i])) {
                System.out.println("找到了指定的元素，位置为：" + i);
                isFlag = false;
                break;
            }
        }
        if (isFlag) {
            System.out.print("没找到");
        }

        //二分法查找   前提所要查找的数组有序
        int[] arr2 = new int[]{-98, -34, 2, 34, 54, 66, 79, 105, 210, 333};
        int dest2 = 54;  //目标值
        int head = 0;//初始的索引
        int end = arr2.length - 1; //初始的末索引
        boolean isFlag2 = true;
        while (head <= end) {
            int middle = (head + end) / 2;
            if (dest2 == arr2[middle]) {
                System.out.println("找到了指定的元素，位置为：" + middle);
                isFlag2 = false;
                break;
            } else if (dest2 < arr2[middle]) {
                end = middle - 1;
            } else {
                head = middle + 1;
            }
        }
        if (isFlag2) {
            System.out.println("没有找到");
        }
    }
}
//冒泡排序   依次比较相邻两个元素的值
class BubbleSortTest01{
    public static void main(String[] args){
        int[] arr =new int[]{43,32,76,-98,0,64,33,-21,32,99};
        //冒泡排序
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}

class QuickSort {
    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    private static void subSort(int[] data, int start, int end) {
        if (start < end) {
            int base = data[start];
            int low = start;
            int high = end + 1;
            while (true) {
                while (low < end && data[++low] - base <= 0)
                    ;
                while (high > start && data[--high] - base >= 0)
                    ;
                if (low < high) {
                    swap(data, low, high);
                } else {
                    break;
                }
            }
            swap(data, start, high);

            subSort(data, start, high - 1);//递归调用
            subSort(data, high + 1, end);
        }
    }
    public static void quickSort(int[] data){
        subSort(data,0,data.length-1);
    }

    public static void main(String[] args) {
        int[] data = { 9, -16, 30, 23, -30, -49, 25, 21, 30 };
        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
        quickSort(data);
        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));
    }
}