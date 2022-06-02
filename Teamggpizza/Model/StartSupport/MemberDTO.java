package StartSupport;

public class MemberDTO extends StartingSub{

	private String id, pw, name;
	private int money1;
	String name1;


	public MemberDTO(String id, String pw){
		super();
		this.id = id;
		this.pw = pw;
		getName();
		name1 = StartingSub.name;
		
	}

	public MemberDTO(String id, String pw, String name, int money1) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.money1 = money1;
		StartingSub.name = this.name;
		name1 = StartingSub.name;
	}

	public String getName() {
		name = name1;
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
	public int getMoney() {
		return money1;
	}


	
	

}
