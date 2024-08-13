package controller;

public class Ex02 {
	
	public Ex02() {
		super();
	}
	
	public int Divide (int a, int b, int div) {
		if (a < b) { 
			return div;
		}else {
			a = a - b;
			div++;
		}
		return Divide(a, b, div);
		
	}

}
