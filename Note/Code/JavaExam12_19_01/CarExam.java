package obj.JavaExam12_19_01;

public class CarExam {

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.company);
        System.out.println();

        Car car2 = new Car();
        System.out.println(car2.company);
        System.out.println(car2.model);
        System.out.println();

        Car car4 = new Car("model", "blue", 100);
        System.out.println(car4.company);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.maxSpeed);
    }
}
