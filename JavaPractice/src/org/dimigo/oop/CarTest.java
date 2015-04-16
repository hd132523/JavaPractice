package org.dimigo.oop;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.oop
 * |_CarTest
 * 
 * 1. ����  : 
 * 2. �ۼ��� : 2015. 4. 13.2015. 4. 13.

 * </pre>
 *
 * @author : ������
 * @version : 1.0
 */

public class CarTest {
	public static void main(String[] args){
		/*
		Car car_1 = new Car();
		Car car_2 = new Car();
		Car car_3 = new Car();
		
		car_1.setCompany("�����ڵ���");
		car_1.setModel("���׽ý�");
		car_1.setColor("������");
		car_1.setMaxSpeed(225);
		car_1.setPrice(50000000);
		
		car_2.setCompany("����ڵ���");
		car_2.setModel("K7");
		car_2.setColor("���");
		car_2.setMaxSpeed(246);
		car_2.setPrice(40000000);
		
		car_3.setCompany("�Ｚ�ڵ���");
		car_3.setModel("SM7");
		car_3.setColor("ȸ��");
		car_3.setMaxSpeed(200);
		car_3.setPrice(38000000);*/
				
		Car2 car_1 = new Car2("�����ڵ���", "���׽ý�", "������", 225, 5000000);
		Car2 car_2 = new Car2("����ڵ���", "K7", "���", 246, 4000000);
		Car2 car_3 = new Car2("�Ｚ�ڵ���", "SM7", "ȸ��", 200, 3800000);
		
		System.out.println(" << �ڵ��� ��� >> ");
		System.out.println("������� : " + car_1.getCompany());
		System.out.println("�𵨸� : " + car_1.getModel());
		System.out.println("���� : " + car_1.getColor());
		System.out.println("�ִ�ӵ� : " + car_1.getMaxSpeed() + "km");
		System.out.println("���� : " + String.format("%,d", car_1.getPrice()) + "��");
		System.out.println("");
		
		System.out.println("������� : " + car_2.getCompany());
		System.out.println("�𵨸� : " + car_2.getModel());
		System.out.println("���� : " + car_2.getColor());
		System.out.println("�ִ�ӵ� : " + car_2.getMaxSpeed() + "km");
		System.out.println("���� : " + String.format("%,d", car_2.getPrice()) + "��");
		System.out.println("");
		
		System.out.println("������� : " + car_3.getCompany());
		System.out.println("�𵨸� : " + car_3.getModel());
		System.out.println("���� : " + car_3.getColor());
		System.out.println("�ִ�ӵ� : " + car_3.getMaxSpeed() + "km");
		System.out.println("���� : " + String.format("%,d", car_3.getPrice()) + "��");
		System.out.println("");

		
		
		
	}
}
