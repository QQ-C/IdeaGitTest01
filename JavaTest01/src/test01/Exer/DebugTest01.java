package test01.Exer;

import java.util.HashMap;

public class DebugTest01 {
    public static void main(String[] args){
        HashMap<String,String> map=new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","Tsinghua");
        map.put("major","computer");

        String age=map.get("age");
        System.out.println("age=" + age);

        map.remove("major");
        System.out.println(map);
    }
}
