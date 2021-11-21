package tw.com.sample.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.sample.entities.Employee;
import tw.com.sample.web.dao.EmployeeDao;
import tw.com.sample.web.dao.EmployeeDaoImp;

/**
 * Servlet implementation class EmployeeRegisterServlet
 */
@WebServlet("/register")
public class EmployeeRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("username");
		String pass=request.getParameter("userpass");
		String email=request.getParameter("useremail");
		String address=request.getParameter("useraddress");
		double salary=Double.parseDouble(request.getParameter("usersalary"));
		
		Employee emp=new Employee();
		emp.seteName(name);
		emp.setePass(pass);
		emp.seteEmail(email);
		emp.seteAddress(address);
		emp.setSalary(salary);
		
		
		
		// 多型
		EmployeeDao dao=new EmployeeDaoImp(); 
		dao.addEmployee(emp);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
