import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 테스트 케이스 수와 비밀번호를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			String str = sc.next();
			
			// 비밀번호의 길이를 비교해 결과를 출력한다.
			if (str.length() >= 6 && str.length() <= 9) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		
		sc.close();
	}

}