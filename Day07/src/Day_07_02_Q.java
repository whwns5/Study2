import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2016_11_11
 * 
 * 사용자로부터 단을 입력받아 해당하는
 * 단을 출력하시오.
 */

public class Day_07_02_Q {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputNum;
		
		System.out.print("단입력 :");
		
//		inputNum = br.read() - 48;
//		
//		for(int i = 1; i <= 9; i++){
//			System.out.println(inputNum + " * " + i + " = " + (inputNum*i));
//		}

		inputNum = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= 9; i++){
			System.out.println(inputNum + " * " + i + " = " + (inputNum*i));
		}
		
		System.out.println("태스트합니다");
	}
}
