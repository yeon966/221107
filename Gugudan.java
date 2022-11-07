// 사용자의 입력을 받아
// 원하는 구구단 단수 출력

// 예 ) 2
// 2 X 1 = 2
// 2 X 2 = 4
// ...
// 2 X 9 = 18
import java.util.Scanner;
public class Gugudan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("구구단 단수?");
		int num1 = scan.nextInt();
		int dan = 1;
		
		while (dan <= 9) {
		System.out.println(num1 + " X " + dan + " = " +(num1 * dan));
		++dan;
		}
	}
}