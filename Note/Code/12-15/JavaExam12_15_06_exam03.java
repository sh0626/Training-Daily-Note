package Listmap;

import java.util.*;

public class JavaExam12_15_06_exam03 {
    public static void main(String[] args) {
        //arrayList asList
        //1,7,2,4,5,3,6 역순 출력
        ArrayList<Integer> s1 = new ArrayList<>(Arrays.asList(1, 7, 2, 4, 5, 3, 6));
//        Collections.sort(s1, Collections.reverseOrder());
        s1.sort(Comparator.reverseOrder());
        System.out.println(s1);
    }
}
