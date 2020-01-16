import java.util.Scanner;

public class Zeta {
	int n;
	int iterations;

	Zeta(int n, int iterations) {
		this.n = n;
		this.iterations = iterations;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What value of n would you like to choose: ");

		int n = scanner.nextInt();
		System.out.print("Number of iterations of Zeta: ");
		int iterations = scanner.nextInt();

		scanner.close();
		Zeta obj1 = new Zeta(n, iterations);

		obj1.zetaCalc();
		obj1.display();
	}

	double zetaCalc() {
		double zeta;
		double add = 0.00;

		for (int i = 1; i < iterations; i++) {
			zeta = 1 / Math.pow(i, 2);
			add += zeta;
		}

		return add;
	}

	void display() {
		System.out.println(" ");
		System.out.println("Convergance of Zeta(" + n + ") " + "is equal to: " + zetaCalc() + " at " + iterations + " iterations.");

		if (n == 2) {
			System.out.println(" ");
			System.out.println("Actual value of PI^2 / 6 is " + Math.pow(Math.PI, 2) / 6);
		} else {
			System.out.println(" ");
			System.out.println("Listen man idk the value of Zeta of " + n);
		}
	}
}
