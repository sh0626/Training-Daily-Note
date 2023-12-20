package Class.JavaExam12_19_02;

public interface Exm {
    public int Max_Vol = 10; //전역상수
    public int Min_Vol = 0;

    void turnOn();

    void turnOff();

    void setVol(int vol);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음처리");
        } else {
            System.out.println("무음해제");
        }
    }

    static void changeBatterey() {
        System.out.println("배터리 교체");
    }
}
