import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 문장의 개수와 문장을 입력 받는다.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = "";
		
		for (int i = 0; i <= n; i++) {
			str = sc.nextLine();
			
			// 입력받은 문장에 줄번호를 추가하여 출력한다.
			if (i > 0) {
				System.out.println(i + ". " + str);
			}
			
		}
		
		sc.close();
	}

}