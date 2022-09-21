import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 a와 b의 카드 숫자 10개씩 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		int b[] = new int[10];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		
		// 두 사람의 카드 수를 비교하여 배열에 결과를 넣는다.
		String vs[] = new String[10];
		
		for (int i = 0; i < vs.length; i++) {
			if (a[i] > b[i]) {
				vs[i] = "a";
			} else if (a[i] < b[i]) {
				vs[i] = "b";
			} else {
				vs[i] = "d";
			}
		}
		
		// 두 사람의 총점을 구하여 출력한다.
		int acnt = 0;
		int bcnt = 0;
		
		for (int i = 0; i < vs.length; i++) {
			if (vs[i].equals("a")) {
				acnt += 3;
			} else if (vs[i].equals("b")) {
				bcnt += 3;
			} else {
				acnt += 1;
				bcnt += 1;
			}
		}
		
		System.out.println(acnt + " " + bcnt);
		
		// 두 사람 중 승자를 구하여 출력한다.
		String result = "";
		
		if (acnt > bcnt) {
			result = "A";
		} else if (acnt < bcnt) {
			result ="B";
		} else {
			for (int i = vs.length - 1; i > 0; i--) {
				if (vs[i].equals("a")) {
					result = "A";
					break;
				} else if (vs[i].equals("b")) {
					result = "B";
					break;
				}
				
				if (result.equals("")) {
					result = "D";
				}
			}
		}

		System.out.println(result);
		sc.close();
	}

}