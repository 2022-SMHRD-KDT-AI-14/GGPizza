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
			rdReaction = rd.nextInt(11); // good ���׼� ����Ʈ�� �ִ� �ε��� 0~10���� �ҷ�����
			reactionList.goodbadAwList.get(rdReaction);

		} else if (awReactionCheck == 0) { // badReaction
			rdReaction = rd.nextInt(11)+10; // bad ������ ����Ʈ�� �ִ� �ε��� 0~9���� �ҷ�����
			reactionList.goodbadAwList.get(rdReaction);
		}

		nowReaction = rdReaction; // �Ҵ� ���� ���� ��ȣ�� nowReaction�� �߰� �Ҵ�
		return nowReaction;
	}

}