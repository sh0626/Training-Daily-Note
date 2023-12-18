package obj;

class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}

public class JavaExam12_18_02 {
    public static void main(String[] args) {
        Animal cat = new Animal(); //Animal클래스의 객체 생성, 인스턴스 cat
        cat.setName("냐옹");
        System.out.println(cat.name);
    }
}
