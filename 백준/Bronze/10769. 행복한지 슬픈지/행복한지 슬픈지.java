import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 승엽이의 문자를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		// 이모티콘을 기준으로 문자열을 나누어 문자의 개수를 구한다.
		String[] happy = str.split(":-\\)");
		String[] sad = str.split(":-\\(");
		
		// 문자의 개수에 따라 다른 결과값을 출력한다.
		if (happy.length == 1 && sad.length == 1) {
			System.out.println("none");
		} else if (happy.length == sad.length) {
			System.out.println("unsure");
		} else if (happy.length > sad.length) {
			System.out.println("happy");
		} else if (happy.length < sad.length) {
			System.out.println("sad");
		}
		
		sc.close();
	}

}