package Listmap;

public class JavaExam12_15_07_exam01 {
    public static void main(String[] args) {
        //while문을 사용해 1부터 100까지의 자연수 중 3의 배수의 합을 구하라
        int sum = 1;
        int n = 0;
        while (sum <= 1000) {
            sum++;
            if (sum % 3 == 0) {
                n += sum;

            }
        }
        System.out.println(n);
    }
}
