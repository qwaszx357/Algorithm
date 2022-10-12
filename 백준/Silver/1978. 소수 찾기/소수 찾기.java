import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 정수의 개수와 정수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// 소수의 개수를 셀 변수를 선언한다.
		int result = 0;
				
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			
			if (num == 1) {
				continue;
			}
			// ture의 개수를 센다.
			if (check(num)) {
				result ++;
			}
			
		}

		System.out.println(result);
		sc.close();
	}
	
	// 소수인지 확인하는 함수를 선언한다.
	static boolean check(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		
		return true;
	}

}