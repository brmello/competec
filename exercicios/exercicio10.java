import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String[] produto = new String[3];
		
		System.out.println("Cadastre os produto:");
		produto[0] = ler.nextLine();
		produto[1] = ler.nextLine();
		produto[2] = ler.nextLine();
		
		double[] preco = new double[3];
		
		System.out.println("Cadastre os preços referente a cada produto:");
		preco[0] = ler.nextDouble();
		preco[1] = ler.nextDouble();
		preco[2] = ler.nextDouble();
		
		int[] quantidade = new int[3];
		
		System.out.println("Cadastre a quantidade referente a cada produto:");
		quantidade[0] = ler.nextInt();
		quantidade[1] = ler.nextInt();
		quantidade[2] = ler.nextInt(); 
		
		
		double[] valorTotal = new double[3];
		for (int i=0; i<3; i++) {
		    valorTotal[i] = preco[i] * quantidade[i];
		}
		
		System.out.println("Estoque total do(a) " + produto[0] + " é: " + valorTotal[0]);
		System.out.println("Estoque total do(a) " + produto[1] + " é: " + valorTotal[1]);
		System.out.println("Estoque total do(a) " + produto[2] + " é: " + valorTotal[2]);
		
		 if (valorTotal[0] > valorTotal[1] && valorTotal[0] > valorTotal[2]) {   
		    System.out.println("O maior valor é do(a) " + produto[0]);
		    
		} else if (valorTotal[1] > valorTotal[0] && valorTotal[1] > valorTotal[2]) {
		    System.out.println("O maior valor é do(a) " + produto[1]);
		    
		} else {
		   System.out.println("O maior valor é do(a) " + produto[2]);
		} 
	}
}