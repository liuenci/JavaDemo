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

	private String driver = "com.mysql.jdbc.Driver"; // 驱动信息
	private String url = "jdbc:mysql://localhost:3306/yf1701?useUnicode=true&characterEncoding=UTF8"; // 数据库连接路径
	private String uname = "root"; // 用户名
	private String pwd = "123456"; // 密码
	Connection con = null; // 数据库连接对象
	PreparedStatement ps = null;
	ResultSet rs = null;

	public DataManager() {
		// 如果连接对象为空，就调用创建连接方法
		if (con == null) {
			this.createConnection();
		}
	}

	@Override
	public void createConnection() {
		try {
			// 1.加载驱动
			Class.forName(driver);
			// 2.创建连接对象
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
			// 3.执行sql语句
			ps = con.prepareStatement(sql);
			// 设置参数
			if (params != null) {
				// 调用参数设置方法
				params.setParams(ps);
			}
			//执行SQL
			row = ps.executeUpdate();
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}finally{
			//关闭连接对象
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
			// 3.获取SQL执行对象
			ps = con.prepareStatement(sql);
			// 设置参数
			if (params != null) {
				// 调用参数设置方法
				params.setParams(ps);
			}
			//执行sql
			rs = ps.executeQuery();
			// 获取数据表字段集合
			ResultSetMetaData rsmt = rs.getMetaData();

			// 4. 处理结果集
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
			// 3.获取SQL执行对象
			ps = con.prepareStatement(sql);
			// 设置参数
			if (params != null) {
				// 调用参数设置方法
				params.setParams(ps);
			}
			rs = ps.executeQuery();
			// 获取数据表字段集合
			ResultSetMetaData rsmt = rs.getMetaData();

			// 4. 处理结果集
			while (rs.next()) {
				//获取map结合数据
				Map<String, Object> mp = this.getResult(rsmt, rs);
				//将map集合添加到List中
				lst.add(mp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//关闭连接对象
			this.close();
		}
		//返回list集合
		return lst;
	}

	/**
	 * 关闭数据库连接
	 */
	public void close() {
		//关闭ResultSet 结果集对象
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//关闭PrepareStatement SQL执行对象
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//关闭Connection 连接对象
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 将结果集的数据存放到map集合中
	 * 
	 * @param rsmt
	 * @param rs2
	 */
	private Map<String, Object> getResult(ResultSetMetaData rsmt, ResultSet rst) {
		Map<String, Object> map = new HashMap<String, Object>();
		// 找到对应字段名和值
		try {
			for (int i = 1; i <= rsmt.getColumnCount(); i++) {
				// 找到列名
				String colname = rsmt.getColumnName(i);
				// 找到列对应的值
				Object colvalue = rst.getObject(colname);
				if (colvalue == null) {
					colvalue = "";
				}
				// 将字段和值添加到map集合map.put
				map.put(colname, colvalue);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 返回map集合
		return map;
	}

}
