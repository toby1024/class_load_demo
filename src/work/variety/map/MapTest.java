package work.variety.map;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a" ,"a1");
        map.put("b" ,"b1");
        map.put("c" ,"c1");
        System.out.println(map.entrySet().getClass());
        System.out.println(map.entrySet());
    }
}
