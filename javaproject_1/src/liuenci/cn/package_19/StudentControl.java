package liuenci.cn.package_19;

import java.util.List;

/**
 * ѧ����ҵ�����ࣨҵ���߼��㣩class of Student Business processing
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
			System.out.println("��ӳɹ���");
		} else {
			System.out.println("���ʧ��!");
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
			System.out.println("ɾ���ɹ���");
		} else {
			System.out.println("ɾ��ʧ��!");
		}
	}
	/**
	 * recompose a student
	 */
	public void recompose(StudentBean bean){
		StudentDao studentDao = new StudentDao();
		int row = studentDao.recomposeStudent(bean);
		if (row > 0) {
			System.out.println("�޸ĳɹ���");
		} else {
			System.out.println("�޸�ʧ��!");
		}
	}
	/**
	 * query all Students
	 */
	public void queryAll() {
		// create StudentDao of Object
		StudentDao studentDao = new StudentDao();
		// ��ȡ��ѯ���
		List<StudentBean> list = studentDao.queryAllStudents();
		// �༭���϶���
		for (StudentBean studentBean : list) {
			System.out.println("id:" + studentBean.getStuid());
			System.out.println("ѧ��:" + studentBean.getStucode());
			System.out.println("����:" + studentBean.getName());
			System.out.println("�Ա�:" + (studentBean.getSex() == 1 ? "��" : "Ů"));
			System.out.println("�ֻ�:" + studentBean.getPhone());
			System.out.println("��������:" + studentBean.getBirthday());
			System.out.println("=====================");
		}
	}
	/**
	 * query student by id
	 */
	public void queryStudentById() {
		// create StudentDao of Object
		StudentDao studentDao = new StudentDao();
		// ��ȡ��ѯ���
		List<StudentBean> list = studentDao.queryStudentsById(002);
		// �༭���϶���
		for (StudentBean studentBean : list) {
			System.out.println("id:" + studentBean.getStuid());
			System.out.println("ѧ��:" + studentBean.getStucode());
			System.out.println("����:" + studentBean.getName());
			System.out.println("�Ա�:" + (studentBean.getSex() == 1 ? "��" : "Ů"));
			System.out.println("�ֻ�:" + studentBean.getPhone());
			System.out.println("��������:" + studentBean.getBirthday());
			System.out.println("=====================");
		}
	}
}
