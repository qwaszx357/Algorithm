import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 각 대학의 참여도를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int k = sc.nextInt();
		int h = sc.nextInt();
		
		int min = 101;
		String str = "";
		
		// 합이 100이 넘을 경우 "OK"를 출력하고 아닐 경우 가장 작은 점수의 학교 이름을 출력한다.
		if (s + k + h >= 100) {
			System.out.println("OK");
		} else {
			for (int i = 0; i < 3; i++) {
				if (i == 0) {
					min = Math.min(min, s);
				} else if (i == 1) {
					min = Math.min(min, k);
				} else if (i == 2) {
					min = Math.min(min, h);
				}
			}
			if (min == s) {
				str = "Soongsil";
			} else if (min == k) {
				str = "Korea";
			} else if (min == h) {
				str = "Hanyang";
			}
			
			System.out.println(str);
		}
		
		sc.close();
	}

}