import java.util.Scanner;
public class ex5 {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);

		System.out.print("Insira um numero inteiro: ");
		int n = numero.nextInt();
		
		for (int i=1; i<=n; i+=2){
		    System.out.println(i);
		}
		
	}
}
