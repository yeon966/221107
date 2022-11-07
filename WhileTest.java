// 8의 배수를 출력하기 (단, 100보다 작은 수)
// 몇 개?
public class WhileTest {
	public static void main(String[] args){
	
		int i = 1;
		
		while ((8 * i) < 100) {
			System.out.println(8 * i);
			++i;
		}
		System.out.println(i-1);
	}
}