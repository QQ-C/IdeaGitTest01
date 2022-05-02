package test07.Exer;


public class StringDemo {
/**
 * 将一个字符串进行反转。将字符串中指定部分进行反转 。比如 abcdefg 反转为 abfedcg
 * 方式一：转换为 char[]
 *
 */
    public String reverse(String str,int startIndex,int endIndex){
        if (str!= null){
            char[] arr =str.toCharArray();
            for(int x=startIndex,y=endIndex;x<y;x++,y--){
                char temp = arr[x];
                arr[x]=arr[y];
                arr[y]=temp;
            }
            return new String(arr);
        }
        return null;
    }

    //方式二：使用String的拼接

}
