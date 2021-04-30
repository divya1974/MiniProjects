

package entities;

public class Trip {
	static Integer count=0;
	Integer TId;
	String From;
	String To;
	Integer UId;
	Integer DId;
	String Date;
	
	
	public Trip( String from, String to, Integer uId, Integer dId, String date) {
		super();
		TId = count++;
		From = from;
		To = to;
		UId = uId;
		DId = dId;
		Date = date;
	}

	public Integer getTId() {
		return TId;
	}
	public void setTId(Integer tId) {
		TId = tId;
	}
	public String getFrom() {
		return From;
	}
	public void setFrom(String from) {
		From = from;
	}
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}
	public Integer getUId() {
		return UId;
	}
	public void setUId(Integer uId) {
		UId = uId;
	}
	public Integer getDId() {
		return DId;
	}
	public void setDId(Integer dId) {
		DId = dId;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
}
