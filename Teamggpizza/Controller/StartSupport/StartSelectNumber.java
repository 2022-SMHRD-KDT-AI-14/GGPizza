package StartSupport;


import java.util.Scanner;

import Story.Manual;
import UI.Numbers;


public class StartSelectNumber extends StartingSub implements Numbers {
	
	MemberDAO dao = new MemberDAO();
	MemberDTO dto;
	
	Scanner sc = new Scanner(System.in);
	
	protected String id;
	protected String pw;
	
	Manual manual = new Manual();
	
	@Override
	public void numberOf1() {

		if (number == 1) {

			System.out.println("[1] 로그인 [2] 회원가입");
			System.out.println();
			System.out.print("Select number test = ");
			number = sc.nextInt();
			
			while (true) {
				 if (number == 1) {

					System.out.println("로그인");
					System.out.print("ID 입력하세요 : ");
					String id = sc.next();
					System.out.print("PW 입력하세요 : ");
					String pw = sc.next();
					dto = new MemberDTO(id, pw);
					dao.login(dto);
					accountSet();
					break;
				}
			}
				if(number ==2) {
					
					
					
				}

			}
			
			
			// firstview()에서 할당받은 number가 한 번 더 초기화되는 part
			/* number 할당 후 accountSet()로 전개 
			 * 할당 받은 number로 accountSet()에서 각기 다른 로그인 메뉴로 진행됨
			 * 해당 method에는 각기 다른 slot이 있고 그에 대한 method 구현 */

		}


	@Override
	public void numberOf2() {

		if (number == 2) {

			System.out.println("[ranking viewer slot]");
			/* 같은 논리로 firstview에서 할당된 후 number가 2일시 랭킹보드 진입 전개
			 * 이 part에서는 랭킹이 보여진 후 mainGame 전개로 돌아오는 method 구현이 되어야 함
			 * 현재 필요한 method는 아래 목록과 같음
			 * ranking reader board method add
			 * Main Game load method add */
			
		}

	}

	@Override
	public void numberOf3() {

		if(number == 3) {
			
			System.out.println("[game closed]");
			// number가 3일시 게임 종료, Assembly에 있는 method들이 작동하지 않는 구조로 진행
			
		}

	}

	public void accountSet() {

		switch (number) {

		case 1:
			System.out.println();
			// id, pw method part
			// 구현해야 하는 method 목록은 아래와 같음
			// id, pw method add add
			// Main game load method add

			System.out.print("아이디 입력 : ");
			id = sc.next();
			System.out.print("비밀번호 입력 : ");
			pw = sc.next();
			
			if(id.equals("master") && pw.equals("master")) {
				
				System.out.println();
				manual.tutorial();
				manual.manual();
				// master id, test 계정으로 아이디, 비밀번호를 master 입력시 스토리 진행
				
			}
			
			break;

		case 2:
			System.out.println();
			System.out.println("[account add slot]");
			// 회원가입 part이며, case 1과 내용 동일
			// account method add
			// Main game load method
			
			break;

		}
		
		number = 0;

	}
}



