package AnswerLogic;

import QuestionLogic.RandomQuestion;
import StartObject.Starting;
import StartSupport.StartingSub;
import Story.Day1_Question;

public class AnswerMatching extends StartingSub {

	Answer ans = new Answer();
	Day1_Question day1 = new Day1_Question();
	RandomQuestion rdQuest = new RandomQuestion();
	AwCheck awcheck = new AwCheck();
	
	public void answerMT_day1() {
		awcheck.Level1();
		awcheck.Level2();
		awcheck.Level3();
		awcheck.Level4();
		awcheck.Level5();
	}

}
