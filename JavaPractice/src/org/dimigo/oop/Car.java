package org.dimigo.oop;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.oop
 * |_Car
 * 
 * 1. 개요  : 
 * 2. 작성일 : 2015. 4. 13.2015. 4. 13.

 * </pre>
 *
 * @author : 박찬진
 * @version : 1.0
 */

public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String newcompany) {
		company = newcompany;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String newmodel) {
		model = newmodel;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String newcolor) {
		color = newcolor;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int newmaxSpeed) {
		maxSpeed = newmaxSpeed;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int newprice) {
		price = newprice;
	}
	
	
}
