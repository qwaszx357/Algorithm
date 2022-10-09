import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 방학일수와 풀어야하는 페이지 수, 풀 수 있는 페이지 수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();		// 방학일수
		int k = sc.nextInt();		// 풀어야 하는 국어 페이지 수
		int m = sc.nextInt();		// 풀어야 하는 수학 페이지 수
		int day_k = sc.nextInt();		// 하루에 풀 수 있는 국어 페이지 수
		int day_m = sc.nextInt();		// 하루에 풀 수 있는 수학 페이지 수
		
		for (int i = 1; i <= day; i++) {
			k -= day_k;
			m -= day_m;
			
			// 다 풀었을 경우 놀 수 있는 일수를 출력하고 종료한다.
			if (k <= 0 && m <= 0) {
				System.out.println(day - i);
				break;
			}
		}
		
		sc.close();
	}

}