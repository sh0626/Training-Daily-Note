package Class.JavaExam12_19_02.JavaExam12_20_01;

class Product {
    int price;
    int bonusPoint;

    Product() {
        //이 생성자는 Tv클래스의 Tv()생성자가 받는다
    }

    Product(int price) { //오버로드
        this.price = price;
        bonusPoint = (int) (price / 10.0);
        System.out.println(bonusPoint);
    }
}

class Tv extends Product {
    Tv() {
        //Product 생성자를 받음
    }

    /*Tv(int i) {
        super(i); //부모클래스의 메소드를 우선적으로 불러옴
    }*/

    public String toString() {
        return "Tv";
    }
}

public class main {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}
