import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 정수를 입력 받는다.
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();		// 낮에 올라가는 높이
		int b = sc.nextInt();		// 밤에 미끄러지는 높이
		int v = sc.nextInt();		// 나무 막대의 높이
		
		// 막대기 정상에 올라가는데 걸리는 시간을 구한다.
		int day = (v - b) / (a - b);

		if ((v - b) % (a - b) != 0) {
			day += 1;
		}
		
		System.out.println(day);
		sc.close();
	}

}