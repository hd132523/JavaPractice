package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a_a= 9, a_b=10;
		double a_h=5.8,b_h=5.4;
		int b_a=9;
		double res_a;
		double res_b;

		res_a = (a_a+a_b)*a_h/2 ;
		res_b = (b_a*b_h);
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.printf("사달리꼴 넓이 : %.1f\n", res_a);
		System.out.printf("평행사변형 넓이 : %.1f\n\n\n", res_b);
		
		if(res_a > res_b){
			System.out.printf("사다리꼴이 평행사변형 보다  %.1f 더 큽니다.\n", res_a-res_b);
		}
		else if(res_a < res_b){
			System.out.printf("사다리꼴이 평행사변형 보다  %.1f 더 큽니다.\n", res_b-res_a);
		}
		else{
			System.out.println("두 도형의 넓이가 같습니다.");
		}
	}

}
