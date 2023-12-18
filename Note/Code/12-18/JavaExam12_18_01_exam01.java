package obj;

public class JavaExam12_18_01_exam01 {
    public static void main(String[] args) {
        //총 열개의 데이터를 배열로 입력 받아
        //평균 구하기
        //각각의 입력 값이 60점 미만인 경우 불합격
        //합격과 불합격 출력
        int[] arr = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            avg = sum / arr.length;

            if (arr[i] < 60) {
                System.out.println("불합격");
            } else {
                System.out.println("합격");
            }
        }
        System.out.println(avg);
    }
}
