public class Test {

    public static void main(String args[]){

        // 구구단 만들어보자 ㅎㅎ

        // 1부터 9까지 반복하는 for 문 만들기
        for (int j = 1; j < 10; j++){
            // 1부터 9까지 곱하는 식 만들기
            for ( int i = 1; i < 10; i++ ){
                int result = j * i;
                System.out.println(j + " * "+ i + " = " + result);
            }
        }
    }
}
