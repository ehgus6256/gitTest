package bit.com.web.di4;

public class StateServer {
	private String serverUrl;
	private int port;
	private String dbName;
	private String account;
	private String password;
	
	
	
	public StateServer() {
		super();
	}
	public StateServer(String serverUrl, int port, String dbName, String account, String password) {
		super();
		this.serverUrl = serverUrl;
		this.port = port;
		this.dbName = dbName;
		this.account = account;
		this.password = password;
	}
	public String getServerUrl() {
		return serverUrl;
	}
	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "StateServer [serverUrl=" + serverUrl + ", port=" + port + ", dbName=" + dbName + ", account=" + account
				+ ", password=" + password + "]";
	}
	
	
	

}
