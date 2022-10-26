import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 홍준의 이름을 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		String name = ":" + sc.next() + ":";
		
		String str = ":fan:";
		
		// 두번째 줄에 홍준의 이름을 넣어 출력한다.
		for (int i = 0; i < 3; i++) {
			if (i != 1) {
				System.out.println(str + str + str);
			} else {
				System.out.println(str + name + str);
			}
			
		}
		
		sc.close();
	}

}