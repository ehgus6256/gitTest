package bit.com.web.di4;

public class DmlServer {
	private StateServer stateServer;
	
	
	
	public DmlServer() {
		super();
	}



	public DmlServer(StateServer stateServer) {
		super();
		this.stateServer = stateServer;
	}



	public StateServer getStateServer() {
		return stateServer;
	}



	public void setStateServer(StateServer stateServer) {
		this.stateServer = stateServer;
	}



	@Override
	public String toString() {
		return "DmlServer [stateServer=" + stateServer + "]";
	}
	
	
	
}
