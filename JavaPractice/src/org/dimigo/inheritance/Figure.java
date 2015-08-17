package org.dimigo.inheritance;

public class Figure {
	private int centerX;
	private int centerY;
	
	public Figure(){
		
	}
	public Figure(int centerX, int centerY){
		centerX=0;
		centerY=0;
	}
	protected double calcArea(){
		return 0.0;
	}
}
