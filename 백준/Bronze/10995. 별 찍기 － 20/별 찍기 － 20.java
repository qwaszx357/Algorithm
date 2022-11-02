import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 정수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
				
		for (int i = 1; i <= n; i++) {
			// 홀수일 경우 공백 없이 *을 출력하고
			if (i % 2 != 0) {
				for (int j = 0; j < n; j++) {
					System.out.print("* ");
				}
				System.out.println("");
			} 
			// 짝수일 경우 공백을 먼저 출력한다.
			else {
				for (int j = 0; j < n; j++) {
					System.out.print(" *");
				}
				System.out.println("");
			}
		}
		
		sc.close();
	}

}