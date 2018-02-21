package liuenci.cn.package_19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	private String driver = "com.mysql.jdbc.Driver"; // ������Ϣ
	private String url = "jdbc:mysql://localhost:3306/employeeanddepartment"
			+ "?useUnicode=true&characterEncoding=UTF8"; // ���ݿ�����·��
	private String uname = "root"; // �û���
	private String pwd = "JavaL0318."; // ����
	Connection con = null; // ���ݿ����Ӷ���

	/**
	 * �������ݿ�����
	 * 
	 * @return
	 */
	public void getConn() {

		try {
			// 1.��������
			Class.forName(driver);
			// 2.�������Ӷ���
			if (con == null || con.isClosed()) {
				con = DriverManager.getConnection(url, uname, pwd);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("���ݿ����������⣡");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("���ݿ����������⣡");
			e.printStackTrace();
		}

	}

	/**
	 * ��ѯSQL
	 */
	public void sel() {

		try {
			// ��ȡ���ݿ�����
			this.getConn();
			// 3. ִ��SQL��䣬����ȡ���ݽ����
			Statement sta = con.createStatement();
			// ��ѯѧ������Ϣ
			String sql = "select * from employee left join "
					+ "department on employee.department_id = department.dep_id";
			ResultSet rs = sta.executeQuery(sql);
			// 4. �����ѯ���
			while (rs.next()) {
				/*
				 * get�����ͣ������ֶ����ͽ��л�ȡ�� �������е����(��Ŵ�1��ʼ),Ҳ�������ֶ���
				 */
				System.out.println(rs.getString(1) + "\t"+ rs.getString(2) + "\t"+ rs.getString(3)
				+rs.getString(4) + "\t"+ rs.getString(5) + "\t"+ rs.getString(6)
				+rs.getString(7) + "\t"+ rs.getString(8) + "\t"+ rs.getString(9));
			}

			// 5.�ر����Ӷ���
			rs.close();
			sta.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * ��ӡ�ɾ�����޸� SQL
	 */
	public void add(String sql) {

		try {
			// ��ȡ���ݿ�����
			this.getConn();
			// 3.ִ��sql
			Statement sta = con.createStatement();
			int rows = sta.executeUpdate(sql);
			if (rows > 0) {
				System.out.println("��ӳɹ���");
			} else {
				System.out.println("���ʧ�ܣ�");
			}
			// �ر���Դ
			sta.close();
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		JDBCTest jdbcTest = new JDBCTest();
		// ������ӷ���
		String sql = "select * from employee left join department on employee.department_id = department.dep_id;";
		String sql2 = "delete  from employee where emp_id =009";
		jdbcTest.add(sql2);
		//���ò�ѯ����
		jdbcTest.sel();

	}
}
