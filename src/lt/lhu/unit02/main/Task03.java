package lt.lhu.unit02.main;

public class Task03 {

	public static void main(String[] args) {
		double a = 8;
		double b = 9;
		double c = 5;

		double d;
		double temp;

		temp = a * a - Math.pow(b - c, 2);
		d = temp + Math.log(b * b + 1);

		System.out.println(" d = " + d);

	}

}
