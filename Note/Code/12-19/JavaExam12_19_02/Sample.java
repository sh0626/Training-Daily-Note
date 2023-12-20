package Class.JavaExam12_19_02;

interface Predator {
    String getfood();
}

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Predator {
    public String getfood() {
        return "apple";
    }
}

class Lion extends Animal implements Predator {
    public String getfood() {
        return "banana";
    }
}

class ZooKeeper {
    void feed(Predator predator) {  // 호랑이가 오면 사과를 던져 준다.
        System.out.println("feed " + predator.getfood());
    }
}

public class Sample {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);  // feed apple 출력
        zooKeeper.feed(lion);  // feed banana 출력
    }
}