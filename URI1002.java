import java.util.Scanner;

public class URI1002 {

	public static void main(String[] args) {

		Scanner um = new Scanner(System.in);

		double raio, A;
		double pi = 3.14159;

		raio = um.nextDouble();
	
		A = raio * raio * pi;

		System.out.printf("A=%.4f\n", A);
		
		um.close();

	}

}
