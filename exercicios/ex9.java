import java.util.Scanner;
public class ex9
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int tamanho = ler.nextInt();

		int numeros[] = new int[tamanho];

		for(int x=0; x<numeros.length ; x++) {
			numeros[x] = ler.nextInt();
		}

		for(int n : numeros) {
			System.out.println("Valores do vetor: " + n + " ");
		}
	}
}