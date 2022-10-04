import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 n와 s를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			
			// n에 1 더한 값에서 s를 나눈 몫을 출력한다.
			System.out.println(s / (n + 1));
		}
		
		sc.close();
	}

}