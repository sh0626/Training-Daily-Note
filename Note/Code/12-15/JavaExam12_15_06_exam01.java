package Listmap;

import java.util.Map;
import java.util.TreeMap;

public class JavaExam12_15_06_exam01 {
    public static void main(String[] args) {
        Map<String, Integer> TreeMap = new TreeMap<>();
        TreeMap.put("국어", 55);
        TreeMap.put("영어", 15);
        TreeMap.put("수학", 35);

        System.out.println(TreeMap);
        System.out.println(TreeMap.get("국어"));

        int sum=0;
        for(int value: TreeMap.values()) {
            sum += value;
        }
        System.out.println(sum);
    }
}
