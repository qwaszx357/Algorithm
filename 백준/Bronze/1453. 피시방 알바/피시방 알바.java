import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 손님의 수와 손님이 앉고 싶어하는 자리를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 거절 당한 사람의 수를 넣은 변수를 선언한다.
		int cnt = 0;
			
		// 중복되는 수를 찾아 cnt에 추가한다.
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					cnt += 1;
					break;
				}
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}

}