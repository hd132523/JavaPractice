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

public class Car3 {
	private String Company;
	private String Model;
	private String Color;
	private int MaxSpeed;
	private int Price;
	
	public Car3(String Company, String Model, String Color, int MaxSpeed, int Price){
		/*Company = newCompany;
		Model = newModel;
		Color = newColor;
		MaxSpeed = newMaxSpeed;
		Price = newPrice;*/
		
		this.Company = Company;
		this.Model = Model;
		this.Color = Color;
		this.MaxSpeed = MaxSpeed;
		this.Price = Price;
		
	}
	public Car3(String Company, String Model, String Color, int MaxSpeed){
		this(Company, Model, Color, MaxSpeed, 0);
	}
	public Car3(String Company, String Model, String Color){
		this(Company, Model, Color, 0);
	}
	
	public String getCompany() {
		return Company;
	}
	public void setCompany(String newCompany) {
		Company = newCompany;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String newModel) {
		Model = newModel;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String newcolor) {
		Color = newcolor;
	}
	public int getMaxSpeed() {
		return MaxSpeed;
	}
	public void setMaxSpeed(int newMaxSpeed) {
		MaxSpeed = newMaxSpeed;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int newPrice) {
		Price = newPrice;
	}
	
	
}
