package org.dimigo.oop;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.oop
 * |_CarTest
 * 
 * 1. 개요  : 
 * 2. 작성일 : 2015. 4. 13.2015. 4. 13.

 * </pre>
 *
 * @author : 박찬진
 * @version : 1.0
 */

public class CarTest {
	public static void main(String[] args){
		/*
		Car car_1 = new Car();
		Car car_2 = new Car();
		Car car_3 = new Car();
		
		car_1.setCompany("현대자동차");
		car_1.setModel("제네시스");
		car_1.setColor("검정색");
		car_1.setMaxSpeed(225);
		car_1.setPrice(50000000);
		
		car_2.setCompany("기아자동차");
		car_2.setModel("K7");
		car_2.setColor("흰색");
		car_2.setMaxSpeed(246);
		car_2.setPrice(40000000);
		
		car_3.setCompany("삼성자동차");
		car_3.setModel("SM7");
		car_3.setColor("회색");
		car_3.setMaxSpeed(200);
		car_3.setPrice(38000000);*/
				
		Car2 car_1 = new Car2("현대자동차", "제네시스", "검정색", 225, 5000000);
		Car2 car_2 = new Car2("기아자동차", "K7", "흰색", 246, 4000000);
		Car2 car_3 = new Car2("삼성자동차", "SM7", "회색", 200, 3800000);
		
		System.out.println(" << 자동차 목록 >> ");
		System.out.println("제조사명 : " + car_1.getCompany());
		System.out.println("모델명 : " + car_1.getModel());
		System.out.println("색상 : " + car_1.getColor());
		System.out.println("최대속도 : " + car_1.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", car_1.getPrice()) + "원");
		System.out.println("");
		
		System.out.println("제조사명 : " + car_2.getCompany());
		System.out.println("모델명 : " + car_2.getModel());
		System.out.println("색상 : " + car_2.getColor());
		System.out.println("최대속도 : " + car_2.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", car_2.getPrice()) + "원");
		System.out.println("");
		
		System.out.println("제조사명 : " + car_3.getCompany());
		System.out.println("모델명 : " + car_3.getModel());
		System.out.println("색상 : " + car_3.getColor());
		System.out.println("최대속도 : " + car_3.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", car_3.getPrice()) + "원");
		System.out.println("");

		
		
		
	}
}
