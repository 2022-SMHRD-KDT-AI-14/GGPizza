package StartObject;

import java.util.Scanner;

import UI.Scanners;

public class TutorialScannerSub extends StartingSub implements Scanners {

	Scanner sc = new Scanner(System.in);

	@Override
	public int scannerSubInt() {

		System.out.println(
				"==========================================================================================================");
		System.out.println("���ӽ� �������� ���ڰ���");
		System.out.println(
				"==========================================================================================================");
		System.out.println("[1] ���� [2] ��ŷ��ȸ [3] ����");
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
