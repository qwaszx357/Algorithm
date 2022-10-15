import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 민국이와 만세의 점수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int a = 0;	// 민국이 총점
		int b = 0;	// 만세 총점
		
		for (int i = 0; i < 8; i++) {
			if (i < 4) {
				a += sc.nextInt();
			} else {
				b += sc.nextInt();
			}
		}
		
		// 총점이 더 큰 사람의 점수를 출력한다.
		if (a >= b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		
		sc.close();
	}

}