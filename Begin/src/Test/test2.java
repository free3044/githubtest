package Test;
import java.util.*;
/* switch case문 사용
12, 1 ,2 -> 겨울
3, 4, 5 -> 봄
6, 7, 8 -> 여름
9, 10, 11 ->가을
잘못 입력했을 경우 처리
*/

public class test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("월 입력(1~12)");
		int month=sc.nextInt();
		String season="";
		
		switch(month) {
		case 12,1,2:
			season="겨울";
			break;
		case 3,4,5:
			season="봄";
			break;
		case 6,7,8:
			season="여름";
			break;
		case 9,10,11:
			season="가을";
			break;
		default:
			System.out.println("월을 입력하세요(1~12)");
			return;
		}
		System.out.println(month+"월은 "+season+"입니다.");
	}

}
