package myservlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mybean.Login;

/**
 * Servlet implementation class HandleLogin
 */
@WebServlet("/HandleLogin")
public class HandleLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandleLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		//1.加载jdbc的驱动程序
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e) {}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		Connection con;
		Statement sql;
		ResultSet rs;
		Login loginBean=null;
		String backNews="";
		//1.创建了生命周期为session的Javabean对象的loginBean
		HttpSession session = request.getSession();
		try { loginBean=(Login)session.getAttribute("login");
			if(loginBean==null) {
				loginBean=new Login();
				session.setAttribute("login", loginBean);
			}			
		}
		catch(Exception ee) {
			loginBean=new Login();
			session.setAttribute("login", loginBean);
		}
		String logname="";
		if(request.getParameter("logname")!=null) {
			logname = request.getParameter("logname").trim();
		}
		String password="";
		if(request.getParameter("password")!=null) {
			password = request.getParameter("password").trim();
		}
		boolean ok = loginBean.isSuccess();
		if(ok==true&&logname.equals(loginBean.getLogname())) {
			backNews=logname+"已经登录了";
			loginBean.setBackNews(backNews);
		}
		else {
			String uri="jdbc:mysql://127.0.0.1:3306/loginandregiest";
			boolean boo=(logname.length()>0)&&(password.length()>0);
			try {
				//2.建立了指定数据库连接对象
				con=DriverManager.getConnection(uri, "root", "16a19961029");
				String condition="SELECT * FROM user WHERE logname = '"+logname+"' and password = '"+password+"'";
				//3.创建了数据库操作对象SQL
				sql=con.createStatement();
				if(boo) {
					//4.创建了结果集对象rs
					rs=sql.executeQuery(condition);
					boolean m=rs.next();
					if(m==true) {
						backNews="登陆成功";
						loginBean.setBackNews(backNews);
						loginBean.setSuccess(true);
						loginBean.setLoginame(logname);
						rs.close();
					}
					else {
						backNews="您输入的用户名不存在，或密码不匹配";
						loginBean.setBackNews(backNews);
						loginBean.setSuccess(false);
						loginBean.setLoginame(logname);
						loginBean.setPassword(password);
					}
				}
				else {
					backNews="您输入的用户名不存在，或密码不匹配";
					loginBean.setBackNews(backNews);
					loginBean.setLoginame(logname);
					loginBean.setPassword(password);
				}
				//5.释放资源
				sql.close();
				con.close();
			}
			catch(SQLException exp) {
				backNews=""+exp.getMessage();
				loginBean.setBackNews(backNews);
				loginBean.setSuccess(false);
			}
		}
		//转发操作
		RequestDispatcher dispatcher=request.getRequestDispatcher("showLoginMess.jsp");
		//转发
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
