package QuestionLogic;

import java.util.Random;

import StartSupport.StartingSub;
import Story.Day1_Question;

public class RandomQuestion extends StartingSub {

	Day1_Question questionList = new Day1_Question();
	Random rd = new Random();
	
	int rdQuest;
	
	public int rdQuestNum() {
		
		level +=1;
		/* ���۰� ���ÿ� �켱 level +1�� �̷������, �߰������� �ٸ� ������ ���ؼ�
		 * Ư�� �������� level�� �������� ������ ���� */
		if(level == 1) {
			
			rdQuest = rd.nextInt(2); // ����List�� �ִ� index 2������ �ҷ�����(level 1 ����)
			questionList.day1List.get(rdQuest); // �Ҵ� ���� random ����List�� get
			
		}
		
		nowLevel = rdQuest; // �� �Ҵ� ���� random ��ȣ�� nowLevel�� �߰� �Ҵ�
		                    // �Ŀ� ���������� money�� �󸶳� �߰����� �����ϱ� ������
		
		return nowLevel;
		
	}


}
