package liuenci.cn.package_19;
/**
 * 数据访问层 DAO层
 * 
 * 数据库连接接口 
 * @author Administrator
 *
 */
import java.util.List;

public interface BaseConnImpl {
	/**
	 * 创建连接方法
	 */
	public void createConnection();
	
	/**
	 * 创建关闭方法
	 */
	public void closeConnection();
	
	/**
	 * 更新数据
	 */
	public int updateDate(String sql, Object... obj);
	
	/**
	 * 查询所有
	 */
	List<StudentBean> query(String sql);
	
	/**
	 * 条件查询
	 */
	List<StudentBean> queryByCondition(String sql,Object ...obj);
}
