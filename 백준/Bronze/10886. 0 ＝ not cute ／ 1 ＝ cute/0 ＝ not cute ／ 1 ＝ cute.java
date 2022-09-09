import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 사람의 수 n과 각 사람의 의견을 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// 사람들의 의견을 담을 변수를 선언한다.
		int cute = 0;
		int notcute = 0;
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			
			// 각 의견에 따라 변수에 값을 추가한다.
			if (a == 1) {
				cute += 1;
			} else {
				notcute += 1;
			}
		}
		
		// 다수결의 의견을 찾아 출력한다.
		if (cute > notcute) {
			System.out.println("Junhee is cute!");
		} else {
			System.out.println("Junhee is not cute!");
		}
		
		sc.close();
	}

}