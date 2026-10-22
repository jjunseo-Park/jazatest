import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 버튼 클릭에 대한 처리
// 1. 버튼 클릭이 되는지 지속적으로 감시
//  1.1 Listener 를 만들어서 버튼 클릭을 감시

// 2. 바튼이 클린된걸 알게되면 우리가 원하는 코드를 실행
//  2.1 Listener 에 버튼이 클릭되었을때 실행할 코드를 구현

//ActionListener : 버튼클릭 엔터 입력을 감시할 수 있는 기능을 가짐

// 버튼클릭 감시해줄 Listener
class MyListener implements ActionListener {
    JButton b;
    int count = 0;
    public MyListener(JButton x) {
        b = x;
    }

    // 콜백 메소드
    public void actionPerformed(ActionEvent e) {
        // 버튼이 클릭 되었을때 호출 되는 메소드
        // System.out.println("버튼이 클릭됨");
        count++;
        b.setText(count+"");
    }
}



class ButtonUI{
    JFrame jf;
    JButton b;

    public ButtonUI() {
        // 화면 버튼
        jf = new JFrame("타이틀명");
        b = new JButton("눌러라");
        // 이름 바꾸기


        // 버튼클릭 감시 기능 가지고 있는 감시자 객체화
        MyListener m = new MyListener(b);
        // 감시 대상 지정
        b.addActionListener(m); // 버튼 b에 감시자 달기

        jf.add(b); // 판에 버튼추가

        // 화면 크기
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 강제종료 활성화
        jf.setLocation(250, 250);
        jf.setSize(300, 300);
        jf.setVisible(true); // 화면에판 추가
    }
}

public class ButtonClickEx {
    // callback method
      public static void main(String args[]) {
          new ButtonUI();
    }
}
