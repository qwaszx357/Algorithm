import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 컵의 위치를 바꾼 횟수와 위치를 바꾼 방법을 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// 처음 공의 위치를 넣은 결과값 변수를 선언한다.
		int result = 1;
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			// 공의 위치가 바뀌면, 바꾼 위치를 넣는다.
			if (x == result) {
				result = y;
			} else if (y == result) {
				result = x;
			}
		}
		
		System.out.println(result);
		sc.close();
	}

}