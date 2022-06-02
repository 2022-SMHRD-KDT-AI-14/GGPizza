package Image;

import java.util.Random;

import StartSupport.StartingSub;

public class RandomReactionImage extends StartingSub {
	int rdReactionImg;
	
	public int reRactionImgNum() {
		Reaction reactionImgList = new Reaction();
		reactionImgList.guestEmotion();
		Random rd = new Random();
		
		if(awReactionCheck==1) {
			rdReactionImg = rd.nextInt(11);
			reactionImgList.guestEmotionList.get(rdReactionImg);
		}else if (awReactionCheck==0) {
			rdReactionImg = rd.nextInt(11)+11;
			reactionImgList.guestEmotionList.get(rdReactionImg);
		}
		nowrdReactionImg = rdReactionImg;
		return nowrdReactionImg;
	}
}
