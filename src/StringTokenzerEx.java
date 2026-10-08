    // 문자열 쪼개기
    // 화면에서 입력받은 값들을 기본적으로 전부 문자열로 취급됨
    // 예를 들어서 계산기 화면에서 입력한 계산식은
    // 실제 2+3+1 이라고 입력되었다 할 지 라도
    // 애내들은 "2+3+1" 이라는 문자열로 취급됨


    import java.util.StringTokenizer;

    public class StringTokenzerEx {

    public static void main(String args[]) {
        // 계산기에서 입력된 식이 아래와 같다고 가정
        String str = "2+3";

        // 위 계산식 중간에 연산자가 뭔지를 파악하고
        // 그에따라 적합한 사칙연산 계산을 해주기 위해
        // 우선적으로 연산자와 피연산자를 분리해낸다

        // 문자열을 분리해낼때 기본적으로 자바에서
        // 제공하고 있는 클래스 StringTokenizer 사용

        StringTokenizer t = new StringTokenizer(str, "+");

        String temp = t.nextToken(); // 분리된 값 순서대로 가져오기
        System.out.println(temp);


        temp = t.nextToken();
        System.out.println(temp);

        // 뽑아낸 2 3 덧셈
        System.out.println(temp + temp);
    }
}
