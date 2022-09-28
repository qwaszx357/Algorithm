import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 두 정수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			// a와 b가 0일 경우 종료한다.
			if (a + b == 0) {
				break;
			}
			
			// 두 수를 비교하여 결과를 출력한다.
			if (a > b) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		
		sc.close();
	}

}