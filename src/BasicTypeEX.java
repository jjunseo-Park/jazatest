public class BasicTypeEX {

    public static void main(String args[]) {

        // 자바의 기본 자료형
        // 기본 자료형은 변수에 값이 넘어감

        // 1) 정수형 : 암묵적 디폴트 값은 int 그냥 써라
            //byte(용량 1byte) - short(2byte) - int(4byte) - long(8byte)
            byte b = 10; // 1byte가 가질수 있는 숫자 범위는 -128 ~ +127
            //byte result = b + 1; short result = b + 1 안됨
            int result = b - 1; // 가능 자바애서 정수타입 산술연산을 하면 int 타입으로 바뀜

        // 2) 실수형: 명시적으로 디폴드 값은 double 형
            float f = 0.1f; //float type은 디폴트타입이 아니므로 사용시 f, F 를 달아줘야 함
            double d = 0.1; // 걍 이거 써라

        // 3) 문자형: 문자 하나를 저장하기 위한 기본자료형
        char c = 'A';
        char c2 = 66; // 아스키코드표 상에 값으로 저장도 가능
        System.out.println( c );
        System.out.println( c2 );
        //


        // 4) 불린형: true or false 만 저장가능
        boolean boo = true;
        boo = false;
    }
}
