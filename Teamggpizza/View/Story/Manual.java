package Story;

import StartSupport.StartingSub;

public class Manual extends StartingSub {

	char talkSub = '"';

	public void tutorial() {

		name = "안지은";
		// Scanner로 name을 받을지 DB로 받을지 결정한 뒤 할당ㄴ

		System.out.println("==========================================================================================================");
		System.out.println("Story");
		System.out.println("==========================================================================================================");

		System.out.println("[제임스 고슬링] (한숨 푹)");
		System.out.println("[" + name + "] " + talkSub + "?.? 아저씨, 무슨 일 있으세요?" + talkSub);
		System.out.println("[제임스 고슬링] " + talkSub + "코로나로 인해 내 피자가게가 망하겠어...ㅠㅠ" + talkSub);
		System.out.println("[" + name + "] " + talkSub + "음.. 제가 장사가 잘되도록 도와드릴게요!" + talkSub);
		System.out.println("[제임스 고슬링] " + talkSub + "오! 그렇담, " + name + ", 이 피자가게의 주인은 너로 정했다!" + talkSub);
		System.out.println("[" + name + "] " + talkSub + "오 진짜요? 좋아요!! bb" + talkSub);
		System.out.println("==========================================================================================================");
		System.out.println();
		
	}
	
//      대사 입력이 필요할 땐 아래 복사 후 "대사" 부분만 입력
//	    System.out.println("[제임스 고슬링] " + talkSub + "대사" + talkSub);
//		System.out.println("[" + name + "] " + talkSub + "대사" + talkSub);

	public void manual() {
		
		System.out.println("==========================================================================================================");
		System.out.println("게임방법");
		System.out.println("==========================================================================================================");
		System.out.println("손님의 주문을 받아 필요한 토핑과 재료를 타이핑해 피자를 만드세요.");
		System.out.println("레벨에 따라 토핑을 추가하면 더 다양한 피자를 만들 수 있어요.");
		System.out.println("기회는 3번 주어지고, 모두 소진시 게임이 종료됩니다.");
		System.out.println("==========================================================================================================");

	}
	
}
