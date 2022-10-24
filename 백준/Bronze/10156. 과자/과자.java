import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 과자의 가격, 갯수, 가진 돈을 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int price = sc.nextInt();
		int amount = sc.nextInt();
		int money = sc.nextInt();
		
		// 부족한 돈의 액수를 구한다.
		int result = price * amount - money;
		
		// 부족하지 않을 경우 0을 출력한다.
		if (result > 0) {
			System.out.println(result);
		} else {
			System.out.println(0);
		}
		
		sc.close();
	}

}