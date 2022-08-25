import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scanner로 문자로 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		// 숫자를 한 자리씩 넣을 배열을 만든다.
		Integer arr[] = new Integer[str.length()];
		
		// str을 한글자씩 잘라 숫자로 arr에 넣는다.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str.substring(i,i+1));
		}
		
		// arr을 내림차순으로 정렬한다.
		Arrays.sort(arr, Collections.reverseOrder());
		
		// arr을 출력한다.
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		sc.close();
	}

}