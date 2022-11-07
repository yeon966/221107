import java.util.Scanner;
public class StringAEIOU {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 ? ");
		String input = scan.nextLine();
		
		int index = 0;
		while (index < input.length()) {
			System.out.println(input.charAt(index));
			index++;
		}
	}
}