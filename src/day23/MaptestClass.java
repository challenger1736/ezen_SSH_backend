package day23;

import java.util.HashMap;
import java.util.Map;

public class MaptestClass {
    public static void main(String[] args) {
//        Map<String,String> map = new HashMap<>();
//        map.put("put키1", "put밸류");
//        map.put("put키2", "put밸류");
//        System.out.println(map.get("put키1"));
//
//        map.remove("put키1");
//        System.out.println(map.get("put키1"));

        SimpleMap<String, Integer> map2 = new SimpleMap<String, Integer>();
        map2.put("1번키", 1);
        map2.put("2번키", 2);
        map2.put("3번키", 3);
        System.out.println(map2.get("1번키"));
        System.out.println(map2.get("2번키"));
        System.out.println(map2.get("3번키"));
        map2.remove("1번키");
        System.out.println(map2.get("1번키"));
        System.out.println(map2.get("2번키"));
        System.out.println(map2.get("3번키"));
        System.out.println(map2);
        System.out.println(map2.size());


    }

}
