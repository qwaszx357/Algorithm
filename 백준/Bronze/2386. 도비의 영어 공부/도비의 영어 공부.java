import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 소문자 알파벳과 문장을 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String alpha = sc.next();
			
			// '#'이 입력되면 종료한다.
			if (alpha.equals("#")) {
				break;
			}
			
			// 문자열을 입력받고, 배열에 한 글자씩 넣는다.
			String str= sc.nextLine().toLowerCase();
			String[] str_arr = str.split("");
			
			int result = 0;
			
			// 같은 문자가 나오면 result에 1씩 더한다.
			for (int i = 0; i < str_arr.length; i++) {
				if (alpha.equals(str_arr[i])) {
					result ++;
				}
			}
			
			System.out.println(alpha + " " + result);
		}
		
		sc.close();
	}

}