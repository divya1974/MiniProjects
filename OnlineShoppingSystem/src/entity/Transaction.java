package entity;

public class Transaction {

private static int count=0;
	
	private int id;
	private Integer Uid;
	private Integer Pid;
	private String Status;
	//private Integer Amount;
	public Transaction (Integer Uid, Integer Pid, String Status) {
		super();
		this.id = ++count;
		this.Uid=Uid;
		this.Pid=Pid;
		//this.Amount=Amount;
		this.Status=Status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getUid() {
		return Uid;
	}
	public void setUid(Integer uid) {
		Uid = uid;
	}
	public Integer getPid() {
		return Pid;
	}
	public void setPid(Integer pid) {
		Pid = pid;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	

}
