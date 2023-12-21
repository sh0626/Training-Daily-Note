package Class.JavaExam12_19_02.JavaExam12_20_01;

class Calculator {
    int isOdd(int num) {
        if (num % 2 == 1) {
            System.out.println("true");
        } else if (num % 2 == 0) {
            System.out.println("false");
        }
        return num;
    }
    /*boolean isOdd(int su) {
        return su % 2 == 1;
    }*/
}

public class Cal {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.isOdd(3)); //3은 홀수이므로 true
        System.out.println(cal.isOdd(4)); //4는 짝수이므로 false
    }
}
