package AnswerLogic;

import QuestionLogic.RandomQuestion;
import StartObject.Starting;
import StartSupport.StartingSub;
import Story.Day1_Question;

public class AnswerMatching extends StartingSub {

	Answer ans = new Answer();
	Day1_Question day1 = new Day1_Question();
	RandomQuestion rdQuest = new RandomQuestion();

	public void answerMT_day1() {

		if (level == 1) { // level�� StartingSub stack�� ����Ǿ� ����

			if (nowLevel <= 2) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�

				for (int i = 0; i < ans.answer.size(); i++) {
					// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
					// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��

					if (ans.answer.get(i).equals("�ҽ�")) {

						money += 3000;

					}

				}

			}
			
			if (nowLevel >= 3 && nowLevel<=6) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�

				for (int i = 0; i < ans.answer.size(); i++) {
					// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
					// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��

					if (ans.answer.get(i).equals("ġ��")) {

						money += 4000;

					}

				}

			}
			
			if (nowLevel >= 7 && nowLevel<=14) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�

				for (int i = 0; i < ans.answer.size(); i++) {
					// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
					// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��

					if (ans.answer.get(i).equals("ġ��")&&ans.answer.get(i).equals(ans)) {

						money += 7000;

					}

				}

			}
			
			
			

		}

	}

}
