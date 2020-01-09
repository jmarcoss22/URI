import java.util.Scanner;

public class URI1006 {

	public static void main(String[] args) {

		Scanner um = new Scanner(System.in);

		double A, B, C, MEDIA;

		A = um.nextDouble();
		B = um.nextDouble();
		C = um.nextDouble();

		MEDIA = (A * 2 + B * 3 + C * 5) / 10;

		System.out.printf("MEDIA = %.1f\n", MEDIA);
		
		um.close();

	}

}
