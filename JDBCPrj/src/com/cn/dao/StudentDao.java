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
 * 学生dao类
 * 1. 添加学生信息
 * 2. 根据id查询某个学生信息
 * 3. 查询所有学生信息
 * 4. 条件查询学生信息
 * 5. 根据id删除学生信息
 * 6. 根据id修改学生信息
 * 7. 分页查询学生信息
 * 
 * @author Administrator
 *
 */
public class StudentDao extends DataManager {
	
	/**
	 * 1. 添加学生信息
	 * 
	 * @param sb  StudentBean对象
	 * @return 返回int类型数据， >0表示添加成功，否则添加失败
	 */
	public int addStudent(StudentBean sb){
		//SQL语句
		String sql ="insert into tstudent(stu_code,name,sex,phone)"
				+ " values(?,?,?,?)";
		//调用sql添加方法
		int row=updateExecuted(sql,new ParamSet(sb.getStucode(),sb.getName(),sb.getSex(),sb.getPhone()));
		//返回执行结果
		return row;
	}
	
	/**
	 * 2. 根据id查询某个学生信息
	 */
	public StudentBean getAStudent(Integer id){
		//sql语句
		String sql = "select * from tstudent where id = ?";
		//调用sql查询方法
		//预编译sql语句
		return null;
	}
	/**
	 * 3. 查询所有学生信息
	 * @return
	 */
	public List<StudentBean> getStudent(){
		
		//创建studentBean集合用于保存学生的信息
		List<StudentBean> stulst = new ArrayList<StudentBean>();
		//查询sql
		String sql = "select * from tstudent";
		//查询
		List<Map<String, Object>> lmp = queryList(sql);
		//遍历数据集合
		for(Map<String, Object> m:lmp){
			//创建一个学生对象，用于保存map中的数据
			StudentBean sb = new StudentBean();
			for(Entry<String, Object> e:m.entrySet()){
				//给
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
			//将学生对象添加到集合中
			stulst.add(sb);
		}
		return stulst;
	}
}
