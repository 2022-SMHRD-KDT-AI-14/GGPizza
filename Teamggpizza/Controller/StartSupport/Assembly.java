package StartSupport;

import java.util.Scanner;

import AnswerLogic.Answer;
import AnswerLogic.AnswerMatching;
import AnswerLogic.AwCheck;
import QuestionLogic.RandomQuestion;
import Story.Day1_Question;
import Story.Manual;
import UI.Tutorial;

public class Assembly extends StartingSub implements Tutorial {

	// �� é�ͺ� ���������� method�� �����ϴ� class �Դϴ�.

	int cnt;
	String enter;

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
	}

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

	public void Game() {
		
		TutorialScanner tutosc = new TutorialScanner();
		StartSelectNumber startnum = new StartSelectNumber();
		RandomQuestion rdQuest = new RandomQuestion();
		Answer ans = new Answer();
		Manual manual = new Manual();
		Day1_Question dayList = new Day1_Question();
		AnswerMatching ansMat = new AnswerMatching();
		AwCheck ach = new AwCheck();

		level+=1;
		
		while (cnt != 25) {

			// �� ���� ����
			rdQuest.rdQuestNum(); // ���� ���� List method
			ans.answerScanner(); // ������ ���� ���� ���ϴ� method
			ach.levels(); // ���� ��Ī �ý���
			cnt++;
			ans.answer.clear();
			System.out.println();
			System.out.println("Cnt view Test : " + cnt);

		}

		System.out.println();
		System.out.println("test money value : " + money);
		// money�� �� ��������� Ȯ���ϴ� �뵵�� print

	}

}
