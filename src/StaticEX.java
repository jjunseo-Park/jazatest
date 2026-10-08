class MyPrint {
    public void printA() {
        System.out.println("A");
    }

public class StaticEX {
    int x = 10;
}

    public static void main(String args[]) {
     //   StaticEX s = new StaticEX(); // 객체화 한다 객체한 메모리에 올리는 것
       // System.out.println(s.x);
        MyPrint m = new MyPrint();
        m.printA();
        // class 에서 static 했을때는 Myprint.printA() 해야 됨

    }
}
