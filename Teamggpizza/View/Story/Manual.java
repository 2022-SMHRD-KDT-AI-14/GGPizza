package Story;

import StartSupport.StartingSub;

public class Manual extends StartingSub {

	char talkSub = '"';

	public void tutorial() {

		name = "������";
		// Scanner�� name�� ������ DB�� ������ ������ �� �Ҵ礤

		System.out.println("==========================================================================================================");
		System.out.println("Story");
		System.out.println("==========================================================================================================");

		System.out.println("[���ӽ� ����] (�Ѽ� ǫ)");
		System.out.println("[" + name + "] " + talkSub + "?.? ������, ���� �� ��������?" + talkSub);
		System.out.println("[���ӽ� ����] " + talkSub + "�ڷγ��� ���� �� ���ڰ��԰� ���ϰھ�...�Ф�" + talkSub);
		System.out.println("[" + name + "] " + talkSub + "��.. ���� ��簡 �ߵǵ��� ���͵帱�Կ�!" + talkSub);
		System.out.println("[���ӽ� ����] " + talkSub + "��! �׷���, " + name + ", �� ���ڰ����� ������ �ʷ� ���ߴ�!" + talkSub);
		System.out.println("[" + name + "] " + talkSub + "�� ��¥��? ���ƿ�!! bb" + talkSub);
		System.out.println("==========================================================================================================");
		System.out.println();
		
	}
	
//      ��� �Է��� �ʿ��� �� �Ʒ� ���� �� "���" �κи� �Է�
//	    System.out.println("[���ӽ� ����] " + talkSub + "���" + talkSub);
//		System.out.println("[" + name + "] " + talkSub + "���" + talkSub);

	public void manual() {
		
		System.out.println("==========================================================================================================");
		System.out.println("���ӹ��");
		System.out.println("==========================================================================================================");
		System.out.println("�մ��� �ֹ��� �޾� �ʿ��� ���ΰ� ��Ḧ Ÿ������ ���ڸ� ���弼��.");
		System.out.println("������ ���� ������ �߰��ϸ� �� �پ��� ���ڸ� ���� �� �־��.");
		System.out.println("��ȸ�� 3�� �־�����, ��� ������ ������ ����˴ϴ�.");
		System.out.println("==========================================================================================================");

	}
	
}
