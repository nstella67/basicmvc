package kr.co.form1.login;

public class LoginVO {	//Value Object
								//DTO 클래스
	private String id;
	private String pw;
	
	public LoginVO() {}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
}//class end
