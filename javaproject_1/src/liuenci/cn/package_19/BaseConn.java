package liuenci.cn.package_19;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 * ���ݷ��ʲ� DAO��
 * 
 * ���ݿ�����
 * @author Administrator
 *
 */
import java.util.List;

public class BaseConn implements BaseConnImpl {
	//����������Ϣ
	private String driver = "com.mysql.jdbc.Driver";
	//��������·��
	private String url = "jdbc:mysql://localhost:3306/yf1701"
			+ "?useUnicode=true&characterEncoding=UTF8";
	//�����û���
	private String userName = "root";
	//��������
	private String password = "JavaL0318.";
	//���ݿ����Ӷ���
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	/**
	 * �޲ι��캯��
	 */
	public BaseConn() {
		this.createConnection();
	}

	@Override
	public void createConnection() {
		try {
			//��������
			Class.forName(driver);
			//�������Ӷ���
			conn = DriverManager.getConnection(url, userName, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int updateDate(String sql, Object... obj) {
		//����Ӱ������
		int row = 0;
		try {
			//׼��ִ��sql
			ps = conn.prepareStatement(sql);
			//����sql����
			if(obj!=null){
				for(int i=0;i<obj.length;i++){
					//Sets the value of the designated parameter using the given object. 
					ps.setObject((i+1), obj[i]);
				}
			}
			//ִ��sql
			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeConnection();
		}
		//����Ӱ������
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
			//ִ��sql���
			ps = conn.prepareStatement(sql);
			//���ò���
			if(obj!=null){
				for(int i=0;i<obj.length;i++){
					//Sets the value of the designated parameter using the given object. 
					ps.setObject((i+1), obj[i]);
				}
			}
			rs = ps.executeQuery();
			//������
			while(rs.next()){
				StudentBean bean = new StudentBean();
				//��ѧ���������Ը�ֵ
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
