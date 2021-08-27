package test02.demo;
//二维数组的使用

public class ArrayTest2 {
    public static void main(String[] args) {
        //二维数组的初始化
        int[][] array1 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};  //静态初始化
        String[][] strArray1=new String[3][2];
        String[][] strArray2 = new String[3][];
        //指定位置的元素
        System.out.println(array1[0][1]);//2
        System.out.println(strArray1[1][1]);//null
        strArray2[1]=new String[4];
        System.out.println(strArray2[1][0]);//null
        //长度
        System.out.println(array1.length);//3
        System.out.println(array1[1].length);//2
        //遍历二维数组
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
//默认初始化值 int[][] =new int[4][3]
//外层元素初始化值：地址值
//内层元素初始化为：与一维数组初始化情况相同
class ArrayTest21{
    public static void main(String[] args) {
        int[][] arr=new int[4][3];
        System.out.println(arr[0]);  //[I@723279cf     是一个地址值
        System.out.println(arr[0][0]);//0
    }
}
class ArrayLessenTest{
    public static void main(String[] args) {
        int[] arr=new int[5];
        String[] arr1 = new String[]{"Tom","Jerry","Jim"};
        int[][] arr2=new int[3][4];
        int[][] arr3=new int[3][];
        int[][] arr4=new int[][]{{1,2,3},{2,3,4}};
    }
}