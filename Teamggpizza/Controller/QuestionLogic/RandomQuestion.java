package QuestionLogic;

import java.util.Random;

import StartSupport.StartingSub;
import Story.Day1_Question;

public class RandomQuestion extends StartingSub {

	Day1_Question questionList = new Day1_Question();
	Random rd = new Random();

	int rdQuest;

	public int rdQuestNum() {

		level += 1;

		/*
		 * ���۰� ���ÿ� �켱 level +1�� �̷������, �߰������� �ٸ� ������ ���ؼ� Ư�� �������� level�� �������� ������ ����
		 */

		if (level == 1) {
			rdQuest = rd.nextInt(14); // ����List�� �ִ� index 0~14������ �ҷ�����(level 1 ����)
			questionList.orderList.get(rdQuest); // �Ҵ� ���� random ����List�� get

		} else if (level == 2) {
			rdQuest = rd.nextInt(10) + 15; // ����List�� �ִ� index 15~24������ �ҷ�����(level 2 ����)
			questionList.orderList.get(rdQuest); // �Ҵ� ���� random ����List�� get

		} else if (level == 3) {
			rdQuest = rd.nextInt(10) + 25; // ����List�� �ִ� index 25~34������ �ҷ�����(level 3 ����)
			questionList.orderList.get(rdQuest); // �Ҵ� ���� random ����List�� get

		} else if (level == 4) {
			rdQuest = rd.nextInt(12) + 35; // ����List�� �ִ� index 35~46������ �ҷ�����(level 4 ����)
			questionList.orderList.get(rdQuest); // �Ҵ� ���� random ����List�� get

		} else if (level == 5) {
			rdQuest = rd.nextInt(15) + 47; // ����List�� �ִ� index 47~61������ �ҷ�����(level 5 ����)
			questionList.orderList.get(rdQuest); // �Ҵ� ���� random ����List�� get
		}

		nowLevel = rdQuest; // �� �Ҵ� ���� random ��ȣ�� nowLevel�� �߰� �Ҵ�
							// �Ŀ� ���������� money�� �󸶳� �߰����� �����ϱ� ������

		return nowLevel;

	}

}
