public class IfEx {

    public static void main(String args[]) {
        int score = 89;
        // 점수가 90점 이상인지 확인
        if (score >= 90)
            System.out.println("A");
//         제어문: 특정된 조건 제어, 판정을 위해 사용되는 문법

        else if (score >= 80)
            System.out.println("B");
        
        else
            System.out.println("C");

        //자바의 연산자
        // 산술연산자: + - * / ++ -- += -=
        int x = 10;
        // x++; // x = x + 1
        // x--; // x = x - 1
        // ++x; // x = x + 1 바로 1추가
        //System.out.println(x++); // 이 라인이 끝난후 1 추가
        //System.out.println( x );

        //논리 연산자: &(and), |(or), &&. ||, +=, -=
        int k = 10;
        int j = 20;
//        if ( k == 10 & j == 20){
//            System.out.println("둘다 만족");
//        }
//        if ( k == 10 | j != 20){
//            System.out.println("둘중 하나만 만족");
//        }

        if ( k > 100 && (j += 10) > 20){
            System.out.println("&& 두개 사용");
        }
        System.out.println( j );
    }
}