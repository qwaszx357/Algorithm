import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 테스트 케이스 t를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		// 케이스를 String으로 입력받아 각 숫자로 자른다.
		for (int i = 0; i < t; i++) {
			String a = sc.next();
			String num1 = a.substring(0, 1);
			String num2 = a.substring(2);
			
			// 숫자로 변환하여 합을 구한다.
			System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
		}
		
		sc.close();
	}

}