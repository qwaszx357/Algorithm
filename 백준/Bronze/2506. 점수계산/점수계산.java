import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 문제의 개수와 채점 결과를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 전체 점수를 담을 변수와 연속 점수를 담을 변수를 선언한다.
		int result = 0;
		int check = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				check += 1;
				result += check;
			} else {
				check = 0;
			}
		}
		
		System.out.println(result);
		sc.close();
	}

}