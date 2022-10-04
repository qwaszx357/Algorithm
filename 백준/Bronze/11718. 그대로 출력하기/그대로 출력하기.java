import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너를 입력하여 문자열을 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			System.out.println(str);
		}
		
		sc.close();
	}

}