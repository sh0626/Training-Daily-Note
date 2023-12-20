package Class.JavaExam12_19_02.JavaExam12_19_03;

public class CarExm {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setSpeed(-100);
        System.out.println(myCar.getSpeed());
        myCar.setSpeed(60);

        if (myCar.isStop()) {
            myCar.setStop(true);
            System.out.println("현재 속도 : " + myCar.getSpeed());
        }

        // @Getter @Setter
        // Annotation (Metadata) 핵심, 기원
        //컴파일과 실행 과정 상에서 코드를 어떻게
        //컴파일하고 처리할지에 대한 정보
    }
}
