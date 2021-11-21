package tw.com.sample.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import tw.com.sample.entities.Employee;
import tw.com.sample.web.db.DbConnection;

public class EmployeeDaoImp implements EmployeeDao {

	@Override
	public void addEmployee(Employee emp) {
		Connection conn = null;
		PreparedStatement ps = null;
		// 連接資料庫
		conn = DbConnection.getDB().getConnection();
		String addSQL = "insert into employee(eName,ePass,eEmail,eAddress,salary)values(?,?,?,?,?)";// SQL語法
		try {
			ps = conn.prepareStatement(addSQL);
			ps.setString(1, emp.geteName());
			ps.setString(2, emp.getePass());
			ps.setString(3, emp.geteEmail());
			ps.setString(4, emp.geteAddress());
			ps.setDouble(5, emp.getSalary());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbConnection.getDB().close(ps);
			DbConnection.getDB().close(conn);
		}
	}
}
