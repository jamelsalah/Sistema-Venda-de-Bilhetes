package aula;

public class calcparalela {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Thread c1 = new Thread( () -> calc.add(1, 2));
		Thread c2 = new Thread( () -> calc.add(3, 4));
		Thread c3 = new Thread( () -> calc.divi(3, 4));
		Thread c4 = new Thread( () -> calc.multi(3, 4));
		Thread c5 = new Thread( () -> calc.sub(3, 4));
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		
	}
	
	static class Calculadora {
		public int add(int a, int b) {
			int c = a+b;
			System.out.println(a + "+" + b + "=" + c); 
			return c;
		}
		
		public double divi(double a, double b) {
			double c = a / b;
			System.out.println(a + "/" + b + "=" + c); 
			return c;
		}
		
		public int multi(int a, int b) {
			int c = a * b;
			System.out.println(a + "*" + b + "=" + c);
			return c;
		}
		
		public int sub(int a, int b) {
			int c = a - b;
			System.out.println(a + "-" + b + "=" + c);
			return c;
		}
	}
}