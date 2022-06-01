package Story;

import java.util.ArrayList;

public class Day1_Question {

	public static ArrayList<String> orderList = new ArrayList<String>();
	
	public void day1Quest() {
		// level 1 --------------------------------------------------
		orderList.add("소스 맛만 느끼고 싶어요."); // 0
		orderList.add("치즈피자인데, 치즈 빼주세요."); // 1
		orderList.add("치즈 뺀 치즈피자요."); // 2
		// index num 0~2 answer : 소스
		
		orderList.add("치즈 피자 마이너스 소스"); // 3
		orderList.add("소스 빠진 치즈피자요."); // 4
		orderList.add("치즈피자 주세요. 소스는 싫어요."); // 5
		orderList.add("치즈는 좋지만, 소스는 싫어요."); // 6
		// index num 3~6 answer : 치즈
		
		orderList.add("그냥 피자 주세요."); // 7
		orderList.add("피즈 치자요"); // 8
		orderList.add("치즈 하나요. 평범하고 간단하게요."); // 9
		orderList.add("페퍼로니 싫어요."); // 10
		orderList.add("페퍼로니를 뺀 페퍼로니 피자 주세요."); // 11
		orderList.add("소스. 치즈. 출발"); // 12
		orderList.add("치즈 피자 하나 주세요."); // 13
		orderList.add("치즈 본연의 맛이 느껴지는 피자 주세요. 소스두요."); // 14
		// index num 7~14 answer : 소스, 치즈

		// level 2 ------------------------------------------------
		orderList.add("가능하면 페퍼로니만!"); // 15
		orderList.add("더도 말고 덜도 말고 딱 페퍼로니만 같아라!"); // 16
		// index num 15~16 answer : 페퍼로니
		
		orderList.add("펲ㅇ 치ㄴ"); // 17
		orderList.add("유제품을 넣지 않은 페퍼로니"); // 18
		orderList.add("빨간색! 빨간색이 좋아요! 치즈는 싫어요. 치즈는 빨간색이 아니거든요!"); // 19
		orderList.add("치즈랑 페퍼로니가 섞이면 맛이 이상해요"); // 20
		// index num 17~20 answer : 소스, 페퍼로니
		
		orderList.add("요자피 니로페퍼"); // 21
		orderList.add("ㅍㅍㄹㄴ ㅍㅈ ㅎㄴㅇ"); // 22
		orderList.add("살라미 피자하나요. 때로는 클래식한것들이 최고죠~"); // 23
		orderList.add("집을 떠나 긴 여행중에 있습니다. 살라미 피자 하나 부탁드려도 될까요?"); // 24
		// index num 21~24 answer : 소스, 치즈, 페퍼로니

		// level 3 ------------------------------------------------
		orderList.add("가능하면 피망만!"); // 25
		orderList.add("더도 말고 덜도 말고 딱 피망만 같아라!"); // 26
		// index num 25~26 answer : 피망
		
		orderList.add("치즈랑 피망이 섞이면 맛이 이상해요."); // 27
		// index num 27 answer : 소스, 피망
		
		orderList.add("ㅍㅁ ㅍㅈ ㅎㄴㅇ"); // 28
		orderList.add("피망과 소시지요! 아 소시지는 빼주세요."); // 29
		orderList.add("녹색 토핑을 올린 피자 부탁드립니다."); // 30
		// index num 28~30 answer : 소스, 치즈, 피망
		
		orderList.add("페퍼로니랑 피망이 파티하러가는데 치즈는 초대가 안되었어요!"); // 31
		// index num 31 answer : 소스, 페퍼로니, 피망
		
		orderList.add("피망이랑 페퍼로니랑 사귀는 거 맞죠?"); // 32
		orderList.add("저는 페퍼로니랑 피망이 같이 구워졌을 때의 향을 좋아해요"); // 33
		orderList.add("피피읍"); // 34
		// index num 32~34 answer : 소스, 치즈, 페퍼로니, 피망
		
		// level 4 -----------------------------------------------
		orderList.add("가능하면 소시지만!"); // 35
		// index num 35 answer : 소시지
		
		orderList.add("치즈랑 소시지가 섞이면 맛이 이상해요"); // 36
		// index num 36 answer : 소스, 소시지
		
		orderList.add("안녕하세요 소시요"); // 37
		orderList.add("소시지요"); // 38
		// index num 37~38 answer : 소스, 치즈, 소시지
		
		orderList.add("돼지고기가 들어간 피자 주문하고싶어요. 소스나 치즈는 넣지 말아주세요."); // 39
		// index num 39 answer : 페퍼로니, 소시지
		
		orderList.add("페퍼로니랑 소시지가 파티하러가는데 치즈는 초대가 안되었어요!"); // 40
		// index num 40 answer : 소스, 페퍼로니, 소시지
		
		orderList.add("피망이랑 소시지가 파티하러가는데 치즈는 초대가 안되었네요~"); // 41
		// index num 41 answer : 소스, 피망, 소시지
		
		orderList.add("소시지랑 피망이랑 사귀는 거 맞죠?"); // 42
		orderList.add("저는 소시지랑 피망이 같이 구워졌을 때의 향을 좋아해요"); // 43
		// index num 42~43 answer : 소스, 치즈, 피망, 소시지
		
		orderList.add("페퍼로니와 소시지가 들어간 피자주세요"); // 44
		orderList.add("파워가 넘치는 고기피자!"); // 45
		orderList.add("저는 고기다이어트 중입니다."); // 46
		// index num 44~46 answer : 소스, 치즈, 페퍼로니, 소시지
		
		// level 5 -----------------------------------------------
		orderList.add("더도 말고 덜도 말고 딱 버섯만 같아라!"); // 47
		// index num 47 answer : 버섯
		
		orderList.add("치즈랑 버섯이 섞이면 맛이 이상해요"); // 48
		// index num 48 answer : 소스, 버섯
		
		orderList.add("트러플, 어…섯"); // 49
		orderList.add("땡큐 베리 머쉬…"); // 50
		// index num 48 answer : 소스, 치즈, 버섯
		
		orderList.add("페퍼로니랑 버섯이 파티하러가는데 치즈는 초대가 안되었어요."); // 51
		// index num 48 answer : 소스, 페퍼로니, 버섯
		
		orderList.add("비건 피자요."); // 52
		// index num 48 answer : 소스, 피망, 버섯
		
		orderList.add("소시지랑 버섯이 파티하러가는데 치즈는 초대가 안되었네."); // 53
		// index num 48 answer : 소스, 소시지, 버섯
		
		orderList.add("버세로니 피자주세요."); // 54
		orderList.add("버섯이랑 페퍼로니랑 사귀는 거 맞죠?"); // 55
		orderList.add("저는 버섯이랑 페퍼로니가 같이 구워졌을 때의 향을 좋아해요."); // 56
		// index num 48 answer : 소스, 치즈, 페퍼로니, 버섯
		
		orderList.add("고기빼고 다주세요."); // 57
		orderList.add("베지테리언 피자주세요."); // 58
		// index num 48 answer : 소스, 치즈, 피망, 버섯
		
		orderList.add("버섯이랑 소시지랑 사귀는 거 맞죠?."); // 59
		orderList.add("저는 버섯이랑 소시지가 같이 구워졌을 때의 향을 좋아해요."); // 60
		// index num 48 answer : 소스, 치즈, 소시지, 버섯
		
		orderList.add("모두모두요."); // 61
		// index num 61 answer : 소스, 치즈, 페퍼로니, 피망, 소시지, 버섯
	}
	
}
