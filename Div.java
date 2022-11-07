// 3. 사용자가 입력한 정수의 약수를 작은 수부터 나열하여 출력하기
//    약수? 입출력예시) 24 = > 1 2 3 4 6 8 12 24
import java.util.Scanner;
public class Div {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("하나의 정수를 입력하세요.");
		int user = input.nextInt();
		int i = 1;
		
		while (i >= 1 && i <= user) {
			if (user % i == 0){
				System.out.println(i);
			}
			++i;
		}
		System.out.println("프로그램 종료.");
	}
}