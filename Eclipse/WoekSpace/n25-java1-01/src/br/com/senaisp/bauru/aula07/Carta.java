package br.com.senaisp.bauru.aula07;

public class Carta {
	public static final String[] NAIPES= {"♠","♣","♥","♦"};
	public static final String[] NUMEROS = {"A","2","3","4","5","6","7",
			                                "8","9","10","J","Q","K"};
	
   private String naipe;
   private String numero;
   private int valor;
   
   public Carta(int np, int nm) {
	  setNaipe(np); 
	  setNumero(nm);
   }

	public String getNaipe() {
		return naipe;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public int getValor() {
		return valor;
	}
	
	private void setNaipe(int naipe) {
		if (naipe<0 || naipe>3) {
			System.out.println("Naipe inválido - Informar 0 a 3|");
		} else {
		this.naipe = NAIPES[naipe];
		}
	}
	
	private void setNumero(int numero) {
		if (numero<0 || numero>12) {
			System.out.println("Numero inválido -" + "Informar 0 a 12");
		} else {
	      this.numero = NUMEROS[numero];
	      setValor(numero > 9 ? 10: numero + 1);
		}
	}
	
	private void setValor(int valor) {
		this.valor = valor;
	}
	 @Override
	public String toString() {
		 /*
		 1234567  
		1┌─────┐
		2│10   │
		3│  *  │
		4│   10│
		5└─────┘
				 */
		 String ret = "┌─────┐\n"
		 		    + "│#   │\n"
		 		    + "│  !  │\n"
		 		    + "│   #│\n"
		 		    + "└─────┘\n";
		 String ap = (getNumero().equals("10") ? "" : " ");
		 ret = ret.replaceFirst("#", getNumero () + ap);
		 ret = ret.replaceAll("!", getNaipe());
		 ret = ret.replaceFirst("#", ap + getNumero ());
		 return ret;
	}

}
