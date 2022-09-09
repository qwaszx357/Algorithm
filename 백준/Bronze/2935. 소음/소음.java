import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 스캐너로 두 수와 연산자를 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger();
		String str = sc.next();
		BigInteger b = sc.nextBigInteger();
		
		// 만약 연산자가 *일 경우 두 수를 곱하고, +일 경우 두 수를 더한다.
		if (str.equals("*")) {
			System.out.println(a.multiply(b));
		} else if (str.equals("+")) {
			System.out.println(a.add(b));
		}
		
		sc.close();
	}

}