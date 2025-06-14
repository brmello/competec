public class ex10
{
	public static void main(String[] args) {

		//linha x coluna
		int [][] notas = {{0,1}, {2,3}};
		
		int lin = 2;
		int col = 2;
        
        // Imprime a tabela
		for(int i=0; i<lin; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(notas[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}