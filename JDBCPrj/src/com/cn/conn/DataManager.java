package com.cn.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataManager implements DataManagerimpl {

	private String driver = "com.mysql.jdbc.Driver"; // ������Ϣ
	private String url = "jdbc:mysql://localhost:3306/yf1701?useUnicode=true&characterEncoding=UTF8"; // ���ݿ�����·��
	private String uname = "root"; // �û���
	private String pwd = "123456"; // ����
	Connection con = null; // ���ݿ����Ӷ���
	PreparedStatement ps = null;
	ResultSet rs = null;

	public DataManager() {
		// ������Ӷ���Ϊ�գ��͵��ô������ӷ���
		if (con == null) {
			this.createConnection();
		}
	}

	@Override
	public void createConnection() {
		try {
			// 1.��������
			Class.forName(driver);
			// 2.�������Ӷ���
			con = DriverManager.getConnection(url, uname, pwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public int updateExecuted(String sql) {
		return this.updateExecuted(sql, null);
	}

	@Override
	public int updateExecuted(String sql, ParamSetimpl params) {
		int row = 0;
		try {
			// 3.ִ��sql���
			ps = con.prepareStatement(sql);
			// ���ò���
			if (params != null) {
				// ���ò������÷���
				params.setParams(ps);
			}
			//ִ��SQL
			row = ps.executeUpdate();
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}finally{
			//�ر����Ӷ���
			this.close();
		}
		return row;
	}

	@Override
	public Map<String, Object> query(String sql) {
		return this.query(sql, null);
	}

	@Override
	public Map<String, Object> query(String sql, ParamSetimpl params) {
		Map<String, Object> data = null;
		try {
			// 3.��ȡSQLִ�ж���
			ps = con.prepareStatement(sql);
			// ���ò���
			if (params != null) {
				// ���ò������÷���
				params.setParams(ps);
			}
			//ִ��sql
			rs = ps.executeQuery();
			// ��ȡ���ݱ��ֶμ���
			ResultSetMetaData rsmt = rs.getMetaData();

			// 4. ��������
			while (rs.next()) {
				data = this.getResult(rsmt, rs);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
		return data;
	}

	@Override
	public List<Map<String, Object>> queryList(String sql) {
		// TODO Auto-generated method stub
		return this.queryList(sql, null);
	}

	@Override
	public List<Map<String, Object>> queryList(String sql, ParamSetimpl params) {
		List<Map<String, Object>> lst = new ArrayList<Map<String, Object>>();
		try {
			// 3.��ȡSQLִ�ж���
			ps = con.prepareStatement(sql);
			// ���ò���
			if (params != null) {
				// ���ò������÷���
				params.setParams(ps);
			}
			rs = ps.executeQuery();
			// ��ȡ���ݱ��ֶμ���
			ResultSetMetaData rsmt = rs.getMetaData();

			// 4. ��������
			while (rs.next()) {
				//��ȡmap�������
				Map<String, Object> mp = this.getResult(rsmt, rs);
				//��map������ӵ�List��
				lst.add(mp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//�ر����Ӷ���
			this.close();
		}
		//����list����
		return lst;
	}

	/**
	 * �ر����ݿ�����
	 */
	public void close() {
		//�ر�ResultSet ���������
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//�ر�PrepareStatement SQLִ�ж���
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//�ر�Connection ���Ӷ���
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * ������������ݴ�ŵ�map������
	 * 
	 * @param rsmt
	 * @param rs2
	 */
	private Map<String, Object> getResult(ResultSetMetaData rsmt, ResultSet rst) {
		Map<String, Object> map = new HashMap<String, Object>();
		// �ҵ���Ӧ�ֶ�����ֵ
		try {
			for (int i = 1; i <= rsmt.getColumnCount(); i++) {
				// �ҵ�����
				String colname = rsmt.getColumnName(i);
				// �ҵ��ж�Ӧ��ֵ
				Object colvalue = rst.getObject(colname);
				if (colvalue == null) {
					colvalue = "";
				}
				// ���ֶκ�ֵ��ӵ�map����map.put
				map.put(colname, colvalue);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// ����map����
		return map;
	}

}
