package com.cn.demo;

import com.cn.bean.StudentBean;
import com.cn.control.StudentControl;

public class Demo {

	public static void main(String[] args) {
		//创建一个StudentBean对象
		StudentBean sb = new StudentBean("yf17015555", "小昇子", 0, "11111111", "1999-01-01");
		//创建StudentControl对象
		StudentControl sc = new StudentControl();
		//调用添加方法
		sc.addStudent(sb);
		//显示学生信息
		sc.selStudentAll();


	}

}
