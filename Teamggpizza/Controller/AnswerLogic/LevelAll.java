package AnswerLogic;

public class LevelAll extends AnswerMatching {
	
	String tpSS = "�ҽ�";
	String tpCS = "ġ��";
	String tpPPLN = "���۷δ�";
	String tpPM = "�Ǹ�";
	String tpSSG = "�ҽ���";
	String tpBS = "����";

	public void Level5() {
		
		
		if(level==5){ // level�� StartingSub stack�� ����Ǿ� ����
			
			if (nowLevel == 47) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 1) { // �迭�� ũ������
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if�� ���� ó��
						if (ans.answer.get(i).equals(tpBS)) {
							money += 7500;
						}
					}
				}
			} // 47 end
			
			if (nowLevel == 48) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 2) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
						switch (ans.answer.get(i)) {
						case tpSS:
							cnt++;
							break;
						case tpBS:
							cnt++;
							break;
						}
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 10500; // ���̸� ���⿡ ���ϱ�
						}
					}
				}
			} // 48 end
			
			if (49 <= nowLevel && nowLevel <= 50) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 3) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
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
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 14500; // ���̸� ���⿡ ���ϱ�
						}
					}
				}
			} // 49~50 end
			
			if (nowLevel == 51) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 3) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
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
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 16500; // ���̸� ���⿡ ���ϱ�
						}
					}
				}
			} // 51 end
			
			if (nowLevel == 52) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 3) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
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
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 16500; // ���̸� ���⿡ ���ϱ�
						}
					}
				}
			} // 52 end
			
			if (nowLevel == 53) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 3) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
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
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 17000; // ���̸� ���⿡ ���ϱ�
						}
					}
				}
			} // 53 end
			
			if (54 <= nowLevel && nowLevel <= 56) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 4) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
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
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 20500; // ���̸� ���⿡ ���ϱ�
						}
					}
				}
			} // 54~56 end
			
			if (57 <= nowLevel && nowLevel <= 58) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 4) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
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
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 20500; // ���̸� ���⿡ ���ϱ�
						}
					}
				}
			} // 57~58 end
			
			if (59 <= nowLevel && nowLevel <= 60) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 4) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
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
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 21000; // ���̸� ���⿡ ���ϱ�
						}
					}
				}
			} // 59~60 end
			
			if (nowLevel == 61) { // ���� array Random �Ҵ�Ǵ� ���� ���� nowLevel�� �� �Ҵ�
				if (ans.answer.size() == 6) { // �迭�� ũ������
					int cnt = 0; // ��������� �� ��ŭ ī��Ʈ �ʱ�ȭ
					for (int i = 0; i < ans.answer.size(); i++) {
						// �����߰��� ���� ��ŭ ���ؼ� �Ʒ� ��� ��ġ�ϸ� money �߰�
						// �߰��� ���� ���� �������� if-else�� &&�� ���� ó��
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
						if (cnt == ans.answer.size()) { // ��������� �� ��ŭ ī��Ʈ
							money += 33000; // ���̸� ���⿡ ���ϱ�
						}
					}
				}
			} // 61 end
			
		} // level == 5 end
	}

	
	
}
