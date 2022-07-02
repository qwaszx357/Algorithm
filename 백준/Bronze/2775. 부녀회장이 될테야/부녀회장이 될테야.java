import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 테스트 케이스 t를 입력 받는다.
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		// 사람 수를 넣을 아파트 2차원 배열을 만든다.
		int[][] apt = new int[15][15];
		
		// 각 층의 1호에는 1명, 0층의 각 호에는 1부터 15를 넣는다.
		for (int i = 0; i < 15; i++) {
			apt[i][1] = 1;
			apt[0][i] = i;
		}
		
		// 나머지 호의 사람 수를 구한다.
		for (int i = 1; i < 15; i++) {
			for (int j = 2; j < 15; j++) {
				apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
			}
		}
		
		// k층과 n호를 입력 받아 사람 수를 출력한다.
		for (int i = 0; i < t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(apt[k][n]);
		}
		
		sc.close();		
	}

}