package br.com.senaisp.bauru.aula07;

import java.util.Random;

public class CartaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
        Carta ct = new Carta(rnd.nextInt(4), rnd.nextInt(13));//As de Ouro
        System.out.println(ct.getNaipe());
        System.out.println(ct.getNumero());
        System.out.println(ct.getValor());
        System.out.println(ct);
	}

}
