package bit.com.web.di3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@ComponentScan("bit.com.web.di3")
@Component(value = "dm")
public class DbmsSystem {
	@Value("${bit.com.serVerName}")
	private String serVerName;
	@Value("${bit.com.serVerUrl}")
	private String serVerUrl;
	@Value("${bit.com.connectionCount}")
	private int connectionCount;
	@Value("${bit.com.waitTime}")
	private int waitTime;
	
	@PostConstruct
	public void initServer() {
		System.out.println("initServer");
	}
	@PreDestroy
	public void destoryServer() {
		System.out.println("destoryServer");
	}
	
	public DbmsSystem(String serVerName, String serVerUrl, int connectionCount, int waitTime) {
		super();
		this.serVerName = serVerName;
		this.serVerUrl = serVerUrl;
		this.connectionCount = connectionCount;
		this.waitTime = waitTime;
	}
	
	public DbmsSystem() {
		super();
	}

	public String getSerVerName() {
		return serVerName;
	}
	public void setSerVerName(String serVerName) {
		this.serVerName = serVerName;
	}
	public String getSerVerUrl() {
		return serVerUrl;
	}
	public void setSerVerUrl(String serVerUrl) {
		this.serVerUrl = serVerUrl;
	}
	public int getConnectionCount() {
		return connectionCount;
	}
	public void setConnectionCount(int connectionCount) {
		this.connectionCount = connectionCount;
	}
	public int getWaitTime() {
		return waitTime;
	}
	public void setWaitTime(int waitTime) {
		this.waitTime = waitTime;
	}

	@Override
	public String toString() {
		return "DbmsSystem [serVerName=" + serVerName + ", serVerUrl=" + serVerUrl + ", connectionCount="
				+ connectionCount + ", waitTime=" + waitTime + "]";
	}
	
	
	
}
