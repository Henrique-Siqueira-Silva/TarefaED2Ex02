package view;
import javax.swing.JOptionPane;
import controller.Ex02;


public class mainEx02 {
	public static void main (String args[]) {
		Ex02 m = new Ex02();
		
		int a =0; 
		int b = 0;
		int resp = 0;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor"));
		
		resp = m.Divide(a, b, 0);
		System.out.println(resp);
		
		
	}

}

