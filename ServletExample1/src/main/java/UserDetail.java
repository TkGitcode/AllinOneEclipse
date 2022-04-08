
public class UserDetail {

	int cusId;
	String name;
	public UserDetail(int cusId,String name) {
		
		this.cusId=cusId;
		this.name=name;
		
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	@Override
	public String toString() {
		return "UserDetail [cusId=" + cusId + ", name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
