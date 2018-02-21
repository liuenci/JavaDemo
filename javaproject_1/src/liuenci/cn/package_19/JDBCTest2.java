package liuenci.cn.package_19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest2 {
	//������Ϣ
	private String driver = "com.mysql.jdbc.Driver";
	//���ݿ�����··��
	private String url = "jdbc:mysql://localhost:3306/employeeanddepartment"
			+ "?useUnicode=true&characterEncoding=UTF8";
	//���ݿ��û���
	private String userName = "root";
	//���ݿ�����
	private String password = "JavaL0318.";
	//���ݿ����Ӷ���
	Connection conn = null;
	
	/**
	 * �������ݿ�����
	 * @param args
	 */
	public void getConnection(){
		try {
			//��������
			Class.forName(driver);
			//�������Ӷ���
			if(conn == null||conn.isClosed()){
				conn = DriverManager.getConnection(url,userName,password);
			} 
		} catch (ClassNotFoundException e) {
			System.out.println("���ݿ����������⡣");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("���ݿ����������⡣");
			e.printStackTrace();
		}
	}
	
	/**
	 * SQL��ѯ���
	 * @param args
	 */
	public void query(String sql){
		try {
			//�������ݿ�
			this.getConnection();
			//��ȡ���ݽ����
			Statement sta = conn.createStatement();
			//��ѯ��Ϣ
			ResultSet re = sta.executeQuery(sql);
			//�����ѯ���
			while(re.next()){
				//get�����ͣ������ֶ����ͽ��л�ȡ�� �������е����(��Ŵ�1��ʼ),Ҳ�������ֶ���
				//����ֶ�����int����ʹ��getInt,String����ʹ��getString����
				System.out.println(re.getString(1) + "\t"+ re.getString(2) + "\t"+ re.getString(3)+ "\t"
				+re.getString(4) + "\t"+ re.getString(5) + "\t"+ re.getString(6) + "\t"
				+re.getString(7) + "\t"+ re.getString(8) + "\t"+ re.getString(9));
			}
			//�ر�����
			// 5.�ر����Ӷ���
			re.close();
			sta.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ��ɾ�Ĳ���
	 * @param args
	 */
	public void sqlUpdate(String sql){
		try {
			//�������ݿ�
			this.getConnection();
			//��ȡ���ݽ����
			Statement sta = conn.createStatement();
			//Ӱ������
			int rows = sta.executeUpdate(sql);
			if (rows > 0) {
				System.out.println("��ӳɹ���");
			} else {
				System.out.println("���ʧ�ܣ�");
			}
			// �ر���Դ
			sta.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		JDBCTest2 jdbcTest2 = new JDBCTest2();
		jdbcTest2.sqlUpdate("insert into employee(emp_id,emp_name,emp_sex,emp_salary,emp_birthday,department_id,emp_isPartyMember)VALUES(010,'����',1,1000,'1990-10-22',1,'��')");
		jdbcTest2.query("select * from employee left join department on employee.department_id = department.dep_id;");
	}

}
