import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 테스트 케이스 수와 케이스의 자연수 개수, 자연수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			
			// 합 결과를 넣을 변수를 선언한다.
			int result = 0;
			
			// 자연수를 n만큼 입력받아 result에 더한다.
			for (int j = 0; j < n; j++) {
				result += sc.nextInt();
			}
			System.out.println(result);
		}
		
		sc.close();
	}

}