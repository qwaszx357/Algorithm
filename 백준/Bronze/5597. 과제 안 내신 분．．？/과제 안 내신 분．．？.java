import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 arr에 학생 번호를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[31];
		
		// 과제를 제출한 학생의 번호에 1을 넣는다.
		for (int i = 0; i < 28; i++) {
			int num = sc.nextInt();
			arr[num] = 1;
		}
		
		// 1이 아닌 인덱스를 출력한다.
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != 1) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}