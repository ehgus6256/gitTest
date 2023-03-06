package bit.com.web.di5;

public class UserServiceImpl implements UserService{
	private UserDao dao;
	
	
	
	public UserServiceImpl() {
		super();
	}

	public UserServiceImpl(UserDao dao) {
		super();
		this.dao = dao;
	}
	
	
	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findUser(String name) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
