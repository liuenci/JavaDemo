package com.cn.control;

import java.util.List;

import com.cn.bean.StudentBean;
import com.cn.dao.StudentDao;

/**
 * ѧ��ҵ������ 1. ���ѧ����Ϣ 2. ����id��ѯĳ��ѧ����Ϣ 3. ��ѯ����ѧ����Ϣ 4. ������ѯѧ����Ϣ 5. ����idɾ��ѧ����Ϣ 6.
 * ����id�޸�ѧ����Ϣ 7. ��ҳ��ѯѧ����Ϣ
 * 
 * 
 * @author Administrator
 *
 */
public class StudentControl {

	/**
	 * 1. ���ѧ����Ϣ
	 * 
	 * @param sb
	 *            StudentBean����
	 */
	public void addStudent(StudentBean sb) {
		// ����StudentDao����
		StudentDao sd = new StudentDao();
		// ������ӷ���
		int result = sd.addStudent(sb);
		// �жϲ������
		if (result > 0) {
			System.out.println(sb.getName() + "ѧ����Ϣ��¼��ɹ���");
		} else {
			System.out.println(sb.getName() + "ѧ����Ϣ��¼��ʧ�ܣ�");
		}
	}

	/**
	 * 3. ��ѯ����ѧ����Ϣ
	 */
	public void selStudentAll() {
		// ����StudentDao����
		StudentDao sd = new StudentDao();
		// ������ӷ���
		List<StudentBean> lst=sd.getStudent();
		//����ѧ����Ϣ
		for(StudentBean sb:lst){
			
			System.out.println("id:"+sb.getStuid()+"\t"
					+ "ѧ�ţ�"+sb.getStucode()+"\t"
					+ "������"+sb.getName()+"\t"
					+ "�Ա�"+(sb.getSex()==1?"��":"Ů")+"\t"
					+ "�ֻ��ţ�"+sb.getPhone()+"\t"
					+ "�������ڣ�"+sb.getBirthday());
		}
	}
}
