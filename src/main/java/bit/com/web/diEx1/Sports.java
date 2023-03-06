package bit.com.web.diEx1;

public class Sports {
	private String name;
	private int runtime;
	private int member;
	private String league;
	
	public Sports() {
		super();
	}

	public Sports(String name, int runtime, int member, String league) {
		super();
		this.name = name;
		this.runtime = runtime;
		this.member = member;
		this.league = league;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public int getMember() {
		return member;
	}

	public void setMember(int member) {
		this.member = member;
	}

	public String getLeague() {
		return league;
	}

	public void setLeague(String league) {
		this.league = league;
	}

	@Override
	public String toString() {
		return "Sports [name=" + name + ", runtime=" + runtime + ", member=" + member + ", league=" + league + "]";
	}
	
	
	
	
	
}
