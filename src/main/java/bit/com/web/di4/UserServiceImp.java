package bit.com.web.di4;

public class UserServiceImp {
	private UserDao dao;
	
	public void findUser() {
		dao.select();
		System.out.println("findUser");
	}
	public void register() {
		dao.select();
		System.out.println("register");
	}
	

}
