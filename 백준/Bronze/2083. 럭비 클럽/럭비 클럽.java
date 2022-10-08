import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 회원의 읾, 나이, 몸무게를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String name = sc.next();
			int age = sc.nextInt();
			int kg = sc.nextInt();
			
			// 이름이 #일 경우 종료한다.
			if (name.equals("#")) {
				break;
			}
			
			// 결과에 따라 출력한다.
			if (age > 17 || kg >= 80) {
				System.out.println(name + " Senior");
			} else {
				System.out.println(name + " Junior");
			}
		}
		
		sc.close();
	}

}