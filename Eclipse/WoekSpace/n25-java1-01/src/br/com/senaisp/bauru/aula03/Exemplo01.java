package br.com.senaisp.bauru.aula03;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte by = 127;//-128 a 127
        by++;
        by += 2;
        System.out.println(by);
        char letra = 'A'; //65
        letra += 3;
        System.out.println(letra);
        if ('A'>'a') { //a = 97
        	System.out.println("A é maior que a");
        } else {
        	System.out.println("a é Maior que A"); }
        char letra2 = 'X';
        System.out.println(letra + letra2);
        System.out.println(""+letra + letra2);
        int v1 = 10;
        int v12 = v1++ + 5;
        System.out.println(v1 + " " + v12);
        v1 = 10;
        v12 = ++v1 + 5;
        System.out.println(v1 + " " + v12);
	}

}
