package Class.JavaExam12_19_02;

public class Tv implements Exm {
    private int vol;

    @Override
    public void turnOn() {
        System.out.println("TV킴");
    }

    @Override
    public void turnOff() {
        System.out.println("TV끔");
    }

    @Override
    public void setVol(int vol) {
        if (vol > Exm.Max_Vol) {
            this.vol = Exm.Max_Vol;
        } else if (vol < Exm.Min_Vol) {
            this.vol = Exm.Min_Vol;
        } else {
            this.vol = vol;
        }
        System.out.println("현재 소리 크기는 " + this.vol);
    }

    public static void main(String[] args) {
        Tv tv = new Tv();
        Exm.changeBatterey();
        tv.setVol(8);
        tv.turnOn();
        tv.turnOff();
        tv.setMute(false);
        tv.setMute(true);
    }
}
