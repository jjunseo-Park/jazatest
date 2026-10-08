// 자바에서는 함수를 메소드라고 부름

import java.lang.reflect.Method;

class MyMethod{
    // 메소드 정의를 위한 기본 문법
    // 접근제한자 리턴형 메소드이름 ( 파라미터 ) { 코드 }
    // 종류: public, protected, default, private

    // 리턴형: 메소드를 호출하고 나면 결과가 나올테고 그 결과가 어떤 값으로 리턴되는가?
    // 종류: 기본자료형, 겍체형(기본자료형 외 나머지)

    // 파라미터: 메소드를 호출할때 어떤 값을 넘겨줄건가 규정

        public int add(int x, int y) {
            int result = x + y;
            return result;
        }

        // MyMethod 클래스 안에 뺄셈 메소드 추가
        public int sub(int x, int y) {
            int result = x - y;
            return result;
        }

        // 실수
        public double flo(double x, double y) {
            double result = x + y;
            return result;
        }
    }

public class MethodEx {


    public static void main(String args[]) {
        // 위에 만들어 놓은 메소드 사용
        // add() 메소드 메몰에 올려놓고 CPU에게 실행해줘 해야함
        // 자바에서는 메소드만 메모리에 올릴수는 없고 클래스 단위로 메모리에 올리는게 가능
        // 그래서 add()메소드가 포함되어있는 MyMethod class 를 통째로 메모리에 올려야함
        MyMethod m = new MyMethod(); // 클래스를 메모리에 올리겠다.
        // 덧셈 호출
        int r = m.add(10, 20);
        System.out.println(r);

        // 뺄셈 호출 (m 하나로 바로 사용)
        int z = m.sub(20, 10);
        System.out.println(z);

        double x = m.flo(0.1, 0.2);
        System.out.println(x);

    }
}
