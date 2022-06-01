package StartSupport;

import java.util.Scanner;

import AnswerLogic.Answer;
import AnswerLogic.AnswerMatching;
import AnswerLogic.AwCheck;
import GuestReactionLogic.RandomReaction;
import QuestionLogic.RandomQuestion;
import Reaction.GuestReaction;
import Story.Day1_Question;
import Story.Manual;
import UI.Tutorial;

public class Assembly extends StartingSub implements Tutorial {

	// �� é�ͺ� ���������� method�� �����ϴ� class �Դϴ�.

	int cnt;
	String enter;

	@Override
	public void manual() {
		TutorialScanner tutosc = new TutorialScanner();
		StartSelectNumber startnum = new StartSelectNumber();
		RandomQuestion rdQuest = new RandomQuestion();
		Answer ans = new Answer();
		Manual manual = new Manual();
		Day1_Question dayList = new Day1_Question();
		AnswerMatching ansMat = new AnswerMatching();
		AwCheck ach = new AwCheck();
		Scanner sc = new Scanner(System.in);

		manual.tutorial();
		manual.manual();

		/*
		 * �����ϴ� �κе��� ���� ���ǻ� �޴��� UI�� ������ �� Starting���� �Ҵ���� ���� tutorial�� manual �����
		 * accountSet method �� switch�� case 1�� ������
		 */

	}

	@Override
	public void tutorial() {
		TutorialScanner tutosc = new TutorialScanner();
		StartSelectNumber startnum = new StartSelectNumber();
		RandomQuestion rdQuest = new RandomQuestion();
		Answer ans = new Answer();
		Manual manual = new Manual();
		Day1_Question dayList = new Day1_Question();
		AnswerMatching ansMat = new AnswerMatching();
		AwCheck ach = new AwCheck();

		// view���� ó������ �������� tutorial part

		tutosc.firstView();
		// ù ���� �޴��� ��ĳ�ʷ� number�� ���� �Ҵ�

		startnum.numberOf1();
		startnum.numberOf2();
		startnum.numberOf3();
		/*
		 * ��ĵ ���� number�� ���� �ٸ��� �����Ǵ� start ���� ��� startSelectNumber.class �ȿ� �ִ� method
		 * �̸����� �������� start �κи� �Ҵ�ǰ� �ش� number�� method�� �ο� ���� chapter�� ������ ����
		 */

		dayList.day1Quest();
		manual();

	}

	public void Game() {

		TutorialScanner tutosc = new TutorialScanner();
		StartSelectNumber startnum = new StartSelectNumber();
		RandomQuestion rdQuest = new RandomQuestion();
		Answer ans = new Answer();
		Manual manual = new Manual();
		Day1_Question dayList = new Day1_Question();
		AnswerMatching ansMat = new AnswerMatching();
		AwCheck ach = new AwCheck();
		Scanner sc = new Scanner(System.in);
		RandomReaction rdReaction = new RandomReaction();

		level += 1;

		while (cnt != 25) {

			// �� ���� ����
			rdQuest.rdQuestNum(); // ���� ���� List method
			
			if (cnt == 0 || cnt == 5 || cnt == 10 || cnt == 15 || cnt == 20 || cnt == 25 ) {
				System.out.println("[ Day " + (day + 1) + " �� ����! ]");
			} // ���ӽ��۽� day ǥ��
			
			ans.answerScanner(); // ������ ���� ���� ���ϴ� method
			ach.levels(); // ���� ��Ī �ý���
			
			if (awCheck==1) {
				System.out.println("�����Դϴ�");
			} else {
				System.out.println("�����̾ƴմϴ�");
			}
			
			cnt++;
			char talkSub = '"';
			String enter = "";
			
			if (cnt % 5 == 0) { // 5������ ī��Ʈ
				day++;
				
				System.out.println();
				System.out.println("===============================================================");
				System.out.println("���ӽ� ������ : " + talkSub + "����ߴ�. ����� �ð��̴�!" + talkSub);
				System.out.println(name + " : " + talkSub + "����~ Į������!!!" + talkSub);
				System.out.println("===============================================================");
				System.out.println();

				System.out.println("[ Day " + day + " �Ǹ� ���� ]");
				System.out.println("�� ��ü ���� : " + money + "�� ��");

				System.out.println();
				System.out.println("===============================================================");

				if (day < 5) { 
					System.out.print("�������� �����? " + talkSub + "��" + talkSub + "��� �Է� >> ");
					enter = sc.next();
				}

			}

			ans.answer.clear();
			System.out.println();
			System.out.println("Cnt view Test : " + cnt);

		}

		System.out.println();
		System.out.println("test money value : " + money);
		// money�� �� ��������� Ȯ���ϴ� �뵵�� print

	}

}
