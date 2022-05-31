package QuestionLogic;

import java.util.Random;

import StartSupport.StartingSub;
import Story.Day1_Question;

public class RandomQuestion extends StartingSub {


	int rdQuest;

	public int rdQuestNum() {

		Day1_Question questionList = new Day1_Question();
		Random rd = new Random();
		
		dayCnt++;
		if (dayCnt < 31 && dayCnt % 5 == 0) {
			level += 1;
		}
		

		/*
		 * 시작과 동시에 우선 level +1이 이루어지고, 추가적으로 다른 로직을 통해서 특정 구간마다 level이 오르도록 구현할 예정
		 */

		if (level == 1) {
			rdQuest = rd.nextInt(15); // 질문List에 있는 index 0~14까지만 불러오기(level 1 기준)
			questionList.orderList.get(rdQuest); // 할당 받은 random 질문List를 get

		} else if (level == 2) {
			rdQuest = rd.nextInt(25); // 질문List에 있는 index 0~24까지만 불러오기(level 1+2 기준)
			questionList.orderList.get(rdQuest); // 할당 받은 random 질문List를 get

		} else if (level == 3) {
			rdQuest = rd.nextInt(20) + 15; // 질문List에 있는 index 15~34까지만 불러오기(level 2+3 기준)
			questionList.orderList.get(rdQuest); // 할당 받은 random 질문List를 get

		} else if (level == 4) {
			rdQuest = rd.nextInt(22) + 25; // 질문List에 있는 index 25~46까지만 불러오기(level 3+4 기준)
			questionList.orderList.get(rdQuest); // 할당 받은 random 질문List를 get

		} else if (level == 5) {
			rdQuest = rd.nextInt(27) + 35; // 질문List에 있는 index 35~61까지만 불러오기(level 4+5 기준)
			questionList.orderList.get(rdQuest); // 할당 받은 random 질문List를 get
		}

		nowLevel = rdQuest; // 그 할당 받은 random 번호를 nowLevel에 추가 할당
							// 후에 레벨구간별 money를 얼마나 추가할지 구분하기 위함임

		return nowLevel;

	}

}
