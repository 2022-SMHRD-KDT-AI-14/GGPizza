package AnswerLogic;

import java.util.ArrayList;
import java.util.Scanner;

import QuestionLogic.RandomQuestion;
import StartSupport.StartingSub;
import Story.Day1_Question;

public class Answer extends StartingSub {

	public static ArrayList<String> answer = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	RandomQuestion rdQuest = new RandomQuestion();
	Day1_Question day1quest = new Day1_Question();

	char sub = '"';
	int answerSelect;
	int a; // while 멈추는 용도로 값 할당하는 int

	public void answerScanner() {
		System.out.println("★☆★ 주문 ★☆★");
		System.out.println("손님 : " + sub + Day1_Question.orderList.get(nowLevel) + sub);
		System.out.println();
		System.out.println("<<< 피자를 만들어보자! >>>");
		System.out.println("[★Tip★] 추가할 토핑이 없다면 " + sub + "완성" + sub + "이라고 입력하세요.");

		System.out.println();
		System.out.print("반죽을 펴고 다음 토핑은? : ");
		answer.add(sc.next()); // 토핑을 추가할 때마다 answer array에 할당

		while (a != 1) {

			System.out.print("추가할 토핑은? : ");
			answer.add(sc.next());
			// 반복적으로 추가 할당하고 "완성"이 나오면 a에 +1, while 종료

			for (int i = 0; i < answer.size(); i++) {

				if (answer.get(i).equals("완성")) {
					answer.remove("완성"); // 완료라는 문자의 배열을 지워줌
					a += 1;

				}
			}
		}

		a = 0;

	}

}
