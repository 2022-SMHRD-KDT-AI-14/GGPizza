package StartSupport;

public class MemberDTO extends StartingSub{

	private String id, pw, name;
	private int money;

	public MemberDTO(String id, String pw){
		super();
		this.id = id;
		this.pw = pw;
	}

	public MemberDTO(String id, String pw, String name, int money) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.money = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getMoney(int money) {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	

}
