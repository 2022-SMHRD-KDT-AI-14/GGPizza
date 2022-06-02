package AnswerLogic;

public class AwCheck extends AnswerMatching {

	public void Level1() {
		if (level == 1) { // level은 StartingSub stack에 저장되어 있음

			if (0 <= nowLevel && nowLevel <= 2) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 1) { // 배열의 크기제한
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if로 다중 처리
						if (ans.answer.get(i).equals("소스")) {
							money += 3000;
							awReactionCheck = 1;
						}
					}
				}
			}
		} // 0~2 end

		if (3 <= nowLevel && nowLevel <= 6) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
			if (ans.answer.size() == 1) { // 배열의 크기제한
				for (int i = 0; i < ans.answer.size(); i++) {
					// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
					// 추가로 비교할 토핑 많아지면 if로 다중 처리
					if (ans.answer.get(i).equals("치즈")) {
						money += 4000;
						awReactionCheck = 1;
					}
				}
			}
		} // 3~6 end

		if (7 <= nowLevel && nowLevel <= 14) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
			if (ans.answer.size() == 2) { // 배열의 크기제한
				int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
				for (int i = 0; i < ans.answer.size(); i++) {
					// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
					// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
					switch (ans.answer.get(i)) {
					case "소스":
						cnt++;
						break;
					case "치즈":
						cnt++;
						break;
					}
					if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
						money += 7000; // 참이면 매출에 더하기
						awReactionCheck = 1;
					}
				}
			}
		} // 7~14 end

	}

	

	public void Level2() {
		if (level == 2) { // level은 StartingSub stack에 저장되어 있음

			if (15 <= nowLevel && nowLevel <= 16) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 1) { // 배열의 크기제한
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if로 다중 처리
						if (ans.answer.get(i).equals("페퍼로니")) {
							money += 6000;
							awReactionCheck = 1;
						}
					}
				}
			} // 15~16 end

			if (17 <= nowLevel && nowLevel <= 20) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 2) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case "소스":
							cnt++;
							break;
						case "페퍼로니":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 9000; // 참이면 매출에 더하기
							awReactionCheck = 1;
						}
					}
				}
			} // 17~20 end

			if (21 <= nowLevel && nowLevel <= 24) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 3) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case "소스":
							cnt++;
							break;
						case "치즈":
							cnt++;
							break;
						case "페퍼로니":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 13000; // 참이면 매출에 더하기
							awReactionCheck = 1;
						}
					}
				}
			} // 17~20 end

		}
	}

	public void Level3() {
		if (level == 3) { // level은 StartingSub stack에 저장되어 있음

			if (25 <= nowLevel && nowLevel <= 26) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 1) { // 배열의 크기제한
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if로 다중 처리
						if (ans.answer.get(i).equals("피망")) {
							money += 6000;
							awReactionCheck = 1;
						}
					}
				}
			} // 25~26 end

			if (nowLevel == 27) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 2) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case "소스":
							cnt++;
							break;
						case "피망":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 9000; // 참이면 매출에 더하기
							awReactionCheck = 1;
						}
					}
				}
			} // 27 end

			if (28 <= nowLevel && nowLevel <= 30) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 3) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case "소스":
							cnt++;
							break;
						case "치즈":
							cnt++;
							break;
						case "피망":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 13000; // 참이면 매출에 더하기
							awReactionCheck = 1;
						}
					}
				}
			} // 28~30 end

			if (nowLevel == 31) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 3) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case "소스":
							cnt++;
							break;
						case "페퍼로니":
							cnt++;
							break;
						case "피망":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 15000; // 참이면 매출에 더하기
							awReactionCheck = 1;
						}
					}
				}
			} // 31 end

			if (32 <= nowLevel && nowLevel <= 34) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 4) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case "소스":
							cnt++;
							break;
						case "치즈":
							cnt++;
							break;
						case "페퍼로니":
							cnt++;
							break;
						case "피망":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 19000; // 참이면 매출에 더하기
							awReactionCheck = 1;
						}
					}
				}
			} // 32~34 end

		}
	}

	public void Level4() {
		if (level == 4) { // level은 StartingSub stack에 저장되어 있음

			if (nowLevel == 35) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 1) { // 배열의 크기제한
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if로 다중 처리
						if (ans.answer.get(i).equals("소시지")) {
							money += 6500;
							awReactionCheck = 1;
						
					}
				}
			} // 35 end

			if (nowLevel == 36) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 2) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case "소스":
							cnt++;
							break;
						case "소시지":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 9500; // 참이면 매출에 더하기
							awReactionCheck = 1;
						}
					}
				}
			} // 36 end

			if (37 <= nowLevel && nowLevel <= 38) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 3) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case "소스":
							cnt++;
							break;
						case "치즈":
							cnt++;
							break;
						case "소시지":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 13500; // 참이면 매출에 더하기
							awReactionCheck = 1;
						}
					}
				}
			} // 37~38 end

			if (nowLevel == 39) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 2) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case "페퍼로니":
							cnt++;
							break;
						case "소시지":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 12500; // 참이면 매출에 더하기
							awReactionCheck = 1;
						}
					}
				}
			} // 39 end

			if (nowLevel == 40) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 3) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case "소스":
							cnt++;
							break;
						case "페퍼로니":
							cnt++;
							break;
						case "소시지":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 15500; // 참이면 매출에 더하기
							awReactionCheck = 1;
						}
					}
				}
			} // 40 end

			if (nowLevel == 41) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 3) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case "소스":
							cnt++;
							break;
						case "피망":
							cnt++;
							break;
						case "소시지":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 15500; // 참이면 매출에 더하기
							awReactionCheck = 1;
						}
					}
				}
			} // 41 end

			if (42 <= nowLevel && nowLevel <= 43) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 4) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case "소스":
							cnt++;
							break;
						case "치즈":
							cnt++;
							break;
						case "피망":
							cnt++;
							break;
						case "소시지":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 19500; // 참이면 매출에 더하기
							awReactionCheck = 1;
						}
					}
				}
			} // 42~43 end

			if (44 <= nowLevel && nowLevel <= 46) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 4) { // 배열의 크기제한
					int cnt = 0; // 정답재료의 수 만큼 카운트 초기화
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if-else나 &&로 다중 처리
						switch (ans.answer.get(i)) {
						case "소스":
							cnt++;
							break;
						case "치즈":
							cnt++;
							break;
						case "페퍼로니":
							cnt++;
							break;
						case "소시지":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 19500; // 참이면 매출에 더하기
							awReactionCheck = 1;
						}
					}
				}
			} // 44~46 end

			}
		}
	}

	public void Level5() {
		if (level == 5) { // level은 StartingSub stack에 저장되어 있음

			if (nowLevel == 47) { // 현재 array Random 할당되는 값에 따라서 nowLevel에 값 할당
				if (ans.answer.size() == 1) { // 배열의 크기제한
					for (int i = 0; i < ans.answer.size(); i++) {
						// 토핑추가에 답한 만큼 비교해서 아래 답과 일치하면 money 추가
						// 추가로 비교할 토핑 많아지면 if로 다중 처리
						if (ans.answer.get(i).equals("버섯")) {
							money += 7500;
							awReactionCheck = 1;
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
						case "소스":
							cnt++;
							break;
						case "버섯":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 10500; // 참이면 매출에 더하기
							awReactionCheck = 1;
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
						case "소스":
							cnt++;
							break;
						case "치즈":
							cnt++;
							break;
						case "버섯":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 14500; // 참이면 매출에 더하기
							awReactionCheck = 1;
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
						case "소스":
							cnt++;
							break;
						case "페퍼로니":
							cnt++;
							break;
						case "버섯":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 16500; // 참이면 매출에 더하기
							awReactionCheck = 1;
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
						case "소스":
							cnt++;
							break;
						case "피망":
							cnt++;
							break;
						case "버섯":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 16500; // 참이면 매출에 더하기
							awReactionCheck = 1;
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
						case "소스":
							cnt++;
							break;
						case "소시지":
							cnt++;
							break;
						case "버섯":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 17000; // 참이면 매출에 더하기
							awReactionCheck = 1;
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
						case "소스":
							cnt++;
							break;
						case "치즈":
							cnt++;
							break;
						case "페퍼로니":
							cnt++;
							break;
						case "버섯":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 20500; // 참이면 매출에 더하기
							awReactionCheck = 1;
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
						case "소스":
							cnt++;
							break;
						case "치즈":
							cnt++;
							break;
						case "피망":
							cnt++;
							break;
						case "버섯":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 20500; // 참이면 매출에 더하기
							awReactionCheck = 1;
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
						case "소스":
							cnt++;
							break;
						case "치즈":
							cnt++;
							break;
						case "소시지":
							cnt++;
							break;
						case "버섯":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 21000; // 참이면 매출에 더하기
							awReactionCheck = 1;
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
						case "소스":
							cnt++;
							break;
						case "치즈":
							cnt++;
							break;
						case "페퍼로니":
							cnt++;
							break;
						case "피망":
							cnt++;
							break;
						case "소시지":
							cnt++;
							break;
						case "버섯":
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // 정답재료의 수 만큼 카운트
							money += 33000; // 참이면 매출에 더하기
							awReactionCheck = 1;
						}
					}
				}
			} // 61 end

		} // level == 5 end
	}

	public void levels() {
		Level1();
		Level2();
		Level3();
		Level4();
		Level5();
	}

}
