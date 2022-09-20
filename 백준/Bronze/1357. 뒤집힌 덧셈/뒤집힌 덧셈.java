import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 x, y를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		String y = sc.next();
		
		// 뒤집혀진 숫자를 넣을 변수를 선언한다.
		String rev_x = "";
		String rev_y = "";
		
		// x와 y를 뒤집어서 각각 rev_x와 rev_y에 넣는다.
		for (int i = x.length() - 1; i >= 0; i--) {
			rev_x += x.charAt(i);
		}
		for (int i = y.length() - 1; i >= 0; i--) {
			rev_y += y.charAt(i);
		}
		
		// rev_x와 rev_y를 더한다.
		String str = Integer.toString(Integer.parseInt(rev_x) + Integer.parseInt(rev_y));
		
		// 더한 값을 뒤집는다.
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		
		System.out.println(Integer.parseInt(result));
		
		sc.close();
	}

}