package org.dimigo.inheritance;

public class FigureTest {
	public static void main(String args[]){
		Circle c = new Circle(5);
		Triangle t = new Triangle(10, 10, 5, 8);
		Rectangle r = new Rectangle(20, 20, 5, 8);
	
		System.out.printf("원의 넓이 : %.1f\n", c.calcArea());
		System.out.printf("삼각형 넓이 : %.1f\n", t.calcArea());
		System.out.printf("사각형 넓이 : %.1f\n", r.calcArea());
		System.out.println();
		c.printCenter();
		t.printCenter();
		r.printCenter();
		
		c.moveFigure(5, 5);
		t.moveFigure(5, 5);
		r.moveFigure(5, 5);
		System.out.println();
		System.out.println("-- 중심좌표 이동 (x,y축 5씩)");
		System.out.println();
		c.printCenter();
		t.printCenter();
		r.printCenter();
	}
	
}
