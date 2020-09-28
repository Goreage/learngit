package mybean;

public class Login {
	private String logname;
	private String password;
	private String backNews="";
	private boolean success=false;
	public Login() {
		
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
	public String getBackNews() {
		return backNews;
	}
	public void setBackNews(String backNews) {
		this.backNews = backNews;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
}
