import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 정수와 문자열을 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			
			// 대문자를 소문자로 바꿔서 출력한다.
			System.out.println(str.toLowerCase());
		}
		
		sc.close();
	}

}