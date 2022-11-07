// 0초과 ~ 100미만의 정수 중
// 일의 자리 수가 3 또는 6 또는 9인 정수를 출력하기
// 3,6,9,13,16,19
public class ThreeSixNine {
	public static void main(String[] args){
		int i = 0;
		while (i <=100) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9){
			System.out.println(i);
			}
			++i;
		}	
	}
}