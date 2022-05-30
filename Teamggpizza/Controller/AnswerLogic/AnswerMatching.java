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

		if (level == 5) { // level은 StartingSub stack에 저장되어 있음

			if (nowLevel == 47) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				for (int i = 0; i < ans.answer.size(); i++) {
					// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
					// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
					if (ans.answer.get(i).equals("버섯")) {
						money += 7500;
					}
				}
			}
			
			if (nowLevel == 48) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				for (int i = 0; i < ans.answer.size(); i++) {
					// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
					// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
					if (ans.answer.get(i).equals("소스") && ans.answer.get(i).equals("버섯")) {
						money += 10500;
					}
				}
			}
			
			if (49 <= nowLevel && nowLevel <= 50) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				for (int i = 0; i < ans.answer.size(); i++) {
					// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
					// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
					if (ans.answer.get(i).equals("소스") && ans.answer.get(i).equals("치즈") && ans.answer.get(i).equals("버섯")) {
						money += 14500;
					}
				}
			}
			
			if (nowLevel == 51) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				for (int i = 0; i < ans.answer.size(); i++) {
					// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
					// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
					if (ans.answer.get(i).equals("소스") && ans.answer.get(i).equals("페퍼로니") && ans.answer.get(i).equals("버섯")) {
						money += 16500;
					}
				}
			}
			
			if (nowLevel == 52) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				for (int i = 0; i < ans.answer.size(); i++) {
					// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
					// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
					if (ans.answer.get(i).equals("소스") && ans.answer.get(i).equals("피망") && ans.answer.get(i).equals("버섯")) {
						money += 16500;
					}
				}
			}
			
			if (nowLevel == 53) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				for (int i = 0; i < ans.answer.size(); i++) {
					// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
					// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
					if (ans.answer.get(i).equals("소스") && ans.answer.get(i).equals("소시지") && ans.answer.get(i).equals("버섯")) {
						money += 17000;
					}
				}
			}
			
			if (54 <= nowLevel && nowLevel <= 56) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				for (int i = 0; i < ans.answer.size(); i++) {
					// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
					// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
					if (ans.answer.get(i).equals("소스") && ans.answer.get(i).equals("치즈") && ans.answer.get(i).equals("페퍼로니") && ans.answer.get(i).equals("버섯")) {
						money += 20500;
					}
				}
			}
			
			if (57 <= nowLevel && nowLevel <= 58) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				for (int i = 0; i < ans.answer.size(); i++) {
					// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
					// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
					if (ans.answer.get(i).equals("소스") && ans.answer.get(i).equals("치즈") && ans.answer.get(i).equals("피망") && ans.answer.get(i).equals("버섯")) {
						money += 20500;
					}
				}
			}
			
			if (59 <= nowLevel && nowLevel <= 60) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				for (int i = 0; i < ans.answer.size(); i++) {
					// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
					// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
					if (ans.answer.get(i).equals("소스") && ans.answer.get(i).equals("치즈") && ans.answer.get(i).equals("소시지") && ans.answer.get(i).equals("버섯")) {
						money += 21000;
					}
				}
			}
			
			if (nowLevel == 61) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				for (int i = 0; i < ans.answer.size(); i++) {
					// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
					// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
					if (ans.answer.get(i).equals("소스") && ans.answer.get(i).equals("치즈") && ans.answer.get(i).equals("페퍼로니") && ans.answer.get(i).equals("피망") && ans.answer.get(i).equals("소시지") && ans.answer.get(i).equals("버섯")) {
						money += 33000;
					}
				}
			}
			
		} // level == 5 end

	}
	
}


