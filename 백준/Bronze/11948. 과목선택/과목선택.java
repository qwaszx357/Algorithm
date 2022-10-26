import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 각 과목의 점수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int[4];
		int[] arr2 = new int[2];
		
		// 총점을 구할 변수를 선언한다.
		int result = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		// 두 배열을 정렬한다.
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		// 총점을 구하고 출력한다.
		result = arr1[1] + arr1[2] + arr1[3] + arr2[1];
		System.out.println(result);
		sc.close();
	}

}