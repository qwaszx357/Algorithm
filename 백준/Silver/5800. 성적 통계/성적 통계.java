import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 학급 수, 학생 수, 점수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();		
		int k = sc.nextInt();
		
		for (int i = 1; i <= k; i++) {
			int student = sc.nextInt();
			Integer[] score = new Integer[student];
			
			for (int j = 0; j < score.length; j++) {
				score[j] = sc.nextInt();
			}
			
			// 점수가 담긴 배열을 내림차순으로 정렬한다.
			Arrays.sort(score, Collections.reverseOrder());
			
			int max = score[0];
			int min = score[student - 1];	// 최저 점수
			int gap = 0;	// 최다 점수 차이
			
			// 최다 점수 차이를 변수에 넣는다.
			for (int j = 0; j < score.length - 1; j++) {
				gap = Math.max(gap, score[j] - score[j + 1]);
				
			}
			
			sb.append("Class " + (i) + "\n");
            sb.append("Max " + max + ", " + "Min " + min + ", " + "Largest gap " + gap + "\n");
		}
		
		System.out.println(sb);
		sc.close();
	}

}