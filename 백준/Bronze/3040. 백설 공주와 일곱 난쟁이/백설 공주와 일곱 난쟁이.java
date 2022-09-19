import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 아홉 난쟁이의 모자에 적혀있는 수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[9];
		int result = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			result += arr[i];
		}
		
		// 배열의 합에서 반복하여 두 수를 제거하여 합이 100이 되는 배열을 찾는다.
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int checknum = result - arr[i] - arr[j];

				// 합이 100이라면 두 수를 배열에서 제거한다.
				if (checknum == 100) {
					for (int k = 0; k < arr.length; k++) {
						if (k == i || k == j) {
							continue;
						} else {
							System.out.println(arr[k]);
						}
					}
					
					break;
				}
			}
		}
		
		sc.close();
	}
}