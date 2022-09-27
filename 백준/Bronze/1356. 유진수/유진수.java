import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 정수를 문자열로 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		
		// 문자열로 받은 정수를 각 자리수로 잘라 arr에 넣는다.
		String arr[] = num.split("");
		
		// 앞의 수와 뒤의 수 곱을 넣을 변수를 선언한다.
		int a = 1;
		int b = 1;

		// 한자리 수 일 경우 종료한다.
		if (arr.length == 1) {
			System.out.println("NO");
		} else {
			for (int i = 0; i < arr.length; i++) {
				a = 1;
				b = 1;
				for (int j = 0; j <= i; j++) {
					a = a * Integer.parseInt(arr[j]);
				}
				for (int j = i + 1; j < arr.length; j++) {
					b = b * Integer.parseInt(arr[j]);
				}
				
				// 두 곱의 결과에 따라 출력한다.
				if (a == b) {
					System.out.println("YES");
					break;
				} else if (i + 1 == arr.length) {
					System.out.println("NO");
				}
			}
			
		}
		
		sc.close();
	}

}
