package empresa;

public class Iene extends Moeda{

	   public Iene(double valor) {
		   super(valor);
	   }
	
	   @Override 
	   public double converterParaReal() {
           return valor *0.035;				
	   }
}
