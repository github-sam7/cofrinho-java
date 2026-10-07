package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//menu
		Scanner teclado = new Scanner(System.in);
		Cofrinho cofre = new Cofrinho();

		int opcao = -1;

		while (opcao != 0) {

		    System.out.println("\nCOFRINHO:");
		    System.out.println("1 - Adicionar moeda");
		    System.out.println("2 - Excluir moeda");
		    System.out.println("3 - Listar moedas");
		    System.out.println("4 - Calcular total convertendo para Real");
		    System.out.println("0 - Finalizar.");
		    opcao = teclado.nextInt();

		    
		    switch (opcao) {

		  //usuario vai escolher uma das opções
		        case 1 -> {
		            System.out.println("1 - Real");
		            System.out.println("2 - Dolar");
		            System.out.println("3 - Euro");
		            System.out.println("4 - Iene");

		            int tipo = teclado.nextInt();
		            System.out.println("Valor:");
		            double valor = teclado.nextDouble();

		            Moeda moeda = null;  

		            switch (tipo) {
		                case 1 -> moeda = new Real(valor);
		                case 2 -> moeda = new Dolar(valor);
		                case 3 -> moeda = new Euro(valor);
		                case 4 -> moeda = new Iene(valor);
		                default -> System.out.println("Tipo inválido.");
		            }

		            if (moeda != null) {
		                cofre.add(moeda);  
		            }
		        }
		        
		        //chama função de remover
		        case 2 -> cofre.remove();
		        
		        //chama a lista de moedas
		        case 3 -> cofre.listarMoedas();
		        
		        //chama o total
		        case 4 -> System.out.println("Total: " + cofre.calcularTotal());
		        
		        //finaliza o programa
		        case 0 -> System.out.println("Finalizando...");
		        
		        //retorna opção invalida
		        default -> System.out.println("Opção inválida!");
		    }
		}
	}
}
		
		

