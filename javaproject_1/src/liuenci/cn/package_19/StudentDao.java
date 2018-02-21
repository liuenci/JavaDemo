package liuenci.cn.package_19;
/**
 * 数据访问层 DAO层
 * @author Administrator
 *
 */
import java.util.List;

public class StudentDao extends BaseConn{
	/**
	 * add Student
	 */
	public int add(StudentBean bean){
		//write a sql statement
		String sql = "insert into tstudent(stuid,stucode,name,sex,phone,birthday) values(?,?,?,?,?,?)";
		return updateDate(sql, bean.getStuid(),bean.getStucode(), bean.getName(),bean.getSex(),bean.getPhone(),bean.getBirthday());
	}
	/**
	 * delete Student
	 */
	public int delete(StudentBean bean){
		String sql = "delete from tstudent where stuid = ?";
		return updateDate(sql, bean.getStuid());
	}
	/**
	 * recompose a student information
	 */
	public int recomposeStudent(StudentBean bean){
		String sql = "update tstudent set name = '松哥二号' where stuid = ?";
		return updateDate(sql, bean.getStuid());
	}
	/**
	 * query all student information
	 */
	public List<StudentBean> queryAllStudents(){
		String sql = "select * from tstudent";
		return query(sql);
	}
	/**
	 * query result by id;
	 */
	public List<StudentBean> queryStudentsById(int id) {
		String sql = "select * from tstudent where stuid=?";
		return queryByCondition(sql, id);
	}
}
