package mybean;

public class Register {
	private String logname;
	private String password;
	private String email;
	private String backNews;
	//返回变量
	public Register() {
		
	}
	public String getLogname() {
		return logname;
	}
	public void setLoginame(String logname) {
		this.logname = logname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBackNews() {
		return backNews;
	}
	public void setBackNews(String backNews) {
		this.backNews = backNews;
	}
}
