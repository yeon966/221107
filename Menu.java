// 메뉴를 보여주고 입력한 번호의 가격 출력
// 1.콜라 2.사이다 3.커피
// 1900  1700   1800

// 사용자가 계속해서 메뉴를 선택할 수 있음.

import java.util.Scanner;
public class Menu {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("(1.콜라 : 1900원, 2.사이다 : 1700원, 3.커피 : 1800원) 원하는 메뉴의 번호를 입력하세요.");
		
		int i = scan.nextInt();
		while (i == 1 || i == 2 || i == 3) {
			if (i == 1) {
				System.out.println("콜라 : 1900원");
			} else if (i == 2) {
				System.out.println("사이다 : 1700원");
			} else if (i == 3) {
				System.out.println("커피 : 1800원");
			} else {
				System.out.println("프로그램 종료.");
			}
			
		}
	}
} 