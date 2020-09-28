package myservlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import mybean.Register;

/**
 * 是此次登录注册的核心
 *	作用就是将用户写的信息通过JDBC传到数据可中，然后再将信息传到show中显示
 *1.
 *2.
 *3.
 *
 * Servlet implementation class HandleRegister
 */
@WebServlet("/HandleRegister")
public class HandleRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandleRegister() {
        super();
    }

    public void init(ServletConfig config) throws ServletException{
    	super.init(config);
    	//1.加载JDBC数据库驱动程序
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		//mysql数据库的驱动程序，由于会产生异常
    	}
    	catch(Exception e) {}
    }
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		Connection con;
		PreparedStatement sql;
		Register reg=new Register();
		//注册页面的JavaBean的生命周期是request
		request.setAttribute("register", reg);
		String logname=request.getParameter("logname").trim(),
				password=request.getParameter("password").trim(),
				email=request.getParameter("email").trim();
		
//		String logname="";
//		if(request.getParameter("loginame")!=null) {
//			logname = request.getParameter("loginame").trim();
//		}
//		String password="";
//		if(request.getParameter("password")!=null) {
//			password = request.getParameter("password").trim();
//		}
//		String email="";
//		if(request.getParameter("email")!=null) {
//			email = request.getParameter("email").trim();
//		
		if(logname==null)
			logname="";
		if(password==null)
			password="";
		boolean isLD=true;		
		boolean boo=logname.length()>0&&password.length()>0&&isLD;
		String backNews="";
		try {
			String uri="jdbc:mysql://127.0.0.1:3306/loginandregiest?"+
		"user=root&password=16a19961029&characterEncoding=utf-8";
			//2.建立与指定数据库text的连接对象con
			con=DriverManager.getConnection(uri);
			String insertCondition="INSERT INTO user VALUES (?,?,?)";
			//3.利用con对象调用prepareStatement方法生成用于执行SQL语句对象
			sql=con.prepareStatement(insertCondition);
			if(boo) {
				sql.setString(1, logname);//利用sql对象调用set方法设置?所代表的具体指
				sql.setString(2, password);
				sql.setString(3, email);
				int m=sql.executeUpdate();
				//4.数据库操作对象sql调用executeUpdata()方法并返回成功的记录条数
				if(m!=0) {
					backNews="注册成功";
					reg.setBackNews(backNews);
					reg.setLoginame(logname);
					reg.setPassword(password);
					reg.setEmail(email);
				}
			}
			else {
				backNews="信息填写不完整或名字中有非法字符";
				reg.setBackNews(backNews);
			}
			//5.释放资源
			sql.close();
			con.close();
		}
		catch(SQLException exp) {
			backNews="该名字已被使用，请您跟换名字"+exp.getMessage();
			reg.setBackNews(backNews);
		}
		RequestDispatcher dispatcher=
				request.getRequestDispatcher("show.jsp");//转发
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
