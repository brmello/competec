import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);

		System.out.print("Qual produto voce gostaria de comprar? ");
		String produto = pedido.nextLine();

		System.out.print("Quantas unidades? ");
		int unidade = pedido.nextInt();

		System.out.print("Quantos reais voce tem? ");
		double carteira = pedido.nextDouble();
		
		double precoProduto = 0;

		switch(produto) {
		    case "uva":
		    	precoProduto = 10.5;
		    	break;

	    	case "banana":
		        precoProduto = 16.2;
               break;
            
	    	case "morango":
		        precoProduto = 12;
                break;
            
		default:
			System.out.print("Nao temos esse produto no catalogo! ");
		}
        
        double valorFinal = precoProduto * unidade;
        
        if(carteira > valorFinal) {
            System.out.print("Voce pode finalizar sua compra!");
        } else if (carteira == valorFinal) {
            System.out.print("Voce pode finalizar sua compra!");
        } else {
            System.out.print("Voce nao pode finalizar sua compra.");
        }
        

	}
}