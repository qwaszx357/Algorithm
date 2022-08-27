import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 팀의 수 n과 학생들의 코딩 역량을 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n * 2];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// arr을 정렬한다.
		Arrays.sort(arr);
		
		// 최솟값을 설정한다.
		int min_num = 200000;

		// 각 팀의 역량 합을 넣을 변수를 선언한다.
		int result = 0;
		
		for (int i = 0; i < arr.length; i++) {
			result = arr[i]+arr[n * 2 - (i + 1)];
			if(min_num > result) {
				min_num = result;
			}
		}
		
		System.out.println(min_num);
		sc.close();
		
	}

}