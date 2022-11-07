// 4. 사용자에게 두 개의 정수(n, m)을 입력받아
//    n의 m제곱을 구하여 출력하기. (너무 큰 수의 경우 자료형타입을 고민해보세요.)
//    입출력예시) 2 5 => 32
import java.util.Scanner;
public class NSquareM {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요.");
		long n = scan.nextLong();
		System.out.print("두 번째 정수를 입력하세요.");
		long m = scan.nextLong();
		int i = 1;
		while (i <= m) {
			n *= n;
			++i;
			
		}
		System.out.println(n);
	}
}