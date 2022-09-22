import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 배열의 개수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// n개의 배열에 정수를 입력받는다.
		for (int i = 0; i < n; i++) {
			Integer arr[] = new Integer[10];
			
			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			
			// 배열을 내림차순으로 정렬한 뒤 3번째로 큰 수를 출력한다,
			Arrays.sort(arr,Collections.reverseOrder());
			
			System.out.println(arr[2]);
		}
		
		sc.close();
	}

}