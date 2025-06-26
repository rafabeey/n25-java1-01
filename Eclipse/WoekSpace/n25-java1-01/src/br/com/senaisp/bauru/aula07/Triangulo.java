package br.com.senaisp.bauru.aula07;

import java.awt.Color;
import java.awt.Graphics;

public final class Triangulo extends Desenho {
    private int altura;
    private int largura;
	private static final long serialVersionUID = 1L;

	public Triangulo(int posX, int posY, int alt, int larg, Color cor) {
		super(posX, posY, cor);
		altura = alt;
		largura = larg;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	@Override
	protected void desenharForma(Graphics g) {
		g.setColor(getCor());

		int [] pXs = { getX(),
				       getX() + getLargura()/2, 
				       getX() + getLargura() };
		int [] pYs = { getY() + getAltura(),
				       getY(),
				       getY() + getAltura() };
		
		g.fillPolygon(pXs, pYs, 3);
	}

}
