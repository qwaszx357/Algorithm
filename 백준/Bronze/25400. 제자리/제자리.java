import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 정수의 갯수 n을 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// arr 배열에 정수 n개를 담는다.
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 제거 할 카드의 수를 넣을 변수 cnt와 체크넘버 num을 선언한다.
		int cnt = 0;
		int num = 1;
		
		// 카드의 수를 확인하며 제자리 카드로 만든다.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				num += 1;
			} else {
				cnt += 1;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}

}