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

	// 각 챕터별 세부적으로 method를 조합하는 class 입니다.

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
		
		// view에서 처음으로 보여지는 tutorial part

		tutosc.firstView();
		// 첫 시작 메뉴와 스캐너로 number에 수를 할당

		startnum.numberOf1();
		startnum.numberOf2();
		startnum.numberOf3();
		/*
		 * 스캔 받은 number에 따라 다르게 전개되는 start 구간 모두 startSelectNumber.class 안에 있는 method
		 * 이름에서 보여지듯 start 부분만 할당되고 해당 number에 method를 부여 다음 chapter로 연결할 예정
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
		 * 수정하는 부분들을 위해 편의상 메뉴얼 UI만 존재할 뿐 Starting에는 할당되지 않음 tutorial과 manual 출력은
		 * accountSet method 내 switch문 case 1에 존재함
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

			// 본 게임 시작
			rdQuest.rdQuestNum(); // 랜덤 질문 List method
			ans.answerScanner(); // 질문에 대한 토핑 답하는 method
			ach.levels(); // 정답 매칭 시스템
			cnt++;
			ans.answer.clear();
			System.out.println();
			System.out.println("Cnt view Test : " + cnt);

		}

		System.out.println();
		System.out.println("test money value : " + money);
		// money에 잘 담아지는지 확인하는 용도의 print

	}

}
