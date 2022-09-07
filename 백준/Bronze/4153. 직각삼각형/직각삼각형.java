import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 반복문으로 스캐너로 세 변의 길이를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if (a + b + c == 0) {	// 0일 경우 종료한다.
				break;
			}
			if ((a * a) + (b * b) == (c * c)) {
				System.out.println("right");
			} else if ((a * a) + (c * c) == (b * b)) {
				System.out.println("right");
			} else if ((b * b) + (c * c) == (a * a)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
		
		sc.close();
	}

}