import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1002 크기의 수열을 만든다.
		int arr[] = new int[1002];
		
		// 숫자를 확인할 변수를 선언한다.
		int num = 1;
		
		// 중첩 반복문으로 수열에 문제와 같은 배열을 만든다.
		for (int i = 1; i <= 1000; i++) {
			for (int j = 0; j < i; j++) {
				if (num == 1001) {
					break;
				}
				arr[num] = i;
				num += 1;
			}
		}
		
		// 스캐너로 구간의 시작과 끝 정수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();	// 시작
		int b = sc.nextInt(); 	// 끝
		
		// a부터 b까지의 합을 구한다.
		int result = 0;
		
		for (int i = a; i <= b; i++) {
			result += arr[i];
		}
		
		System.out.println(result);
		sc.close();
	}

}