package StartObject;

import UI.Numbers;
import UI.Scanners;

public class StartSelectNumber extends StartingSub implements Numbers, Scanners {

	@Override
	public void numberOf1() {

		if (number == 1) {
			
			System.out.println("[1] �α��� [2] ȸ������");
			number = sc.nextInt();
			scannerSub();
			
		}
		
	}

	@Override
	public void numberOf2() {

			System.out.println("ranking viewer");
			// ranking reader board add
		
	}

	@Override
	public void numberOf3() {

		System.out.println("������ �����մϴ�.");
		
		
	}

	@Override
	public void scannerSub() {
		
		switch(number) {
		
		case 1:
			System.out.println("id slot");
			System.out.println("pw slot");
			// id, pw method add
			break;
			
		case 2:
			System.out.println("account add slot");
			// account method add
			break;
		
		}
		
	}

	@Override
	public int scannerSubInt() {

		return 0;
		
	}

}
