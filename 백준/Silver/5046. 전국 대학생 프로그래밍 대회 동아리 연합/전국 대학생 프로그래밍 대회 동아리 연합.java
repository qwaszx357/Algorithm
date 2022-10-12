import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 문제 풀이에 필요한 정보를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int people_num = sc.nextInt();	// 참가자의 수
		int budget = sc.nextInt();	// 예산
		int hotel = sc.nextInt();	// 호텔의 수
		int week = sc.nextInt();	// 주의 수
		
		Integer[] people = new Integer[hotel];	// 일인당 숙박비용
		Integer[] a_people = new Integer[week];		// 투숙 가능 인원
		
		for (int i = 0; i < hotel; i++) {
			people[i] = sc.nextInt();
			
			for (int j = 0; j < week; j++) {
				a_people[j] = sc.nextInt();
			}
			
			// 투숙 가능 인원 배열을 내림차순으로 정렬하여 투숙 불가능 한 곳을 찾아 -1을 넣는다.
			Arrays.sort(a_people, Collections.reverseOrder());
			
			if (people_num > a_people[0]) {
				people[i] = 10001;
			}
		}
		
		Arrays.sort(people);

		int result = people[0] * people_num;
		
		// 예산을 초과하는지, 투숙 가능 인원을 초과하는지 확인 후 결과를 출력한다.
		if (result < 0) {
			System.out.println("stay home");
		} else {
			if (result <= budget) {
				System.out.println(result);
			} else if (result > budget) {
				System.out.println("stay home");
			}
		}
		
		sc.close();
	}

}