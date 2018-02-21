package com.imooc.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.imooc.dao.GoddessDao;
import com.imooc.model.Goddess;

public class GoddessAction {
	/**
	 * ���
	 * @throws Exception 
	 */
	public void add(Goddess goddess) throws Exception {
		GoddessDao dao = new GoddessDao();
		dao.addGoddess(goddess);
	}

	/**
	 * ����
	 * @throws SQLException 
	 */
	public void edit(Goddess goddess) throws SQLException {
		GoddessDao dao = new GoddessDao();
		dao.updateGoddess(goddess);
	}

	/**
	 * ɾ��
	 * @throws SQLException 
	 */
	public void del(Integer id) throws SQLException {
		GoddessDao dao = new GoddessDao();
		dao.delGoddess(id);
	}

	/**
	 * ��ѯ
	 * @throws Exception 
	 */
	public List<Goddess> query() throws Exception {
		GoddessDao dao = new GoddessDao();
		return dao.query();
	}
	
	/**
	 * ������ѯ
	 */
	public List<Goddess> query(List<Map<String,Object>> params) throws Exception {
		GoddessDao dao = new GoddessDao();
		return dao.query(params);
	}
	/**
	 * ͨ��id��ѯ������
	 * @throws SQLException 
	 */
	public Goddess get(Integer id) throws SQLException{
		GoddessDao dao = new GoddessDao();
		return dao.get(id);
	}
}
