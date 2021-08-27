package test04.Exer;

public class ThisBoyGirlTest {
    public static void main(String[] args){
        ThisBoyTest boy1 =new ThisBoyTest("luomio",21);
        boy1.shout();

        ThisGirlTest girl1 = new ThisGirlTest("zhuliye",18);
        girl1.marry(boy1);

        ThisGirlTest girl2 = new ThisGirlTest("zhuyingtai",19);
        int compare = girl1.compare(girl2);
        if(compare>0){
            System.out.println(girl1.getName()+"大");
        }else if(compare<0){
            System.out.println(girl2.getName()+"大");
        }else{
            System.out.println("一样大");
        }


    }
}
