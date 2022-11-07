// 0부터 사용자가 입력한 정수만큼 별 출력하기
// 홀수 번째는 ☆
// 짝수 번째는 ★

import java.util.Scanner;
public class LoopVar {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int limit = scan.nextInt();
	
		while (i < limit){
			if (i % 2 == 0) {
				System.out.print("★");	
			} else {
				System.out.print("☆");
			}
			i++;
		}
	}
}