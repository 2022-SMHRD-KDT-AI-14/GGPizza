package StartSupport;

import java.util.Scanner;

public class TutorialScanner extends StartingSub {


	Scanner sc = new Scanner(System.in);
	
	public void firstView() {

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
		// number�� �� �Ҵ�, number�� ���� ���� �ٸ� �޴� ����
		System.out.println();
		
	}

}
