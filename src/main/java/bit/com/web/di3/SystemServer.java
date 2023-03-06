package bit.com.web.di3;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SystemServer {
	//@Autowired
	//@Inject
	@Resource(name = "dm")
	private DbmsSystem dbm;

		
	public SystemServer() {
		super();
	}



	//@Autowired
	//@Inject
	public SystemServer(DbmsSystem dbm) {
		super();
		this.dbm = dbm;
	}



	public DbmsSystem getDbm() {
		return dbm;
	}


	//@Autowired
	//@Inject
	//@Resource(name = "dm")
	public void setDbm(DbmsSystem dbm) {
		this.dbm = dbm;
	}
	//@Autowired
	//@Inject
	//@Resource(name = "dm")
	public void methodInject(DbmsSystem dbm) {
		this.dbm = dbm;
	}



	@Override
	public String toString() {
		return "SystemServer [dbm=" + dbm + "]";
	}
	
	
	

}
