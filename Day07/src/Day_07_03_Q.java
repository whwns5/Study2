import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 2016_11_11
 * 
 * ����ڷκ��� ���� �Է¹޾� �Ҽ����� �Ǻ�
 */

public class Day_07_03_Q {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputNum;
		int countNum = 0;
		
		System.out.print("���ڸ� �Է��ϼ��� :");
		inputNum = Integer.parseInt(br.readLine());
		
		
//		for(int i = 1; i <= inputNum; i++){
//			System.out.println(inputNum + " / " + i + " = " + (inputNum%i));
//			if(inputNum%i == 0){
//				countNum += 1;
//			}
//		}
//
//		if(countNum == 2){
//			System.out.println(inputNum + " �� �Ҽ��Դϴ�.");
//		}else{
//			System.out.println(inputNum + " �� �Ҽ��� �ƴմϴ�.");
//		}
		
		for(int i = 2; i <= inputNum-1; i++){
			System.out.println(inputNum + " / " + i + " = " + (inputNum%i));
			if(inputNum%i == 0){
				countNum += 1;
			}
		}
		
		if(countNum == 0){
			System.out.println(inputNum + " �� �Ҽ��Դϴ�.");
		}else{
			System.out.println(inputNum + " �� �Ҽ��� �ƴմϴ�.");
		}
	}
}
