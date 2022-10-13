import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 행렬의 크기와 행렬의 원소를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		
		// 첫 번째 행렬을 입력받는다.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// 두번째 행렬을 arr에 더하고 출력한다.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] += sc.nextInt();
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}