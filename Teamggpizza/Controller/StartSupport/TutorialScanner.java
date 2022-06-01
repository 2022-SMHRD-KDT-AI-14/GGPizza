package StartSupport;

import java.util.Scanner;

public class TutorialScanner extends StartingSub {


	Scanner sc = new Scanner(System.in);
	
	public void firstView() {
		System.out.println();
		// System.out.println("==========================================================================================================");
		System.out.println("◑ 제임스 고슬링씨의 피자가게 ◐");
		System.out.println("==========================================================================================================");
		System.out.println(" [1] 시작  [2] 랭킹조회  [3] 종료");
		System.out.print(" 숫자를 입력하세요 >> ");
		number = sc.nextInt(); 
		// number에 수 할당, number에 따라 각기 다른 메뉴 전개
		System.out.println("==========================================================================================================");
		
	}

}
