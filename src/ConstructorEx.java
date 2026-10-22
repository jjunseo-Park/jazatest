// 생성자 : 클래스가 객체화 될때 단 한번 호출되는 놈
// 생성자 문법
// 메소드와 유사하나 리턴형이 없고 이름이 클래스명과 같아야함
// 생성자는 왜 쓰나 = 멤버변수 초기화


    class Mycon {
        // 맴버변수
        String name;
        int age;

        //생성자
        public Mycon() {
            age = 20;
            name = "홍길동";
        }

        public Mycon( int a, String n ){
            age = a;
            name = n;
            System.out.println("생성자 호출");
        }
        public Mycon( String n, int a ){
            age = a;
            name = n;
        }

    }

public class ConstructorEx {

    public static void main(String arg[]){
        // Mycon 생성자를 호출하여 입력받은 맴버변수로 초기화
        Mycon m1 = new Mycon(10, "김길동");
        System.out.println(m1.name);

        Mycon m2 = new Mycon("박길동", 30);
        System.out.println(m2.name);
    }
}