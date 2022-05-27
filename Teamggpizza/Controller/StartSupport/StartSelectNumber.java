package StartSupport;


import java.util.Scanner;

import UI.Numbers;

public class StartSelectNumber extends StartingSub implements Numbers {

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void numberOf1() {

		if (number == 1) {

			System.out.println("[1] 로그인 [2] 회원가입");
			System.out.println();
			System.out.print("Select number test = ");
			number = sc.nextInt();
			accountSet();

		}

	}

	@Override
	public void numberOf2() {

		if (number == 2) {

			System.out.println("[ranking viewer slot]");
			// ranking reader board method add
			// Main Game load method add
			
		}

	}

	@Override
	public void numberOf3() {

		if(number == 3) {
			
			System.out.println("[game closed]");
			
		}

	}

	public void accountSet() {

		switch (number) {

		case 1:
			System.out.println();
			System.out.println("[id slot]");
			System.out.println("[pw slot]");
			// id, pw method add add
			// Main game load method add
			break;

		case 2:
			System.out.println();
			System.out.println("[account add slot]");
			// account method add
			// Main game load method
			break;

		}
		
		number = 0;

	}


}
