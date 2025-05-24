import java.util.Scanner;
public class ex4 {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);

		System.out.print("Insira um numero inteiro: ");
		int n = numero.nextInt();

		for (int i=1; i<=10; i++) {
			System.out.println(n*i);
		}

	}
}
