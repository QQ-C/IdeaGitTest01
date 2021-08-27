package test03.exer;

/**31 编写程序 声明一个 method 方法 在方法中打印一个 10*8 的*型 矩形 在 main 方法中调用该方法 。
 32 修改上一个程序 在 method 方法中 除打印一个 10 8 的 型矩形外 再计算该矩形的面积 并将其作为方法返回值 。 在 main 方法中调用该方法
 接收返回的面积值并打印 。
 3.3修改上一个程序，在 method 方法提供 m 和 n 两个参数，方法中打印一个m*n 的 型矩形，并计算该矩形的面积， 将其作为方法返回值。在 main 方法
 中调用该方法，接收返回的面积值并打印。
 */
public class RectangleTest01 {
    public static void main(String[] srgs){
        RectangleTest01 rec=new RectangleTest01();
//        rec.method();

//        int area = rec.method();
//        System.out.println(area);
//        System.out.println(rec.method());

        int area=rec.method(10,8);
        System.out.println(area);

    }

//    public void method(){
//        for(int i=0;i<10;i++){
//            for(int j=0;j<8;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

//    public int method(){
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        return 10*8;
//    }

    public int method(int m,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return m*n;
    }

}

