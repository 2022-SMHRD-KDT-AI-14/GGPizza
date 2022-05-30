package StartSupport;

import Story.Manual;
import UI.Tutorial;

public class Assembly implements Tutorial {

	// �� é�ͺ� ���������� method�� �����ϴ� class �Դϴ�.
	
	TutorialScanner tutosc = new TutorialScanner();
	StartSelectNumber startnum = new StartSelectNumber();
	Manual manual = new Manual();
	
	@Override
	public void tutorial() { 
		
		// view���� ó������ �������� tutorial part
	
		tutosc.firstView(); 
		// ù ���� �޴��� ��ĳ�ʷ� number�� ���� �Ҵ�
		
		startnum.numberOf1();
		startnum.numberOf2();
		startnum.numberOf3();
		/* ��ĵ ���� number�� ���� �ٸ��� �����Ǵ� start ����
		 ��� startSelectNumber.class �ȿ� �ִ� method
		 �̸����� �������� start �κи� �Ҵ�ǰ� �ش� number�� method�� �ο�
		 ���� chapter�� ������ ���� */
		
	}
	
	@Override
	public void manual() {
		
		manual.tutorial();
		
		/* tutorial ������ ���� �� manual�� �������� view part
		   ��ɻ� start �κ������� �������� �������� ����
		   tutorial�� manual�� ��������
		   starting���� logON�� ��� �Ҵ�Ǹ� �� ������ ���۵Ǳ� �� logON����
		   ��� ��üȭ�� ����� */

	}


}
