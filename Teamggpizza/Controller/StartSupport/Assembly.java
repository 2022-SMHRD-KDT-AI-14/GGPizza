package StartSupport;

import UI.Tutorial;

public class Assembly implements Tutorial {

	TutorialScanner tutosc = new TutorialScanner();
	StartSelectNumber startnum = new StartSelectNumber();
	
	@Override
	public void tutorial() {
	
		tutosc.firstView();
		
		startnum.numberOf1();
		startnum.numberOf2();
		startnum.numberOf3();
		
	}
	
	@Override
	public void manual() {



	}


}
