import java.util.Scanner;
public class while1 {
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	    
	    System.out.print("Escreva uma palavra qualquer: ");
	    String palavra = leia.nextLine();
	   
	   int x = 0; 
	   while (x < 5) {
	       System.out.println(palavra);
	       x++;
	   }
	}
}
