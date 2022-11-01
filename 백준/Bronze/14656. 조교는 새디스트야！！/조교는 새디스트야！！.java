import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 학생 수와 학생들 순서를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		// 결과를 넣을 변수를 선언한다.
		int result = 0;
		
		// 순서대로 서있지 않은 학생의 수를 구한다.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] != i + 1) {
				result ++;
			}
		}
		
		System.out.println(result);
		sc.close();
	}

}