// 사용자에게 문자열을 입력받아
// 모음의 개수를 출력해보세요~~
// a,e,i,o,u
import java.util.Scanner;
public class EngTest {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String str = input.nextLine();
		int length = str.length();
		int i = 0;
		int count = 0;
		while (i <= length - 1) {
			if (str.charAt(i) == 'a' ||
				str.charAt(i) == 'e' ||
				str.charAt(i) == 'i' ||
				str.charAt(i) == 'o' ||
				str.charAt(i) == 'u') {
				++count;}	
			++i;
		}
		System.out.println(count);	
	}
}