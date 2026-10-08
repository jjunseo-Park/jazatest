// string class = 자바에서 문자열 저장/관리를 위해 제공하는 클래스
// string class 특징 2가지
    // 1. 암묵적인 객체생성을 지원
        // String str = new String("ABC") 원칙적으로 이렇게 만들어야함
        // String str = "ABC" 편하게 쓸수 있도록 이렇게 지원함


    // 2. 불변적인 특징

public class StringEx {

    public static void main(String args[]) {

        // String class 사용 원칙
        String str1 = new String("ABC");
        String str2 = new String("ABC");


        // 문자열 값 비교
        // 값 비교시는 equals 사용해야 함
        if ( str1.equals( str2 ) ) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }

        // 1) 암묵적인 객체 생성 지원
        String str3 = "ABC"; // > 암묵적 new String("ABC")가 일어남
        String str4 = "ABC";

        if ( str3 == str4 ) {
            System.out.println("str3 과 4는 값이 같다");
        } else {
            System.out.println("값이 다르다");
        }


        // (2) 불변적인 특징
        String str5 = "ABC";
        str5 = str5 + "D";
        str5 = str5 + "E";
        // str5에는 ABC, ABCD ABCDE 세개가 메모리에 저장
    }
}
