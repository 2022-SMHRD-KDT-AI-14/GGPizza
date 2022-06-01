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
			rdReaction = rd.nextInt(11); // good ���׼� ����Ʈ�� �ִ� �ε��� 0~10���� �ҷ�����
			reactionList.goodAwList.get(rdReaction);
			
		}else if (awCheck ==0) { // badReaction
			rdReaction = rd.nextInt(11); // bad ������ ����Ʈ�� �ִ� �ε��� 0~9���� �ҷ�����
			reactionList.badAwList.get(rdReaction);
		}
		
		nowReaction = rdReaction; // �Ҵ� ���� ���� ��ȣ�� nowReaction�� �߰� �Ҵ�
		return nowReaction;
	}

}