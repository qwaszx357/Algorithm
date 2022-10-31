import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 학교 수, 학생 수, 사과 수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int shcool = sc.nextInt();
		
		// 남는 사과의 개수를 넣을 변수를 선언한다.
		int result = 0;
		
		for (int i = 0; i < shcool; i++) {
			int student = sc.nextInt();
			int apple = sc.nextInt();
			
			// 남는 사과의 개수를 더한다.
			result += apple % student;
		}
		
		System.out.println(result);
		sc.close();
	}

}