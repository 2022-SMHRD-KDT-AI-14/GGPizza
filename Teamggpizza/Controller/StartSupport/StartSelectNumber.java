package StartSupport;


import java.util.Scanner;

import UI.Numbers;

public class StartSelectNumber extends StartingSub implements Numbers {

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void numberOf1() {

		if (number == 1) {

			System.out.println("[1] �α��� [2] ȸ������");
			System.out.println();
			System.out.print("Select number test = ");
			number = sc.nextInt(); 
			// firstview()���� �Ҵ���� number�� �� �� �� �ʱ�ȭ�Ǵ� part
			accountSet();
			/* number �Ҵ� �� accountSet()�� ���� 
			 * �Ҵ� ���� number�� accountSet()���� ���� �ٸ� �α��� �޴��� �����
			 * �ش� method���� ���� �ٸ� slot�� �ְ� �׿� ���� method ���� */

		}

	}

	@Override
	public void numberOf2() {

		if (number == 2) {

			System.out.println("[ranking viewer slot]");
			/* ���� ���� firstview���� �Ҵ�� �� number�� 2�Ͻ� ��ŷ���� ���� ����
			 * �� part������ ��ŷ�� ������ �� mainGame ������ ���ƿ��� method ������ �Ǿ�� ��
			 * ���� �ʿ��� method�� �Ʒ� ��ϰ� ����
			 * ranking reader board method add
			 * Main Game load method add */
			
		}

	}

	@Override
	public void numberOf3() {

		if(number == 3) {
			
			System.out.println("[game closed]");
			// number�� 3�Ͻ� ���� ����, Assembly�� �ִ� method���� �۵����� �ʴ� ������ ����
			
		}

	}

	public void accountSet() {

		switch (number) {

		case 1:
			System.out.println();
			System.out.println("[id slot]");
			System.out.println("[pw slot]");
			// id, pw method part
			// �����ؾ� �ϴ� method ����� �Ʒ��� ����
			// id, pw method add add
			// Main game load method add
			break;

		case 2:
			System.out.println();
			System.out.println("[account add slot]");
			// ȸ������ part�̸�, case 1�� ���� ����
			// account method add
			// Main game load method
			break;

		}
		
		number = 0;

	}


}
