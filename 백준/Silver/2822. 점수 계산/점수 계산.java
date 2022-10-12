import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 8문제의 점수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[8];
		
		// 점수를 내림차순으로 정렬할 리스트를 만든다.
		Integer arr2[] = new Integer[8];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			arr2[i] = arr[i];
		}
		
		// arr2를 정렬한다.
		Arrays.sort(arr2, Collections.reverseOrder());
		
		int result = 0;		// 점수의 합
		int num[] = new int[5];		// 점수에 포함되는 문제 번호
		int cnt = 0;	// num에 숫자를 넣을 때 필요한 변수

		// 상위 5번째까지 있는 문제의 번호를 num에 넣는다.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[i] == arr2[j]) {
					num[cnt] = i + 1;
					cnt ++;
				}
			}
		}
		
		// 점수의 합을 구하여 출력한다.
		for (int i = 0; i < 5; i++) {
			result += arr2[i];
		}
		
		System.out.println(result);
		
		// 각 문제의 번호를 출력한다.
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		sc.close();
	}

}