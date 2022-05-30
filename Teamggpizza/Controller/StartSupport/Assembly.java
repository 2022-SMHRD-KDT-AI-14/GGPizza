package StartSupport;

import Story.Manual;
import UI.Tutorial;

public class Assembly implements Tutorial {

	// 각 챕터별 세부적으로 method를 조합하는 class 입니다.
	
	TutorialScanner tutosc = new TutorialScanner();
	StartSelectNumber startnum = new StartSelectNumber();
	Manual manual = new Manual();
	
	@Override
	public void tutorial() { 
		
		// view에서 처음으로 보여지는 tutorial part
	
		tutosc.firstView(); 
		// 첫 시작 메뉴와 스캐너로 number에 수를 할당
		
		startnum.numberOf1();
		startnum.numberOf2();
		startnum.numberOf3();
		/* 스캔 받은 number에 따라 다르게 전개되는 start 구간
		 모두 startSelectNumber.class 안에 있는 method
		 이름에서 보여지듯 start 부분만 할당되고 해당 number에 method를 부여
		 다음 chapter로 연결할 예정 */
		
	}
	
	@Override
	public void manual() {
		
		manual.tutorial();
		
		/* tutorial 전개가 끝난 뒤 manual이 보여지는 view part
		   기능상 start 부분이지만 전개에서 직관성을 위해
		   tutorial과 manual을 나누었고
		   starting에선 logON에 모두 할당되며 본 게임이 시작되기 전 logON에서
		   모두 객체화가 진행됨 */

	}


}
