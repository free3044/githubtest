package Test;
import java.util.*;
/* 점수입력->0~100
 * 학년입력->1~4
 * 60점 이상 합격 미만 불합격
 * 4학년은 70점 이상 합격
 * */

public class test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하세요=>");
			int input =sc.nextInt();
			System.out.println(input+"점");
		
		System.out.println("학년을 입력하세요=>");
			int input2 =sc.nextInt();
			
			System.out.println(input2+"학년");
			
			if(input>60 && input2<4) {
				System.out.println("합격");
			
			}else if(input>=70 && input2==4) {
				System.out.println("합격");
			
			}else {
				System.out.println("불합격");
			}

	}

}
