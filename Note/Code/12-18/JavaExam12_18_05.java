package obj;

class Exm {
    int sum(int a, int b) {
        return a + b;
    }
}

public class JavaExam12_18_05 {
    public static void main(String[] args) {
        int a = 3;
        int b = 10;
        Exm hap = new Exm();
        int c = hap.sum(a, b);
        System.out.println(c);
    }
}
