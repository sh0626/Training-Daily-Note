package Class.JavaExam12_19_02.JavaExam12_20_01;

class CalSample {
    int value;

    CalSample() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
}

class UpgradeCalculator extends CalSample {
    void minus(int val) {
        this.value -= val;
    }
}

public class Cal1 {
    public static void main(String[] args) {
        UpgradeCalculator cal = new UpgradeCalculator();
        cal.add(10);
        cal.minus(3);
        System.out.println(cal.getValue()); // 10 출 력
    }
}
