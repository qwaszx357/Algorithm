import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 언어 성적을 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		// 결과값을 담을 변수를 선언한다.
		double result = 0.0;
		
		if (str.equals("A+")) {
			result = 4.3;
		} else if (str.equals("A0")) {
			result = 4.0;
		} else if (str.equals("A-")) {
			result = 3.7;
		} else if (str.equals("B+")) {
			result = 3.3;
		} else if (str.equals("B0")) {
			result = 3.0;
		} else if (str.equals("B-")) {
			result = 2.7;
		} else if (str.equals("C+")) {
			result = 2.3;
		} else if (str.equals("C0")) {
			result = 2.0;
		} else if (str.equals("C-")) {
			result = 1.7;
		} else if (str.equals("D+")) {
			result = 1.3;
		} else if (str.equals("D0")) {
			result = 1.0;
		} else if (str.equals("D-")) {
			result = 0.7;
		} else {
			result = 0.0;
		}
		
		System.out.println(result);
		sc.close();
	}

}