import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 긴 형태의 이름을 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		String str[] = sc.next().split("-");
		
		// 결과를 넣을 변수를 선언한다.
		String result = "";
		
		// 각 이름의 앞 글자를 result에 더한다.
		for (int i = 0; i < str.length; i++) {
			String strr[] = str[i].split("");
			result += strr[0];
		}
		
		System.out.println(result);
		sc.close();
	}

}