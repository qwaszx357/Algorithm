import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 버섯의 점수 10개의 정수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int result = 0;		// 마리오의 점수
		int checknum = 0;		// 100점이 넘는지 체크하기 위한 수
		
		for (int i = 0; i < 10; i++) {
			checknum += sc.nextInt();
			
			// 입력받은 수를 checknum에 더하며 result와 비교한다.
			if (checknum <= 100) {
				if (i < 9) {
					result = checknum;
				} else {
					System.out.println(checknum);
				}
				
			} else {
				if (checknum - 100 == 100 - result) {
					System.out.println(checknum);
				} else if (checknum - 100 < 100 - result) {
					System.out.println(checknum);
				} else if (checknum - 100 > 100 - result) {
					System.out.println(result);
				}
				break;
			}

		}
		
		sc.close();
	}

}
