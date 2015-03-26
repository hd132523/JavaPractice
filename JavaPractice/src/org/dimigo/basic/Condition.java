package org.dimigo.basic;

public class Condition {
	public static void main(String[] args){
		int d=10;
		String kind="고속버스";
		int result=0;
		
		if(d<=0){
			System.out.println("거리는 0보다 커야합니다.");
			return;
		}
		
		switch(kind){
		case "고속버스" : 
			result=850;
			break;
		case "경차" : 
			result=300;
			break;
		default : 
			result=600;
			break;
		}
		
		if(d >10){
			if(kind == "고속버스"){
				result+=300*(d/10);
			}
			else{
				result+=200*(d/10);
			}
		}
		System.out.println("<< 고속도로 통행료 계산>>");
		System.out.printf("거리 : %dkm\n", d);
		System.out.printf("차량 : %s\n", kind);
		System.out.printf("통행료 : %d원\n", result);
	}
}
