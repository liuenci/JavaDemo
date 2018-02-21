package liuenci.cn.package_19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	private String driver = "com.mysql.jdbc.Driver"; // 驱动信息
	private String url = "jdbc:mysql://localhost:3306/employeeanddepartment"
			+ "?useUnicode=true&characterEncoding=UTF8"; // 数据库连接路径
	private String uname = "root"; // 用户名
	private String pwd = "JavaL0318."; // 密码
	Connection con = null; // 数据库连接对象

	/**
	 * 创建数据库连接
	 * 
	 * @return
	 */
	public void getConn() {

		try {
			// 1.加载驱动
			Class.forName(driver);
			// 2.创建连接对象
			if (con == null || con.isClosed()) {
				con = DriverManager.getConnection(url, uname, pwd);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("数据库驱动有问题！");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("数据库连接有问题！");
			e.printStackTrace();
		}

	}

	/**
	 * 查询SQL
	 */
	public void sel() {

		try {
			// 获取数据库连接
			this.getConn();
			// 3. 执行SQL语句，并获取数据结果集
			Statement sta = con.createStatement();
			// 查询学生表信息
			String sql = "select * from employee left join "
					+ "department on employee.department_id = department.dep_id";
			ResultSet rs = sta.executeQuery(sql);
			// 4. 处理查询结果
			while (rs.next()) {
				/*
				 * get的类型，根据字段类型进行获取， 可以是列的序号(序号从1开始),也可以是字段名
				 */
				System.out.println(rs.getString(1) + "\t"+ rs.getString(2) + "\t"+ rs.getString(3)
				+rs.getString(4) + "\t"+ rs.getString(5) + "\t"+ rs.getString(6)
				+rs.getString(7) + "\t"+ rs.getString(8) + "\t"+ rs.getString(9));
			}

			// 5.关闭连接对象
			rs.close();
			sta.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 添加、删除、修改 SQL
	 */
	public void add(String sql) {

		try {
			// 获取数据库连接
			this.getConn();
			// 3.执行sql
			Statement sta = con.createStatement();
			int rows = sta.executeUpdate(sql);
			if (rows > 0) {
				System.out.println("添加成功！");
			} else {
				System.out.println("添加失败！");
			}
			// 关闭资源
			sta.close();
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		JDBCTest jdbcTest = new JDBCTest();
		// 调用添加方法
		String sql = "select * from employee left join department on employee.department_id = department.dep_id;";
		String sql2 = "delete  from employee where emp_id =009";
		jdbcTest.add(sql2);
		//调用查询方法
		jdbcTest.sel();

	}
}
