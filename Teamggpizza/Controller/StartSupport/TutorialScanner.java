package StartSupport;

import java.util.Scanner;

public class TutorialScanner extends StartingSub {


	Scanner sc = new Scanner(System.in);
	
	public void firstView() {

		System.out.println(
				"==========================================================================================================");
		System.out.println("제임스 고슬링씨의 피자가게");
		System.out.println(
				"==========================================================================================================");
		System.out.println("[1] 시작 [2] 랭킹조회 [3] 종료");
		System.out.println(
				"==========================================================================================================");
		System.out.println();
		System.out.print("Select number = ");
		number = sc.nextInt();
		System.out.println();
		
	}

}
