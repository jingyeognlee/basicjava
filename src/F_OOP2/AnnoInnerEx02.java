package F_OOP2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnnoInnerEx02 {
	public static void main(String[] args) {
		Button b = new Button();
	
		b.addActionListener(  //매개변수 자리에... 클래스 만드는거 숨기고
							new ActionListener() { 
						
							@Override
							public void actionPerformed(ActionEvent e) {
							System.out.println("버튼눌림");
				
							}
						}
		);
	}
}


