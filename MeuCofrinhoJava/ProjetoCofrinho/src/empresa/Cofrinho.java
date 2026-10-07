package empresa;

import java.util.ArrayList;

public class Cofrinho {
 
	private ArrayList <Moeda> moedas = new ArrayList<>();
	
	public Cofrinho(ArrayList<Moeda> moedas) {
		super();
		this.moedas = moedas;
	}

	public Cofrinho() {
		
	}

	//função para adicionar moeda
	public void add(Moeda m) {
		moedas.add(m);
	}
	
	//função para remover moeda
	public void remove() {
		if(moedas.isEmpty()) {
			System.out.println("O cofrinho está vazio.");
		} 
		else {
			moedas.remove(moedas.size()-1);
			System.out.println("Moeda removida com sucesso.");
			return;
		}
	}
	
	//função para listar as moedas
	public void listarMoedas() {
		if (moedas.isEmpty()) {
			System.out.println("Sem moedas por enquanto..");
			return;
		}
		System.out.println("Moedas no cofrinho: ");
		for(Moeda m : moedas) {
			System.out.println(m);
		}
	}
	
	//função para calcular o total
	public double calcularTotal() {
		double total=0;
		for(Moeda m : moedas) {
			total += m.converterParaReal();
		}
		return total;
	}
	
}
