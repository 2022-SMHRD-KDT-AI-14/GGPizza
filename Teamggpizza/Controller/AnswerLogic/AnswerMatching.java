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

		if (level == 5) { // level�� StartingSub stack�� ����Ǿ� ����

			if (nowLevel == 47) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				for (int i = 0; i < ans.answer.size(); i++) {
					// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
					// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
					if (ans.answer.get(i).equals("����")) {
						money += 7500;
					}
				}
			}
			
			if (nowLevel == 48) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				for (int i = 0; i < ans.answer.size(); i++) {
					// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
					// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
					if (ans.answer.get(i).equals("�ҽ�") && ans.answer.get(i).equals("����")) {
						money += 10500;
					}
				}
			}
			
			if (49 <= nowLevel && nowLevel <= 50) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				for (int i = 0; i < ans.answer.size(); i++) {
					// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
					// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
					if (ans.answer.get(i).equals("�ҽ�") && ans.answer.get(i).equals("ġ��") && ans.answer.get(i).equals("����")) {
						money += 14500;
					}
				}
			}
			
			if (nowLevel == 51) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				for (int i = 0; i < ans.answer.size(); i++) {
					// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
					// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
					if (ans.answer.get(i).equals("�ҽ�") && ans.answer.get(i).equals("���۷δ�") && ans.answer.get(i).equals("����")) {
						money += 16500;
					}
				}
			}
			
			if (nowLevel == 52) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				for (int i = 0; i < ans.answer.size(); i++) {
					// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
					// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
					if (ans.answer.get(i).equals("�ҽ�") && ans.answer.get(i).equals("�Ǹ�") && ans.answer.get(i).equals("����")) {
						money += 16500;
					}
				}
			}
			
			if (nowLevel == 53) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				for (int i = 0; i < ans.answer.size(); i++) {
					// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
					// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
					if (ans.answer.get(i).equals("�ҽ�") && ans.answer.get(i).equals("�ҽ���") && ans.answer.get(i).equals("����")) {
						money += 17000;
					}
				}
			}
			
			if (54 <= nowLevel && nowLevel <= 56) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				for (int i = 0; i < ans.answer.size(); i++) {
					// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
					// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
					if (ans.answer.get(i).equals("�ҽ�") && ans.answer.get(i).equals("ġ��") && ans.answer.get(i).equals("���۷δ�") && ans.answer.get(i).equals("����")) {
						money += 20500;
					}
				}
			}
			
			if (57 <= nowLevel && nowLevel <= 58) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				for (int i = 0; i < ans.answer.size(); i++) {
					// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
					// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
					if (ans.answer.get(i).equals("�ҽ�") && ans.answer.get(i).equals("ġ��") && ans.answer.get(i).equals("�Ǹ�") && ans.answer.get(i).equals("����")) {
						money += 20500;
					}
				}
			}
			
			if (59 <= nowLevel && nowLevel <= 60) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				for (int i = 0; i < ans.answer.size(); i++) {
					// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
					// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
					if (ans.answer.get(i).equals("�ҽ�") && ans.answer.get(i).equals("ġ��") && ans.answer.get(i).equals("�ҽ���") && ans.answer.get(i).equals("����")) {
						money += 21000;
					}
				}
			}
			
			if (nowLevel == 61) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				for (int i = 0; i < ans.answer.size(); i++) {
					// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
					// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
					if (ans.answer.get(i).equals("�ҽ�") && ans.answer.get(i).equals("ġ��") && ans.answer.get(i).equals("���۷δ�") && ans.answer.get(i).equals("�Ǹ�") && ans.answer.get(i).equals("�ҽ���") && ans.answer.get(i).equals("����")) {
						money += 33000;
					}
				}
			}
			
		} // level == 5 end

	}
	
}


