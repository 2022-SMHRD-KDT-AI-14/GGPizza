package QuestionLogic;

import java.util.Random;

import StartSupport.StartingSub;
import Story.Day1_Question;

public class RandomQuestion extends StartingSub {

	Day1_Question questionList = new Day1_Question();
	Random rd = new Random();

	int rdQuest;

	public int rdQuestNum() {

		level += 1;

		/*
		 * 시작과 동시에 우선 level +1이 이루어지고, 추가적으로 다른 로직을 통해서 특정 구간마다 level이 오르도록 구현할 예정
		 */

		if (level == 1) {
			rdQuest = rd.nextInt(14); // 질문List에 있는 index 0~14까지만 불러오기(level 1 기준)
			questionList.orderList.get(rdQuest); // 할당 받은 random 질문List를 get

		} else if (level == 2) {
			rdQuest = rd.nextInt(10) + 15; // 질문List에 있는 index 15~24까지만 불러오기(level 2 기준)
			questionList.orderList.get(rdQuest); // 할당 받은 random 질문List를 get

		} else if (level == 3) {
			rdQuest = rd.nextInt(10) + 25; // 질문List에 있는 index 25~34까지만 불러오기(level 3 기준)
			questionList.orderList.get(rdQuest); // 할당 받은 random 질문List를 get

		} else if (level == 4) {
			rdQuest = rd.nextInt(12) + 35; // 질문List에 있는 index 35~46까지만 불러오기(level 4 기준)
			questionList.orderList.get(rdQuest); // 할당 받은 random 질문List를 get

		} else if (level == 5) {
			rdQuest = rd.nextInt(15) + 47; // 질문List에 있는 index 47~61까지만 불러오기(level 5 기준)
			questionList.orderList.get(rdQuest); // 할당 받은 random 질문List를 get
		}

		nowLevel = rdQuest; // 그 할당 받은 random 번호를 nowLevel에 추가 할당
							// 후에 레벨구간별 money를 얼마나 추가할지 구분하기 위함임

		return nowLevel;

	}

}
