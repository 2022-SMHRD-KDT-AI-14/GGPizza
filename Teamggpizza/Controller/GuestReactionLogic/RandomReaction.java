package GuestReactionLogic;

import Reaction.GuestReaction;
import StartSupport.StartingSub;

import java.util.Random;

public class RandomReaction extends StartingSub {

	int rdReaction;

	public int rdReactionNum() {
		GuestReaction reactionList = new GuestReaction();
		reactionList.goodbadAw();
		reactionList.goodbadAw();
		Random rd = new Random();

		if (awReactionCheck == 1) { // goodReaction
			rdReaction = rd.nextInt(11); // good 리액션 리스트에 있는 인덱스 0~10까지 불러오기
			reactionList.goodbadAwList.get(rdReaction);

		} else if (awReactionCheck == 0) { // badReaction
			rdReaction = rd.nextInt(11)+10; // bad 리엑션 리스트에 있는 인덱스 0~9까지 불러오기
			reactionList.goodbadAwList.get(rdReaction);
		}

		nowReaction = rdReaction; // 할당 받은 랜덤 번호를 nowReaction에 추가 할당
		return nowReaction;
	}

}