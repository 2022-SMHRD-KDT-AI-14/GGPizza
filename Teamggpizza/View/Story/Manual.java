package Story;

import java.util.Scanner;

import StartSupport.StartingSub;

public class Manual extends StartingSub {

	char talkSub;
	String enter;

	public void tutorial() {

		Scanner sc = new Scanner(System.in);

		talkSub = '"';

		name = "안지은";
		// Scanner로 name을 받을지 DB로 받을지 결정한 뒤 할당
		
		System.out.println("게임을 시작해볼까요?");
		System.out.print(talkSub+"네"+talkSub+"라고 입력 >> ");
		enter = sc.next();

		System.out.println();
		// System.out.println(
		// 		"==========================================================================================================");
		System.out.println("[★Story★]");
		System.out.println(
				"==========================================================================================================");

		System.out.println("제임스 고슬링씨 : (한숨 푹)");
		System.out.println(name + " : " + talkSub + "?.? 아저씨, 무슨 일 있으세요?" + talkSub);
		System.out.println("제임스 고슬링씨 : " + talkSub + "코로나로 인해 내 피자가게가 망하겠어...ㅠㅠ" + talkSub);
		System.out.println(name + " : " + talkSub + "음.. 제가 장사가 잘 되도록 도와드릴게요!" + talkSub);
		System.out.println("제임스 고슬링씨 : " + talkSub + "오! 그렇담, " + name + "! 이 피자가게의 주인은 너로 정했다!" + talkSub);
		System.out.println(name + " : " + talkSub + "오 진짜요? 좋아요!! bb" + talkSub);
		System.out.println(
				"==========================================================================================================");
		System.out.println();

	}

//      대사 입력이 필요할 땐 아래 복사 후 "대사" 부분만 입력
//	    System.out.println("[제임스 고슬링] " + talkSub + "대사" + talkSub);
//		System.out.println("[" + name + "] " + talkSub + "대사" + talkSub);

	public void manual() {

		Scanner sc = new Scanner(System.in);

		//System.out.println(
		//		"==========================================================================================================");
		System.out.println("[★게임방법★]");
		System.out.println(
				"==========================================================================================================");
		System.out.println("손님의 주문을 받아 필요한 토핑과 재료를 타이핑하여 피자를 만드세요.");
		System.out.println("Day에 따라 토핑이 추가되어 더 다양한 피자를 만들 수 있어요.");
		System.out.println("게임은 Day1부터 Day5까지 진행되며, 기회는 3번! 총 3번 틀리면 게임이 종료됩니다.");
		System.out.println(
				"==========================================================================================================");

		System.out.println();
		//System.out.println("계속 진행하려면 " + talkSub + "아무 키나" + talkSub + " 입력해주세요.");
		System.out.println("주문을 받겠습니까?");
		System.out.print(talkSub+"네"+talkSub+"라고 입력 >> ");
		enter = sc.next();
		System.out.println();

	}

}
