package com.cn.demo;

import com.cn.bean.StudentBean;
import com.cn.control.StudentControl;

public class Demo {

	public static void main(String[] args) {
		//����һ��StudentBean����
		StudentBean sb = new StudentBean("yf17015555", "С�N��", 0, "11111111", "1999-01-01");
		//����StudentControl����
		StudentControl sc = new StudentControl();
		//������ӷ���
		sc.addStudent(sb);
		//��ʾѧ����Ϣ
		sc.selStudentAll();


	}

}
