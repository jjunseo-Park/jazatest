// 멤버번수, 지역변수 구분
// 멤버변수 : 클래스 전체에서 사용가능한변수, 초기화 값을 넣어주지 않으면 자동 초기화
// 지역변수 : 특정 지역에서만 사용가능한 변수, 대표지역 = 메소드
// 변수 선언이 어디에 되어 있나가 기준

import java.lang.reflect.Member;

class MyMember{
    //멤버변수
    int y;
    static int j = 50;
}

public class MemberVariableEx {
    int k = 30;


    public static void main(String args[]) {
        // 변수 선언을 메인 메서드 안에서 했으므로 메인 메소드에서만 사용 가능한 지역변수
        int x = 10;
        System.out.println( x );

        MyMember m =  new MyMember();
        System.out.println( m.y );

        MemberVariableEx mx = new MemberVariableEx();
        System.out.println( mx.k );

        // static 선언된 변수는 알아서 메모리에 올라가기 때문에
        // 우리가 메모리에 올릴 필요는 없지만 사용할때 어떤 클래스가 속하는지
        // 클래스명으로 지정이 필요함
        System.out.println( MyMember.j );

    }
}
