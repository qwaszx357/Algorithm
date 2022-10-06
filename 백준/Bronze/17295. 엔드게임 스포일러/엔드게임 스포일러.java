import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 엔드게임의 줄거리를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		// 엔드게임의 영문 표기를 출력한다.
		System.out.println("Avengers: Endgame");
		
		sc.close();
	}

}