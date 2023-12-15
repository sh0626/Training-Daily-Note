package Listmap;

import java.util.Arrays;
import java.util.HashSet;

public class JavaExam12_15_04 {
    public static void main(String[] args) {
        //중복된 값 제거 및 오름차순 정렬
        //인덱싱이 없다(자료의 주소값이 없다) -> linkedHashmap, TreeMap, HashSet
        //키캆으로 찾아오니까 인덱싱넘버가 필요없다
        HashSet<String> set = new HashSet<>(Arrays.asList("h","e","l","l","o"));
        System.out.println(set);

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(2,4,6,8,10));
        
        //교집합인 값만 출력
        HashSet<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println(intersection);
        //합집합 전부 출력(중복제거)
        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println(union);
        //차집합
        HashSet<Integer> subtract = new HashSet<>(s1);
        subtract.removeAll(s2);
        System.out.println(subtract);


    }



}
