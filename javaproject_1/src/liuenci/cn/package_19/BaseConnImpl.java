package liuenci.cn.package_19;
/**
 * ���ݷ��ʲ� DAO��
 * 
 * ���ݿ����ӽӿ� 
 * @author Administrator
 *
 */
import java.util.List;

public interface BaseConnImpl {
	/**
	 * �������ӷ���
	 */
	public void createConnection();
	
	/**
	 * �����رշ���
	 */
	public void closeConnection();
	
	/**
	 * ��������
	 */
	public int updateDate(String sql, Object... obj);
	
	/**
	 * ��ѯ����
	 */
	List<StudentBean> query(String sql);
	
	/**
	 * ������ѯ
	 */
	List<StudentBean> queryByCondition(String sql,Object ...obj);
}
