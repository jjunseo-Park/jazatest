
// 자바에서 상속(extends)
// 자바에서 상속의 대상은 기본적으로 class
// 특정 클래스 상속을 위해서 자바에서는 "extends" 문법을 사용

class MYA{
    int x = 10;
    public MYA() {

    }

    public MYA(int x) {
        this.x = x;
    }

    public void printX() {
        System.out.println("x = " + x);
    }
}

class MYB extends MYA {
}

public class ExtendEx {
    public static void main(String args[]) {
        // MYA 클래스 객채화 > 클래스를 메모리에 올리기
    //    MYA a =  new MYA();
        MYA a = new MYA(5);
        System.out.println( a.x );
        a.printX();

        MYB b = new MYB();
    //    MYB b = new MYB(15);
        System.out.println( b.x );
        b.x = 20;
        b.printX();
    }
}
