import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 5명의 점수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		// 5명 점수의 합을 답을 변수를 선언한다.
		int result = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			// 40점 미만일 경우 40점으로 바꾼다.
			if (arr[i] < 40) {
				arr[i] = 40;
			}
			
			// 합을 구한다.
			result += arr[i];
		}
		
		System.out.println(result / 5);
		sc.close();
	}

}