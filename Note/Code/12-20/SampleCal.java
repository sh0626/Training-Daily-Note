package Class.JavaExam12_19_02.JavaExam12_20_01;

class sCal {
    Integer value;

    sCal() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    public Integer getValue() {
        return this.value;
    }

}

public class SampleCal {
    public static void main(String[] args) {
        sCal cal = new sCal();
        cal.add(3); // 여 기 서 NullPointerException 이 발 생 한 다 .
        System.out.println(cal.getValue());
    }
}
