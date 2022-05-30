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
		/* 시작과 동시에 우선 level +1이 이루어지고, 추가적으로 다른 로직을 통해서
		 * 특정 구간마다 level이 오르도록 구현할 예정 */
		if(level == 1) {
			
			rdQuest = rd.nextInt(2); // 질문List에 있는 index 2까지만 불러오기(level 1 기준)
			questionList.day1List.get(rdQuest); // 할당 받은 random 질문List를 get
			
		}
		
		nowLevel = rdQuest; // 그 할당 받은 random 번호를 nowLevel에 추가 할당
		                    // 후에 레벨구간별 money를 얼마나 추가할지 구분하기 위함임
		
		return nowLevel;
		
	}


}
