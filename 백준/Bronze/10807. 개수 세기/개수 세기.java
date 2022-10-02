import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 정수의 개수와 정수, 찾을 값을 입력 받는다.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int num = sc.nextInt();
		
		// 찾을 값의 개수를 담을 변수를 선언한다.
		int result = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				result += 1;
			}
		}
		
		System.out.println(result);
		sc.close();
	}

}