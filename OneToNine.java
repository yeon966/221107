// 2. 사용자에게 1 ~ 9사이의 정수를 입력받아
//    2자리의 자연수 중 각 자리수의 합이 입력값과 동일한 수 출력하기
//    입출력예시) 6 => 15 24 33 42 51 60
import java.util.Scanner;
public class OneToNine {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("1에서 9까지의 정수 중 하나를 입력하세요.");
		int num = input.nextInt();
		int i = 10;
		
		while (i >= 10 && i < 100) {
			int result = i / 10 + i % 10;
			if (result == num && num <= 9) {
				System.out.println(i / 10 + "" + i % 10);
			}
			++i;
		}
		System.out.println("종료.");
	}
}