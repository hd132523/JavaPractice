package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1700000;
		int b=3;
		int c=1500;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.printf("월 평균 급여 : %,d원\n", a);
		System.out.printf("점포 내 직원 수 : %,d명\n", b);
		System.out.printf("점포 수 : %,d개\n", c);
		
		
		System.out.printf("연간 인건비 : %,d원", (long)a*12*b*c);
	}

}
