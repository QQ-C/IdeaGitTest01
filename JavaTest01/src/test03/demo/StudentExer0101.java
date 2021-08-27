package test03.demo;
/**定义类 Student ，包含三个属性：学号 number(int) int)，年级 state(int) int)，成绩score(int) 。 创建 20 个学生对象，
 * 学号为 1 到 20 ，年级和成绩都由随机数 确定。
 问题一：打印出 3 年级 (state 值为 3 ）的学生信息 。
 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 提示
 1)生成随机数： Math.random() random()，返回值类型 double;
 2)四舍五入取整： Math.round(double d) ，返回值类型 long 。
 */

//封装到方法中

public class StudentExer0101 {
    public static void main(String[] args) {
        //声明一个student类型的数组
        Student0101[] stus = new Student0101[20];
        for (int i = 0; i < stus.length; i++) {
            //给数组元素赋值
            stus[i] = new Student0101();
            //给Student对象的属性赋值
            stus[i].number = (i + 1);
            //年级 1 - 6
            stus[i].state = (int) (Math.random() * 6 + 1);
            //成绩 0-100
            stus[i].score = (int) (Math.random() * 100 + 1);
        }

        StudentExer0101 test=new StudentExer0101();
        //遍历
        test.print(stus);
        //打印三年级
        test.searchState(stus,3);
        //冒泡排序
        test.sortState(stus);
        //遍历
        test.print(stus);
    }


    /**
     * 遍历学生数组
     * @param stus 要遍历的数组
     */
    public void print(Student0101[] stus){
        for(int i=0;i<stus.length;i++){
            System.out.println(stus[i].infoStudent());
        }
        System.out.println("****************");
    }

    /**
     * 打印X年级学生信息
     * @param stus 要查找的数组
     * @param state 要找的年级数
     */
    public void searchState(Student0101[] stus,int state){
        for(int i=0;i<stus.length;i++){
            if(stus[i].state==state){
                System.out.println(stus[i].infoStudent());
            }
        }
        System.out.println("****************");
    }

    /**
     * 问题二、使用冒泡按学生成绩排序，并遍历所有学生信息
     * @param stus 给这里面的数组 按照成绩进行排序
     */
    public void sortState(Student0101[] stus){
        for(int i=0;i<stus.length-1;i++){
            for(int j=0;j<stus.length-1-i;j++){
                if(stus[j].score>stus[j+1].score){
                    Student0101 temp=stus[j];      //注意交换的不是分数score 而是Student对象（这一数组中的元素）
                    stus[j]=stus[j+1];
                    stus[j+1]=temp;
                }
            }
        }
    }


}

class Student0101 {
    int number; //学号
    int state;  //年级
    int score;  //分数

    //显示学生信息的方法
    public String infoStudent(){
        return "学号："+number+" , 年级："+state+" , 成绩"+score;
    }

}