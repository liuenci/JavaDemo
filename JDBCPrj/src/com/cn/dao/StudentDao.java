package com.cn.dao;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.cn.bean.StudentBean;
import com.cn.conn.DataManager;
import com.cn.conn.ParamSet;
import com.mysql.jdbc.Connection;

/**
 * ѧ��dao��
 * 1. ���ѧ����Ϣ
 * 2. ����id��ѯĳ��ѧ����Ϣ
 * 3. ��ѯ����ѧ����Ϣ
 * 4. ������ѯѧ����Ϣ
 * 5. ����idɾ��ѧ����Ϣ
 * 6. ����id�޸�ѧ����Ϣ
 * 7. ��ҳ��ѯѧ����Ϣ
 * 
 * @author Administrator
 *
 */
public class StudentDao extends DataManager {
	
	/**
	 * 1. ���ѧ����Ϣ
	 * 
	 * @param sb  StudentBean����
	 * @return ����int�������ݣ� >0��ʾ��ӳɹ����������ʧ��
	 */
	public int addStudent(StudentBean sb){
		//SQL���
		String sql ="insert into tstudent(stu_code,name,sex,phone)"
				+ " values(?,?,?,?)";
		//����sql��ӷ���
		int row=updateExecuted(sql,new ParamSet(sb.getStucode(),sb.getName(),sb.getSex(),sb.getPhone()));
		//����ִ�н��
		return row;
	}
	
	/**
	 * 2. ����id��ѯĳ��ѧ����Ϣ
	 */
	public StudentBean getAStudent(Integer id){
		//sql���
		String sql = "select * from tstudent where id = ?";
		//����sql��ѯ����
		//Ԥ����sql���
		return null;
	}
	/**
	 * 3. ��ѯ����ѧ����Ϣ
	 * @return
	 */
	public List<StudentBean> getStudent(){
		
		//����studentBean�������ڱ���ѧ������Ϣ
		List<StudentBean> stulst = new ArrayList<StudentBean>();
		//��ѯsql
		String sql = "select * from tstudent";
		//��ѯ
		List<Map<String, Object>> lmp = queryList(sql);
		//�������ݼ���
		for(Map<String, Object> m:lmp){
			//����һ��ѧ���������ڱ���map�е�����
			StudentBean sb = new StudentBean();
			for(Entry<String, Object> e:m.entrySet()){
				//��
				if(e.getKey().equals("id")){
					sb.setStuid((int)e.getValue());
				}else if(e.getKey().equals("stu_code")){
					sb.setStucode(e.getValue().toString());
				}else if(e.getKey().equals("name")){
					sb.setName(e.getValue().toString());
				}else if(e.getKey().equals("sex")){
					sb.setSex((int)e.getValue());
				}else if(e.getKey().equals("phone")){
					sb.setPhone(e.getValue().toString());
				}else if(e.getKey().equals("birthday")){
					sb.setBirthday(e.getValue().toString());
				}
				
			}
			//��ѧ��������ӵ�������
			stulst.add(sb);
		}
		return stulst;
	}
}
