import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 두 유명도를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextInt();
		long b = sc.nextInt();
		
		// 유명도의 차이를 담을 변수를 선언한다.
		long result = 0;
		
		// 두 수의 차를 구한다.
		if (a >= b) {
			result = a - b;
		} else {
			result = b - a;
		}
		
		// 음수일 경우 양수로 바꾸어 출력한다.
		if (result < 0) {
			System.out.println(result * -1);
		} else {
			System.out.println(result);
		}
		
		sc.close();
	}

}