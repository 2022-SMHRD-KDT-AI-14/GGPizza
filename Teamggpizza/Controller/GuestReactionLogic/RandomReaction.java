package GuestReactionLogic;

import Reaction.GuestReaction;

import java.util.Random;

import AnswerLogic.AnswerMatching;
import AnswerLogic.AwCheck;

public class RandomReaction extends AnswerMatching {
	
	int rdReaction;
	
	public int rdReactionNum() {
		GuestReaction reactionList = new GuestReaction();
		
		Random rd = new Random();
		
		
		if (awCheck == 1) { // goodReaction
			rdReaction = rd.nextInt(11); // good 리액션 리스트에 있는 인덱스 0~10까지 불러오기
			reactionList.goodAwList.get(rdReaction);
			
		}else if (awCheck ==0) { // badReaction
			rdReaction = rd.nextInt(11); // bad 리엑션 리스트에 있는 인덱스 0~9까지 불러오기
			reactionList.badAwList.get(rdReaction);
		}
		
		nowReaction = rdReaction; // 할당 받은 랜덤 번호를 nowReaction에 추가 할당
		return nowReaction;
	}

}