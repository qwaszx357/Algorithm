import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 제리가 가져간 치즈의 양 a, b를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 1에서 a/b를 뺀 값을 출력한다.
		System.out.println(b - a + " " + b);
		
		sc.close();
	}  

}