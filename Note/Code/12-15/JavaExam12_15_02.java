package Listmap;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaExam12_15_02 {
    public static void main(String[] args) {
//        String[] data = {"1", "2", "3", "4", "5", "6"};
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6"));
        System.out.println(list2);
        System.out.println(list2.get(0) + ", " + list2.get(1) + ", " + list2.get(2));
        //출력 1
        String result = "";
        for (int i = 0; i < list2.size(); i++) {
            result += list2.get(i);
            result += ", ";
        }
        result = result.substring(0, result.length() - 2);
        System.out.println(result);
        //출력2
        String res = String.join(", ", list2);
        System.out.println(res);
    }
}
