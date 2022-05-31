package AnswerLogic;

public class LevelAll extends AnswerMatching {
	
	String tpSS = "소스";
	String tpCS = "치즈";
	String tpPPLN = "페퍼로니";
	String tpPM = "피망";
	String tpSSG = "소시지";
	String tpBS = "버섯";

	public void Level5() {
		
		
		if(level==5){ // level은 StartingSub stack에 저장되어 있음
			
			if (nowLevel == 47) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 1) { // 배열의 크기제한
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if로 다중 처리
						if (ans.answer.get(i).equals(tpBS)) {
							money += 7500;
						}
					}
				}
			} // 47 end
			
			if (nowLevel == 48) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 2) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case tpSS:
							cnt++;
							break;
						case tpBS:
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 10500; // 참이면 매출에 더하기
						}
					}
				}
			} // 48 end
			
			if (49 <= nowLevel && nowLevel <= 50) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 3) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case tpSS:
							cnt++;
							break;
						case tpCS:
							cnt++;
							break;
						case tpBS:
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 14500; // 참이면 매출에 더하기
						}
					}
				}
			} // 49~50 end
			
			if (nowLevel == 51) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 3) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case tpSS:
							cnt++;
							break;
						case tpPPLN:
							cnt++;
							break;
						case tpBS:
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 16500; // 참이면 매출에 더하기
						}
					}
				}
			} // 51 end
			
			if (nowLevel == 52) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 3) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case tpSS:
							cnt++;
							break;
						case tpPM:
							cnt++;
							break;
						case tpBS:
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 16500; // 참이면 매출에 더하기
						}
					}
				}
			} // 52 end
			
			if (nowLevel == 53) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 3) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case tpSS:
							cnt++;
							break;
						case tpSSG:
							cnt++;
							break;
						case tpBS:
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 17000; // 참이면 매출에 더하기
						}
					}
				}
			} // 53 end
			
			if (54 <= nowLevel && nowLevel <= 56) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 4) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case tpSS:
							cnt++;
							break;
						case tpCS:
							cnt++;
							break;
						case tpPPLN:
							cnt++;
							break;
						case tpBS:
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 20500; // 참이면 매출에 더하기
						}
					}
				}
			} // 54~56 end
			
			if (57 <= nowLevel && nowLevel <= 58) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 4) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case tpSS:
							cnt++;
							break;
						case tpCS:
							cnt++;
							break;
						case tpPM:
							cnt++;
							break;
						case tpBS:
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 20500; // 참이면 매출에 더하기
						}
					}
				}
			} // 57~58 end
			
			if (59 <= nowLevel && nowLevel <= 60) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 4) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case tpSS:
							cnt++;
							break;
						case tpCS:
							cnt++;
							break;
						case tpSSG:
							cnt++;
							break;
						case tpBS:
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 21000; // 참이면 매출에 더하기
						}
					}
				}
			} // 59~60 end
			
			if (nowLevel == 61) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 6) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case tpSS:
							cnt++;
							break;
						case tpCS:
							cnt++;
							break;
						case tpPPLN:
							cnt++;
							break;
						case tpPM:
							cnt++;
							break;
						case tpSSG:
							cnt++;
							break;
						case tpBS:
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 33000; // 참이면 매출에 더하기
						}
					}
				}
			} // 61 end
			
		} // level == 5 end
	}

	
	
}
