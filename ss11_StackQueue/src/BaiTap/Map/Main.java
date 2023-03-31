package BaiTap.Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String st1 = "ba Ba ba ban bun bo ba bi bo binh ban be bung";
        String[] arrSt = st1.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for(String s:arrSt){
            if(map.containsKey(s)){
                Integer value = map.get(s);
                value++;
                map.replace(s, value);
            }else{
                map.put(s, 1);
            }
        }
        System.out.println("-------------------------");
        System.out.println(map.toString());
    }
}
