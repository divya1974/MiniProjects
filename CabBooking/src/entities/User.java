package entities;

public class User {

	static Integer CountId=0;
	Integer UserId;
	String name;
	String source;
	String destination;
	String DriverId;
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public User(String name, String source, String destination) {
		super();
		UserId = ++CountId;
		this.name = name;
		this.source = source;
		this.destination = destination;
	}
	public String getDriverId() {
		return DriverId;
	}
	public void setDriverId(String driverId) {
		DriverId = driverId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
}
