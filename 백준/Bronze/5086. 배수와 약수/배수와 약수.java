import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        // a, b를 입력 받는데, 둘 다 0일 경우 종료한다.
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a > b) {
				if (a % b == 0) {
					System.out.println("multiple");
				} else {
					System.out.println("neither");
				}
			} else if (a < b) {
				if (b % a == 0) {
					System.out.println("factor");
				} else {
					System.out.println("neither");
				}
			}
			if (a + b == 0) {
				break;
			}
		}

		sc.close();
	}

}