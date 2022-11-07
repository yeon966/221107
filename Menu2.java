import java.util.Scanner;
public class Menu2 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		boolean go = true;
		while (go) {
			System.out.println("(1.콜라 : 1900원, 2.사이다 : 1700원, 3.커피 : 1800원) \n 원하시는 메뉴의 번호를 입력하세요.");
			
			int number = scan.nextInt();
			
			if (number == 1) {
				System.out.println("콜라 : 1900원");
			} else if (number == 2) {
				System.out.println("사이다 : 1700원");
			} else {
				System.out.println("커피 : 1800원");
			}
			go = (number != 0 || number >= 4);
		}
		System.out.println("종료.");
	}
}	