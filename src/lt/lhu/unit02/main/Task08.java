package lt.lhu.unit02.main;

public class Task08 {

	public static void main(String[] args) {
		double x, Fx;

		double a = 3;
		double b = 8;
		double h = 4;

		for (x = a; x <= b; x += h) {
			System.out.print("x = " + x);

			if (x < b) {
				Fx = 2 * Math.tan(x / 2) + 1;
				System.out.println("  F(x) = " + Fx);

			}
		}

	}

}
