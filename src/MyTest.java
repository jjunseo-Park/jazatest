public class MyTest {

    public static void main(String args[]){
        // 기본 자료형 값이 넘어감
        int x = 10;
        int y = x;
        x = 100;
        System.out.println("x == " + x );
        System.out.println("y == " + y );

        // 기본 자료형 외 나머지 주소 값 넘어 감
        int[] xx = {10, 20, 30};
        int[] yy = xx;
        xx[0] = 1000;
        System.out.println("xx[0] == "+ xx[0]);
        System.out.println("yy[0] == " + yy[0]);

    }
}
