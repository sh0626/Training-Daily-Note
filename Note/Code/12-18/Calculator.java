package obj;

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    void displayResult(String operation, int result) {
        System.out.println("연산 결과: " + operation + " = " + result);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // 덧셈 연산
        int sumResult = calculator.add(5, 3);
        calculator.displayResult("5 + 3", sumResult);

        // 뺄셈 연산
        int subtractResult = calculator.subtract(8, 4);
        calculator.displayResult("8 - 4", subtractResult);
    }
}
