package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2011_11_07
 * 
 * 사용자로 부터 반지름을 입력받아 원의 넓이를 구하기
 */
public class Day05_04_Q3 {
	
	final static double pi = Math.PI;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		 
		double rad; // 반지름
		double area; //원의 넒이
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("반지름을 입력하세요 : ");
		rad = Double.parseDouble(br.readLine());
		
		area = rad * rad * pi;
		System.out.println(rad);
		System.out.println(area);
		
	}

}
