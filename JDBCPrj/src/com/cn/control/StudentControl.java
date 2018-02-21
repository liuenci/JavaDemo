package com.cn.control;

import java.util.List;

import com.cn.bean.StudentBean;
import com.cn.dao.StudentDao;

/**
 * 学生业务处理类 1. 添加学生信息 2. 根据id查询某个学生信息 3. 查询所有学生信息 4. 条件查询学生信息 5. 根据id删除学生信息 6.
 * 根据id修改学生信息 7. 分页查询学生信息
 * 
 * 
 * @author Administrator
 *
 */
public class StudentControl {

	/**
	 * 1. 添加学生信息
	 * 
	 * @param sb
	 *            StudentBean对象
	 */
	public void addStudent(StudentBean sb) {
		// 创建StudentDao对象
		StudentDao sd = new StudentDao();
		// 调用添加方法
		int result = sd.addStudent(sb);
		// 判断操作结果
		if (result > 0) {
			System.out.println(sb.getName() + "学生信息，录入成功！");
		} else {
			System.out.println(sb.getName() + "学生信息，录入失败！");
		}
	}

	/**
	 * 3. 查询所有学生信息
	 */
	public void selStudentAll() {
		// 创建StudentDao对象
		StudentDao sd = new StudentDao();
		// 调用添加方法
		List<StudentBean> lst=sd.getStudent();
		//遍历学生信息
		for(StudentBean sb:lst){
			
			System.out.println("id:"+sb.getStuid()+"\t"
					+ "学号："+sb.getStucode()+"\t"
					+ "姓名："+sb.getName()+"\t"
					+ "性别"+(sb.getSex()==1?"男":"女")+"\t"
					+ "手机号："+sb.getPhone()+"\t"
					+ "出生日期："+sb.getBirthday());
		}
	}
}
