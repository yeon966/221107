// 5. 사용자에게 7의 배수를 순서대로 입력받기 (7 다음? 14 다음? 21 다음? 오답 시 종료, 몇개의 정답을 맞췄는지 출력)

import java.util.Scanner;
public class SevenTimes {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		boolean go = true;
		while (go) {
			System.out.print("정수를 입력하세요.");
			int num = scan.nextInt();
			if (num % 7 == 0) {
				System.out.println("정답");
			} else {
				System.out.println("오답");
				go = false;
			}
		}
	}
}