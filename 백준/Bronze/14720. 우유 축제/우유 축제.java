import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 우유 가게의 수 n과 arr에 가게 번호를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];		// 0-딸기우유, 1-초코우유, 2-바나나우유
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 변수 cnt에 마실 수 있는 우유 수를 넣는다.
		int cnt = 0;
		int next = 0;
		
		// 반복문으로 돌아가며 숫자를 확인한다.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == next && next == 0) {
				cnt++;
				next = 1;
				continue;
			}
			if (arr[i] == next && next == 1) {
				cnt++;
				next = 2;
				continue;
			}
			if (arr[i] == next && next == 2) {
				cnt++;
				next = 0;
				continue;
			}

		}
		
		System.out.println(cnt);
		sc.close();
		
	}
	
}