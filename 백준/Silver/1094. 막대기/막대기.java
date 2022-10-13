import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 만드려는 막대의 길이를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		// 자른 막대의 길이를 담은 배열을 선언한다.
		int[] arr = {64, 32, 16, 8, 4, 2, 1};
		
		// x와 비교할 변수와 막대의 수를 셀 변수를 선언한다.
		int check = 0;
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			// 자른 막대의 길이와 x가 같으면 종료한다.
			if (arr[i] == x) {
				cnt ++;
				break;
			}
			// x가 더 클 경우 막대를 더하고 cnt ++를 한다.
			if (check + arr[i] <= x) {
				check += arr[i];
				cnt ++;
			} else if (check + arr[i] > x) {
				continue;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}

}