import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 전체 가격과 뭃건의 수량을 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int price = sc.nextInt();
		int amount = sc.nextInt();
		
		// 각 물건의 가격(a)와 수량(b)를 입력받는다.
		for (int i = 0; i < amount; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			price -= a * b;
		}
		
		if (price == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}