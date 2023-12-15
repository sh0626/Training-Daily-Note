package Listmap;

import java.util.ArrayList;

public class JavaExam12_15_07 {
    public static void main(String[] args) {
//        int money = 2000;
//        boolean hasCard = true;
//        if (money >= 3000 && hasCard) {
//            System.out.println("버스이용");
//        } else {
//            System.out.println("걸어");
//        }
//
//        ArrayList<String> po = new ArrayList<String>();
//        po.add("paper");
//        po.add("handphone");
//        po.add("don");
//        if (po.contains("paper")) {
//            System.out.println("버스이용");
//        } else {
//            System.out.println("걸어");
//        }
//
//        int month = 4;
//        String monthString = "";
//        switch (month) { //byte, short, char, int, enum, String
//            case 1: monthString = "Jan";
//                break;
//            case 2: monthString = "Feb";
//                break;
//            case 3: monthString = "Mar";
//                break;
//            case 4: monthString = "Apr";
//                break;
//            default: monthString = "없음";
//                break;
//        }
//        System.out.println(monthString);

//        int treeTen = 0;
//        while (treeTen < 10) {
//            treeTen++;
//            System.out.println(String.format("나무 %d번 찍음", treeTen));
//            if (treeTen == 10) {
//                System.out.println("나무 다 찍음");
//            }
//        }

//        int[] mark = {90, 55, 60, 75, 85, 43};
//        for (int i = 0; i < mark.length; i++) {
//            if (mark[i] >= 60) {
//                continue;
//            } else {
//                System.out.println((i + 1) + "번 합격");
//                System.out.println((i + 1) + "번은 아님");
//            }
//        }

        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
            }
            System.out.println("");
        }
    }
}
