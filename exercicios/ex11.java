import java.util.Scanner;
public class ex11
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tabela [] [] = new int[3][3];
		
		int lin = 3;
		int col = 3;
		
		// Alimenta a tabela
		for(int i=0; i<lin; i++) {
		    
			for(int j=0; j<col; j++) {
			    	System.out.println("LINHA: " + i + " COLUNA: "+ j);
				tabela[i][j] = sc.nextInt();
			}
			System.out.println(" ");
		}

        
        // Imprime a tabela
		for(int i=0; i<lin; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(tabela[i][j] + " ");
			}
			System.out.println(" ");
		}

		System.out.print("O numero do meio = " + tabela[1][1]);
	}
}