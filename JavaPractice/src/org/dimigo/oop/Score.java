package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		System.out.println("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.println("수학 점수 입력 => ");
		int math = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		sb.append("<< 점수 출력 >>\n");
		sb.append("\n국어 점수 : ");
		sb.append(kor);
		sb.append("\n수학 점수 : ");
		sb.append(math);
		sb.append("\n영어 점수 : ");
		sb.append(eng);
		int total = kor + math + eng;
		float sum = (float)total/3;
		sb.append("\n총점 : ");
		sb.append(total);
		sb.append("\n평균 : ");
		sb.append(String.format("%.1f", sum));
		System.out.println(sb.toString());
		
		
	}

}
