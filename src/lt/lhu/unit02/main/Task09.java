package lt.lhu.unit02.main;

public class Task09 {

	public static void main(String[] args) {

		int x;
		double Fx;

		x = 7;

		if (x <= -3) {
			Fx = 9;
		} else {
			Fx = 1 / (Math.pow(x, 2) + 1);
		}
		
		System.out.println(" Fx = " + Fx);

	}

}
