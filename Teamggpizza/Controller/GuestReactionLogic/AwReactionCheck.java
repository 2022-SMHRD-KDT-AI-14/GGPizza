package GuestReactionLogic;

import Image.Reaction;
import Reaction.GuestReaction;

public class AwReactionCheck extends GuestReactionMatching {

	public void reactionCheck() {
			System.out.println(GuestReaction.goodbadAwList.get(nowReaction));
	}
	
	public void reactionimgCheck() {
		System.out.println(Reaction.guestEmotionList.get(nowrdReactionImg));
}
}
