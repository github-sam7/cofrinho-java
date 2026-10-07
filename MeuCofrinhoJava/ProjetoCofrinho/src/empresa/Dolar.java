package empresa;

public class Dolar extends Moeda {

	   public Dolar(double valor) {
           super(valor);
       }
	   
	   @Override
	   public double converterParaReal() {
		   return valor*5.44;
	   }
}
