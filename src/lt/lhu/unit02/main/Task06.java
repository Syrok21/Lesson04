package lt.lhu.unit02.main;

public class Task06 {

	public static void main(String[] args) {
		double a = 8;
		double b = 4;
		double c = 5;
		double d = 7;

		double temp;
		double z;

		temp = (a / c) * (b / d);
		z = temp - ((a * b - c) / (c * d));

		System.out.println(" z = " + z);

	}

}
