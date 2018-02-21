package liuenci.cn.package_19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest2 {
	//驱动信息
	private String driver = "com.mysql.jdbc.Driver";
	//数据库连接路路径
	private String url = "jdbc:mysql://localhost:3306/employeeanddepartment"
			+ "?useUnicode=true&characterEncoding=UTF8";
	//数据库用户名
	private String userName = "root";
	//数据库密码
	private String password = "JavaL0318.";
	//数据库连接对象
	Connection conn = null;
	
	/**
	 * 创建数据库连接
	 * @param args
	 */
	public void getConnection(){
		try {
			//加载驱动
			Class.forName(driver);
			//创建连接对象
			if(conn == null||conn.isClosed()){
				conn = DriverManager.getConnection(url,userName,password);
			} 
		} catch (ClassNotFoundException e) {
			System.out.println("数据库驱动有问题。");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("数据库连接有问题。");
			e.printStackTrace();
		}
	}
	
	/**
	 * SQL查询语句
	 * @param args
	 */
	public void query(String sql){
		try {
			//连接数据库
			this.getConnection();
			//获取数据结果集
			Statement sta = conn.createStatement();
			//查询信息
			ResultSet re = sta.executeQuery(sql);
			//处理查询结果
			while(re.next()){
				//get的类型，根据字段类型进行获取， 可以是列的序号(序号从1开始),也可以是字段名
				//如果字段名是int类型使用getInt,String类型使用getString类型
				System.out.println(re.getString(1) + "\t"+ re.getString(2) + "\t"+ re.getString(3)+ "\t"
				+re.getString(4) + "\t"+ re.getString(5) + "\t"+ re.getString(6) + "\t"
				+re.getString(7) + "\t"+ re.getString(8) + "\t"+ re.getString(9));
			}
			//关闭连接
			// 5.关闭连接对象
			re.close();
			sta.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 增删改操作
	 * @param args
	 */
	public void sqlUpdate(String sql){
		try {
			//连接数据库
			this.getConnection();
			//获取数据结果集
			Statement sta = conn.createStatement();
			//影响行数
			int rows = sta.executeUpdate(sql);
			if (rows > 0) {
				System.out.println("添加成功！");
			} else {
				System.out.println("添加失败！");
			}
			// 关闭资源
			sta.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		JDBCTest2 jdbcTest2 = new JDBCTest2();
		jdbcTest2.sqlUpdate("insert into employee(emp_id,emp_name,emp_sex,emp_salary,emp_birthday,department_id,emp_isPartyMember)VALUES(010,'刘桂花',1,1000,'1990-10-22',1,'否')");
		jdbcTest2.query("select * from employee left join department on employee.department_id = department.dep_id;");
	}

}
