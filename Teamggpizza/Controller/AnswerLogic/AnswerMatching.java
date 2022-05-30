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

		if (level == 1) { // level은 StartingSub stack에 저장되어 있음

			if (nowLevel <= 2) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당

				for (int i = 0; i < ans.answer.size(); i++) {
					// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
					// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리

					if (ans.answer.get(i).equals("소스")) {

						money += 3000;

					}

				}

			}
			
			if (nowLevel >= 3 && nowLevel<=6) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당

				for (int i = 0; i < ans.answer.size(); i++) {
					// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
					// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리

					if (ans.answer.get(i).equals("치즈")) {

						money += 4000;

					}

				}

			}
			
			if (nowLevel >= 7 && nowLevel<=14) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당

				for (int i = 0; i < ans.answer.size(); i++) {
					// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
					// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리

					if (ans.answer.get(i).equals("치즈")&&ans.answer.get(i).equals(ans)) {

						money += 7000;

					}

				}

			}
			
			
			

		}

	}

}
