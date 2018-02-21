package liuenci.cn.package_19;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 * 数据访问层 DAO层
 * 
 * 数据库连接
 * @author Administrator
 *
 */
import java.util.List;

public class BaseConn implements BaseConnImpl {
	//定义驱动信息
	private String driver = "com.mysql.jdbc.Driver";
	//定义连接路径
	private String url = "jdbc:mysql://localhost:3306/yf1701"
			+ "?useUnicode=true&characterEncoding=UTF8";
	//定义用户名
	private String userName = "root";
	//定义密码
	private String password = "JavaL0318.";
	//数据库连接对象
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	/**
	 * 无参构造函数
	 */
	public BaseConn() {
		this.createConnection();
	}

	@Override
	public void createConnection() {
		try {
			//加载驱动
			Class.forName(driver);
			//创建连接对象
			conn = DriverManager.getConnection(url, userName, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int updateDate(String sql, Object... obj) {
		//定义影响行数
		int row = 0;
		try {
			//准备执行sql
			ps = conn.prepareStatement(sql);
			//设置sql函数
			if(obj!=null){
				for(int i=0;i<obj.length;i++){
					//Sets the value of the designated parameter using the given object. 
					ps.setObject((i+1), obj[i]);
				}
			}
			//执行sql
			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeConnection();
		}
		//返回影响行数
		return row;
	}

	@Override
	public List<StudentBean> query(String sql) {
		return this.queryByCondition(sql, null);
	}

	@Override
	public List<StudentBean> queryByCondition(String sql, Object... obj) {
		List<StudentBean> list = new ArrayList<StudentBean>();
		try {
			//执行sql语句
			ps = conn.prepareStatement(sql);
			//设置参数
			if(obj!=null){
				for(int i=0;i<obj.length;i++){
					//Sets the value of the designated parameter using the given object. 
					ps.setObject((i+1), obj[i]);
				}
			}
			rs = ps.executeQuery();
			//处理结果
			while(rs.next()){
				StudentBean bean = new StudentBean();
				//给学生对象属性赋值
				bean.setStuid(rs.getInt("stuid"));
				bean.setStucode(rs.getString("stucode"));
				bean.setName(rs.getString("name"));
				bean.setSex(rs.getInt("sex"));
				bean.setPhone(rs.getString("phone"));
				bean.setBirthday(rs.getString("birthday"));
				//add student of Object to list
				list.add(bean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//return a list to the method
		return list;
	}
	@Override
	public void closeConnection() {
		
		try {
			//close the ResultSet;
			if(rs!=null){
				rs.close();
			}
			//close the PrepareStatement of Object
			if(ps!=null){
				ps.close();
			}
			//close the Connection of Object
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
