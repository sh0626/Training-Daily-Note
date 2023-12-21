package Class.JavaExam12_19_02.JavaExam12_20_01;

import java.util.ArrayList;
import java.util.Arrays;

//메소드 오버로딩
class Caldata {
    int sum = 0;
    int sum1 = 0;

    int avg(int[] data) {
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum / data.length;
    }

    int avg(ArrayList<Integer> data1) {
        for (int i = 0; i < data1.size(); i++) {
            sum1 += data1.get(i);
        }
        return sum1 / data1.size();
    }
}

public class Cal2 {
    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 9};
        Caldata cal = new Caldata();
        int result = cal.avg(data);
        System.out.println(result);

        ArrayList<Integer> data1 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        int result1 = cal.avg(data1);
        System.out.println(result1);

        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = a;
        a.add(4);
        System.out.println(a);
        System.out.println(b);
    }
}
