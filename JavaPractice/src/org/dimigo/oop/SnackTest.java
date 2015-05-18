package org.dimigo.oop;

public class SnackTest {
	
	public static void main(String[] args){
		
		Snack[] snackArr = {
			new Snack("새우깡", "농심", 1100, 2),
			new Snack("콘칲", "크라운", 1200, 1),
			new Snack("허니버터칩", "해태", 1500, 4)
		};
		
		for(Snack val : snackArr){
			val.printSnack();
		}
		
	}

	
}
