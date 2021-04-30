package entities;

public class Driver {
		
	static Integer CountId=0;
	Integer DriverId;
	String name;
	String source;
	String destination;
	
	public Driver(String name, String source, String destination) {
		super();
		this.DriverId =++CountId;
		this.name = name;
		this.source = source;
		this.destination = destination;
	}

	public Integer getDriverId() {
		return DriverId;
	}

	public void setDriverId(Integer driverId) {
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
