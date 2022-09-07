import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 x, y, w, h를 입력 받는다.
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt() - x;	// x와의 거리를 구한다.
		int h = sc.nextInt() - y;	// y와의 거리를 구한다.
		
		// 더 짧은 거리를 구한다.
		int check_x = Math.min(x, w);
		int check_y = Math.min(y, h);
		
		System.out.println(Math.min(check_x, check_y));
		sc.close();
	}

}