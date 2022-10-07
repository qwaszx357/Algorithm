import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 괄호로 이루어진 문자열을 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		String arr[] = sc.next().split("");
		
		// 높이를 담을 변수를 선언한다.
		int result = 10;
		
		for (int i = 1; i < arr.length; i++) {
			// 그릇의 방향이 같을 경우 5를 더하고 다를 경우 10을 더한다.
			if (arr[i].equals(arr[i - 1])) {
				result += 5;
			} else {
				result += 10;
			}
		}
		
		System.out.println(result);
		sc.close();
	}

}