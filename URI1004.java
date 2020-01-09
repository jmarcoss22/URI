import java.util.Scanner;

public class URI1004 {

	public static void main(String[] args) {

		Scanner um = new Scanner(System.in);

		int A, B, PRODUTO;

		A = um.nextInt();
		B = um.nextInt();

		PRODUTO = A * B;

		System.out.println("PROD = " + PRODUTO);
		
		um.close();

	}

}
