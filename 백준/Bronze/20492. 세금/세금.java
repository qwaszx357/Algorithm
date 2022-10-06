import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 상금의 금액을 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		// 각 경우에 대한 상금을 계산해 변수에 넣는다.
		int a = (int) (num * (1 - 0.22));
		int b = (int) ((num * 0.8) + (num * 0.2 * (1 - 0.22)));
		
		System.out.println(a + " " + b);
		sc.close();
	}

}