package empresa;

public abstract class Moeda {

 public double valor;
 
 public Moeda(double valor) {
     this.valor = valor;
     }
     
     public double converterParaReal() {
		return valor;	
	}
     
     @Override
     public String toString() {
         return getClass().getSimpleName() + " - " + valor;
     }
}
