package Listmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class JavaExam12_15_03 {
    public static void main(String[] args) {
//        HashMap<String,String> map = new HashMap<>();
//        map.put("people","사람");
//        map.put("basketball","농구");
//        System.out.println(map);
//        System.out.println(map.get("people"));
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("sim", 55);
        linkedHashMap.put("kim", 15);
        linkedHashMap.put("zoo", 35);

        System.out.println(linkedHashMap);

        //key값의 오름차순 기준으로 나옴
        Map<String, Integer> TreeMap = new TreeMap<>();
        TreeMap.put("sim", 55);
        TreeMap.put("kim", 15);
        TreeMap.put("zoo", 35);

        System.out.println(TreeMap);

    }
}
