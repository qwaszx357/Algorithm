import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 숫자를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			// 숫자를 문자로 한자리씩 끊어 배열에 넣는다.
			String str = sc.next();
				
			// 0이 입력될 경우 종료한다.
			if (str.equals("0")) {
				break;
			}
						
			String[] num = str.split("");
			
			// 함수를 호출한다.
			playNum(num);
		}
		
		sc.close();
	}
	
	static void playNum(String[] num) {
		// 결과를 담을 변수를 선언한다.
		int result = 0;
		
		for (int i = 0; i < num.length; i++) {
			result += Integer.parseInt(num[i]);
		}
		
		// 결과가 한자리가 넘을 경우 다시 함수를 호출한다.
		if (result >= 10) {
			playNum(String.valueOf(result).split(""));
		} else {
			System.out.println(result);
		}

	}

}