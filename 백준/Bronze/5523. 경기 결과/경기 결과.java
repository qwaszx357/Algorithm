import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 라운드 수와 a, b의 점수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// a, b의 승점을 넣을 변수를 선언한다.
		int a_result = 0;
		int b_result = 0;
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			// 결과에 따라 승점을 추가한다.
			if (a > b) {
				a_result ++;
			} else if (a < b) {
				b_result ++;
			} 
		}
		
		System.out.println(a_result + " " + b_result);
		sc.close();
	}

}