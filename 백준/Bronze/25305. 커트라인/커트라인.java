import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scanner로 응시자 수 n과 상을 받는 사람의 수 k를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		k -= 1;
		
		// arr 배열에 사람들의 점수를 입력받는다.
		Integer arr [] = new Integer [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 배열을 내림차순으로 정렬한다.
		Arrays.sort(arr, Collections.reverseOrder());
		
		// 커트라인 점수를 출력한다.
		System.out.println(arr[k]);
	}

}