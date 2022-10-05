import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 테스트 케이스의 수와 정수 a, b를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			// 결과를 넣을 변수를 1을 넣어 선언한다.
			int result = 1;
			
			// 반복문으로 지수를 계산한 뒤 일의 자리를 구한다.
			for (int j = 0; j < b; j++) {
				result = (result * a) % 10;
			}
			
			// 결과가 0이면 10번째 컴퓨터가 되도록 10으로 바꾼다.
			if (result == 0) {
				result = 10;
			}
			
			System.out.println(result);
		}
		
		sc.close();
	}

}