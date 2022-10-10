import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 호수판의 숫자를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			// 숫자를 한자리씩 문자로 입력받는다.
			String num[] = sc.next().split("");
			
			int result = 0;
			
			// 숫자에 따라 다른 길이를 더한다.
			for (int i = 0; i < num.length; i++) {
				if (num[i].equals("1")) {
					result += 2;
				} else if (num[i].equals("0")) {
					result += 4;
				} else {
					result += 3;
				}
			}
			
			// 입력값이 0일 경우 종료한다.
			if (num[0].equals("0")) {
				break;
			}
			
			System.out.println(result + num.length + 1);
		}
		
		sc.close();
	}

}