package Class.JavaExam12_19_02.JavaExam12_20_01;

interface MineralIF {
    int getValue();
}

class Gold implements MineralIF {
    public int getValue() {
        return 100;
    }
}

class Silver implements MineralIF {
    public int getValue() {
        return 90;
    }
}

class Bronze implements MineralIF {
    public int getValue() {
        return 80;
    }
}


class MineralCalculator {
    int value = 0;

    public void add(MineralIF mineralIF) {
        this.value += mineralIF.getValue();
    }

    public int getValue() {
        return this.value;
    }
}

public class Mineral {
    public static void main(String[] args) {
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue()); // 270 출 력
    }
}