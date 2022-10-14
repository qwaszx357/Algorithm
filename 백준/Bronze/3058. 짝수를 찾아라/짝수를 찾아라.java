import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 테스트 케이스 수와 각 케이스에 대해 정수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] arr = new int[7];
		
		for (int i = 0; i < t; i++) {
			// 짝수의 합을 넣을 변수와 최솟값을 넣을 변수를 선언한다.
			int result = 0;
			int min = 101;
			
			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
				
				// 짝수일 경우 result에 더하고 최솟값을 찾는다.
				if (arr[j] % 2 == 0) {
					result += arr[j];
					min = Math.min(min, arr[j]);
				}
			}
			System.out.println(result);
			System.out.println(min);
		}
		
		sc.close();
	}

}