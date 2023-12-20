package obj.JavaExam12_19_01;

public class Car {
    String company = "Hun-dia";
    String model;
    String color;
    int maxSpeed;

    Car() {
        //디폴트 생성자
        // 디폴트 생성자를 구현하면
        // new Car()로 Car 클래스의 객체가 만들어질때
        // 디폴트 생성자 Car()가 실행
        System.out.println("클래스 기본 생성자");
    }

    Car(String model) {
        this.model = model;
    }

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
