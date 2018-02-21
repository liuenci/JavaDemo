package liuenci.cn.package_19;

import java.util.List;

/**
 * 学生类业务处理类（业务逻辑层）class of Student Business processing
 * @author Administrator
 */
public class StudentControl {
	/**
	 * add student
	 */
	public void add(StudentBean stu) {
		// create StudentDao of Object
		StudentDao studentDao = new StudentDao();
		// execute the method of add
		int row = studentDao.add(stu);
		if (row > 0) {
			System.out.println("添加成功！");
		} else {
			System.out.println("添加失败!");
		}
	}
	/**
	 * delete a student by stuid;
	 */
	public void delete(StudentBean bean){
		// create StudentDao of Object
		StudentDao studentDao = new StudentDao();
		// execute the method of deleting;
		int row = studentDao.delete(bean);
		if (row > 0) {
			System.out.println("删除成功！");
		} else {
			System.out.println("删除失败!");
		}
	}
	/**
	 * recompose a student
	 */
	public void recompose(StudentBean bean){
		StudentDao studentDao = new StudentDao();
		int row = studentDao.recomposeStudent(bean);
		if (row > 0) {
			System.out.println("修改成功！");
		} else {
			System.out.println("修改失败!");
		}
	}
	/**
	 * query all Students
	 */
	public void queryAll() {
		// create StudentDao of Object
		StudentDao studentDao = new StudentDao();
		// 获取查询结果
		List<StudentBean> list = studentDao.queryAllStudents();
		// 编辑集合对象
		for (StudentBean studentBean : list) {
			System.out.println("id:" + studentBean.getStuid());
			System.out.println("学号:" + studentBean.getStucode());
			System.out.println("姓名:" + studentBean.getName());
			System.out.println("性别:" + (studentBean.getSex() == 1 ? "男" : "女"));
			System.out.println("手机:" + studentBean.getPhone());
			System.out.println("出生日期:" + studentBean.getBirthday());
			System.out.println("=====================");
		}
	}
	/**
	 * query student by id
	 */
	public void queryStudentById() {
		// create StudentDao of Object
		StudentDao studentDao = new StudentDao();
		// 获取查询结果
		List<StudentBean> list = studentDao.queryStudentsById(002);
		// 编辑集合对象
		for (StudentBean studentBean : list) {
			System.out.println("id:" + studentBean.getStuid());
			System.out.println("学号:" + studentBean.getStucode());
			System.out.println("姓名:" + studentBean.getName());
			System.out.println("性别:" + (studentBean.getSex() == 1 ? "男" : "女"));
			System.out.println("手机:" + studentBean.getPhone());
			System.out.println("出生日期:" + studentBean.getBirthday());
			System.out.println("=====================");
		}
	}
}
