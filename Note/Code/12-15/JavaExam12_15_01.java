package Listmap;

import java.util.Arrays;
import java.util.ArrayList;

public class JavaExam12_15_01 {
    public static void main(String[] args) {
//        ArrayList pitches = new ArrayList();
//        pitches.add("138");
//        pitches.add("129");
//        pitches.add("264");
//        System.out.println(pitches);
//        System.out.println(pitches.get(1));
//        ArrayList<String> pith = new ArrayList<>(10);
//        pith.add("123");
//        pith.add("2314");
//        pith.add("2314");
//        pith.add("2314");
//        pith.add("2314");
//        pith.add("2314");
//        pith.add("2314");
//        pith.add("2314");
//        System.out.println(pith);
//        System.out.println(pith.size());
//        pitches.addAll(pith);
//        System.out.println(pitches);
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add(4,"5");
        System.out.println(list);
        ArrayList<String> clonelist = (ArrayList<String>) list.clone();
        System.out.println(clonelist);
        for(String i : list){
            System.out.println(i);
        }
    }
}
