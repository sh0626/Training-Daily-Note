package Listmap;

import java.util.Map;
import java.util.TreeMap;

public class JavaExam12_15_06_exam02 {
    public static void main(String[] args) {
        // 주민번호를 가지고 출생연도와 번호부분을
        // 출생년도:880407
        // 번호 : 2345711
        int birth = 880407;
        int num = 2345711;
        System.out.println(birth + "-" + num);
        System.out.println("출생년도: " + birth);
        System.out.println("번호: " + num);

        Map<String, Integer> TreeMap = new TreeMap<>();
        TreeMap.put("출생년도", birth);
        TreeMap.put("번호", num);
        System.out.println(TreeMap);

        String date = "880407-2345711";
        System.out.println("출생년도 : "+date.substring(0,6));
        System.out.println("번호 : "+date.substring(7,14));
    }
}
