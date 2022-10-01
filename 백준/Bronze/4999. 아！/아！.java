import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 재환이의 소리와 의사가 요구하는 소리를 압력받는다.
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		// a와 b를 비교하여 결과를 출력한다.
		if (a.length() >= b.length()) {
			System.out.println("go");
		} else {
			System.out.println("no");
		}
		
		sc.close();
	}

}