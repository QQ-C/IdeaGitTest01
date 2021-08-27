package test03.demo;

/**
 * 可变个数形参的方法：
 * 格式：  数据类型 ... 变量名
 */
public class MethodArgsTest01 {
    public static void main(String[] args){
        MethodArgsTest01 test=new MethodArgsTest01();
        test.show(12);
        test.show("helle");
        test.show("hello","world");

    }
//构成重载
    public void show(int i){
        System.out.println(1);
    }
    public void show(String s){
        System.out.println("show(String)");
    }
    public void show(String ... strs){
        System.out.println("n");
    }
}
