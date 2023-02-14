package lt.lhu.unit02.main;

public class Task07 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;

		a = 4;
		b = 2;
		c = -7;

		double J, I, S;

		if (a >= 0) {
			J = Math.pow(a, 2);
			System.out.println("а в квадрате = " + J);
		} else {
			J = Math.pow(a, 4);
			System.out.println("а в четвертой степени = " + J);
		}

		if (b >= 0) {
			I = Math.pow(b, 2);
			System.out.println("b в квадрате = " + I);
		} else {
			I = Math.pow(b, 4);
			System.out.println("b в четвертой степени = " + I);
		}

		if (c >= 0) {
			S = Math.pow(c, 2);
			System.out.println("c в квадрате = " + c);
		} else {
			S = Math.pow(c, 4);
			System.out.println("c в четвертой степени = " + S);
		}

	}

}
