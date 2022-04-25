import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// n을 입력받는다.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// arr 리스트에 로프의 최대중량을 입력받는다.
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// arr 리스트를 정렬한다.
		Arrays.sort(arr);
		
		// arr 리스트에 arr에 n - i 만큼 곱한 뒤 넣는다.
		// 변수 a에 최대값을 넣는다.
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * (n - i);
			if (arr[i] > a) {
				a = arr[i];
			}
		}
		
		// arr1 리스트의 max값을 출력한다.
		System.out.println(a);
		
		sc.close();
	}

}