package StartSupport;


import java.util.Scanner;

import Story.Manual;
import UI.Numbers;


public class StartSelectNumber extends StartingSub implements Numbers {
	
	MemberDAO dao = new MemberDAO();
	MemberDTO dto;
	
	Scanner sc = new Scanner(System.in);
	
	protected String id;
	protected String pw;
	
	Manual manual = new Manual();
	
	@Override
	public void numberOf1() {

		if (number == 1) {

			System.out.println("[1] �α��� [2] ȸ������");
			System.out.println();
			System.out.print("Select number test = ");
			number = sc.nextInt();
			
			while (true) {
				 if (number == 1) {

					System.out.println("�α���");
					System.out.print("ID �Է��ϼ��� : ");
					String id = sc.next();
					System.out.print("PW �Է��ϼ��� : ");
					String pw = sc.next();
					dto = new MemberDTO(id, pw);
					dao.login(dto);
					accountSet();
					break;
				}
			}
				if(number ==2) {
					
					
					
				}

			}
			
			
			// firstview()���� �Ҵ���� number�� �� �� �� �ʱ�ȭ�Ǵ� part
			/* number �Ҵ� �� accountSet()�� ���� 
			 * �Ҵ� ���� number�� accountSet()���� ���� �ٸ� �α��� �޴��� �����
			 * �ش� method���� ���� �ٸ� slot�� �ְ� �׿� ���� method ���� */

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
			// id, pw method part
			// �����ؾ� �ϴ� method ����� �Ʒ��� ����
			// id, pw method add add
			// Main game load method add

			System.out.print("���̵� �Է� : ");
			id = sc.next();
			System.out.print("��й�ȣ �Է� : ");
			pw = sc.next();
			
			if(id.equals("master") && pw.equals("master")) {
				
				System.out.println();
				manual.tutorial();
				manual.manual();
				// master id, test �������� ���̵�, ��й�ȣ�� master �Է½� ���丮 ����
				
			}
			
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



