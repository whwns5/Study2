import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 2016_11_11
 * 
 * 사용자로부터 값을 입력받아 소수인지 판별
 */

public class Day_07_03_Q {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputNum;
		int countNum = 0;
		
		System.out.print("숫자를 입력하세요 :");
		inputNum = Integer.parseInt(br.readLine());
		
		
//		for(int i = 1; i <= inputNum; i++){
//			System.out.println(inputNum + " / " + i + " = " + (inputNum%i));
//			if(inputNum%i == 0){
//				countNum += 1;
//			}
//		}
//
//		if(countNum == 2){
//			System.out.println(inputNum + " 은 소수입니다.");
//		}else{
//			System.out.println(inputNum + " 은 소수가 아닙니다.");
//		}
		
		for(int i = 2; i <= inputNum-1; i++){
			System.out.println(inputNum + " / " + i + " = " + (inputNum%i));
			if(inputNum%i == 0){
				countNum += 1;
			}
		}
		
		if(countNum == 0){
			System.out.println(inputNum + " 은 소수입니다.");
		}else{
			System.out.println(inputNum + " 은 소수가 아닙니다.");
		}
	}
}
