import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2016_11_11
 * 
 * ����ڷκ��� ���� �Է¹޾� �ش��ϴ�
 * ���� ����Ͻÿ�.
 */

public class Day_07_02_Q {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputNum;
		
		System.out.print("���Է� :");
		
//		inputNum = br.read() - 48;
//		
//		for(int i = 1; i <= 9; i++){
//			System.out.println(inputNum + " * " + i + " = " + (inputNum*i));
//		}

		inputNum = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= 9; i++){
			System.out.println(inputNum + " * " + i + " = " + (inputNum*i));
		}
		
		System.out.println("�½�Ʈ�մϴ�");
	}
}
