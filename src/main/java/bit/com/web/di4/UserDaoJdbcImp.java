package bit.com.web.di4;

public class UserDaoJdbcImp implements UserDao{
	public void insert() {	
		System.out.println("UerDaoJdbcImpinsert");
	}
	public void select() {	
		System.out.println("UerDaoJdbcImpselect");
	}

}
