package StartObject;

import java.util.Scanner;

import UI.Scanners;

public class TutorialScannerSub extends StartingSub implements Scanners {

	Scanner sc = new Scanner(System.in);

	@Override
	public int scannerSubInt() {

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

		return number;
		
	}

	@Override
	public void scannerSub() {

		
		
	}

}
