import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 a, b, c를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// 손익분기점이 발생하는 시점을 찾는다.
		int cnt = 0;
		
		if (c <= b) {	// b가 더 클 경우 이익이 생기지 않는다.
			cnt = -1;
		} else {
			cnt = (a / (c - b) + 1);
		}
		
		System.out.println(cnt);
		sc.close();
	}

}