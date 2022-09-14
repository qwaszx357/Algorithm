import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 a, b를 문자열로 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		String a_str = sc.next();
		String b_str = sc.next();
		
		// 곱셈 결과를 넣을 변수를 선언한다.
		long result = 0;
		
		// 한문자씩 잘라 int로 바꾸고 곱하여 result에 더한다.
		for (int i = 0; i < a_str.length(); i++) {
			for (int j = 0; j < b_str.length(); j++) {
				result += Integer.parseInt(a_str.substring(i, i + 1)) * Integer.parseInt(b_str.substring(j, j + 1));
			}
		}
		
		System.out.println(result);
		sc.close();
	}

}