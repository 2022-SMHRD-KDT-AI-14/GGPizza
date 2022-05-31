package Reaction;

import java.util.ArrayList;

public class GuestReaction {

	ArrayList<String> goodAwList = new ArrayList<String>();
	public void goodAw() {
		goodAwList.add("감동받았어요! 이 피자를 본 제가 말이에요!"); // 0
		goodAwList.add("누가 저한테 초능력 탐지기 좀 주세요. 이 오븐술사가 방금 제 생각을 완벽하게 읽었어요."); // 1
		goodAwList.add("둘이 먹다 하나가 죽어도 모르겠어요!"); // 2
		goodAwList.add("맛있는 피자는 명훈쌤도 춤추게 한다!"); // 3
		goodAwList.add("소원을 세 개 빌 수 있다면 이것과 똑같은 피자 세 개를 더 달라고 빌거에요."); // 4
		goodAwList.add("이런 고마운 사람을 봤나. 맛있는 피자를 만들어 주셔서 감사합니다."); // 5
		goodAwList.add("이 피자 가게를 방문한 것은 제가 올해 제일 잘 한 일입니다."); // 6
		goodAwList.add("인생은 오래 살고 볼 일이군요. 피자가 너무 맛있어요."); // 7
		goodAwList.add("제 손에 들린 피자만큼 맛있는 피자는 없을 거예요."); // 8
		goodAwList.add("좋았어! 내가 주문한대로군요. GOOD!"); // 9
		// index num 0~9
	}

	ArrayList<String> badAwList = new ArrayList<String>();
	public void badAw() {
		badAwList.add("이게 전부인가요?"); // 0
		badAwList.add("피자에 정성이 부족해요!"); // 1
		badAwList.add("제 피자에 돈이라도 아끼기라도 하시는거에요?"); // 2
		badAwList.add("토핑이 거의 없잖아요!"); // 3
		badAwList.add("이렇게 토핑 없는 피자를 파시면 안되죠..."); // 4
		badAwList.add("이렇게 안 시켰는데요.."); // 5
		badAwList.add("이 토핑은 왜 있죠?!"); // 6
		badAwList.add("피자를 발로 만드셨나요..."); // 7
		badAwList.add("오우... 몬스터... 피자라니!"); // 8
		badAwList.add("이건 아닌거 같아요!"); // 9
		// index num 0~9
	}

}
