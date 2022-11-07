import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 내린 사람의 수와 탄 사람의 수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int people = 0;
		
		// 사람이 가장 많을 때의 수를 넣을 변수를 선언한다.
		int max = 0;
		
		// 내린 사람 수를 배고 탄 사람 수를 더하고 최댓값을 넣는다.
		for (int i = 0; i < 10; i++) {
			people -= sc.nextInt();
			people += sc.nextInt();
			max = Math.max(max, people);
		}
		
		System.out.println(max);
		sc.close();
	}

}