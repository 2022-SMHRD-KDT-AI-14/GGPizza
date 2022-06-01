package GuestReactionLogic;

import Reaction.GuestReaction;

public class AwReactionCheck extends GuestReactionMatching {

	public void reactionCheck() {
			System.out.println(GuestReaction.goodbadAwList.get(nowReaction));
	}
}
