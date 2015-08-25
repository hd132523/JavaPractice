package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone[] Phones = {
				new IPhone("iPhone6", "애플", 700000),
				new Galaxy("갤럭시 S6", "삼성", 650000)
		};
		for(SmartPhone p : Phones){
			System.out.println(p.toString());
			p.useSpecialFunction();
			p.turnOn();
			p.pay();
			p.turnOff();
			
		}
	}

}
