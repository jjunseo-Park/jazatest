public class ForEX {

    public static void main(String args[]) {
//         반복문: 특정 작업을 반복 수행하기 위해 사용

//         자바에서 반복문 사용을 위한 문법
//         for ( 변수 초기화; 조건식; 증감식; ) {
//                반복할 코드;}


        for (int i = 0; i < 10; i++) {
            System.out.println("ABC");
        }

        double result = 0;
        double x = 0.1 * 10;

        for (int i = 0 ; i < 10; i++) {
            result = result + x;
        }

        System.out.println("Result ==" + result / 10);

        // 1부터 11 까지 합 구하는 반복문 만들기
        int r = 0;
        for (int i = 1; i <= 11; i++) { // 1000 -> 11 수정
            r += i;                     // 세미콜론 확인
        }

    } // main 메서드 닫기
} // ForEX 클래스 닫기







