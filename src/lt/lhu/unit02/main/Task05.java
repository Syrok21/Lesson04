package lt.lhu.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		double a = 8;
		double b = 4;
		double c = 5;

		double d;
		double temp;

		temp = b + Math.sqrt(b * b + 4 * a * c) / 2 * a;
		d = temp - Math.pow(a, 3) * c + b;

		System.out.println(" d = " + d);

	}

}
