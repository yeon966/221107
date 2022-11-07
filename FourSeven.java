// 100이하의 4의 배수이거나 7의 배수인 정수를 출력하기
public class FourSeven {
	public static void main(String[] args){
		int num = 0;
		
		
		while (num <= 100) {
			if ((num % 4 == 0) || (num % 7 == 0)) {
				System.out.println(num);		
			}
			++num;
		}
	}
}