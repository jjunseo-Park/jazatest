
// 객체지향형 프로그래밍 출발점
// 유지보수가 편리한 프로그래밍 출발점
//

class Person {
    private String name;
    public int age;

    // 멤버변수 초기화를 생성장
    // 생성자 3개 정의
    // 1) 아무런 값을 받지 않는 생성자
    public Person() {
        this ( "김길동", 20);
    }
    // 2) 나이, 이름, 순으로 값을 받는 생성자
    public Person( int a, String n) {
        this ( n, a ); // 생성자 호출
    }
    // 3) 이름 나이 순으로 값을 받는 생성자
    public Person ( String n,int a) {
        name = n + "님";
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String n ) {
        name = n + "";
    }
    public String getName() {
        return name;
    }
}

public class OOPEx1 {

    public static void main(String args[]) {



        Person p1 = new Person();
        p1.setName("최준영");
        p1.age = 20;
        System.out.println( p1.getName() );
        System.out.println( p1.age );

        Person p2 = new Person();
        p2.age = 25;
        p2.setName("성도현");

        Person p3 = new Person();
//        p3.name = "김근형";  // 이건 OOP가 아님 > 유지보수 불편
        p3.age = 30;
        p3.setName("김근형");  // 유지보수 편해짐
    }
}
