package com.imooc.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.imooc.dao.GoddessDao;
import com.imooc.model.Goddess;

public class GoddessAction {
	/**
	 * 添加
	 * @throws Exception 
	 */
	public void add(Goddess goddess) throws Exception {
		GoddessDao dao = new GoddessDao();
		dao.addGoddess(goddess);
	}

	/**
	 * 更新
	 * @throws SQLException 
	 */
	public void edit(Goddess goddess) throws SQLException {
		GoddessDao dao = new GoddessDao();
		dao.updateGoddess(goddess);
	}

	/**
	 * 删除
	 * @throws SQLException 
	 */
	public void del(Integer id) throws SQLException {
		GoddessDao dao = new GoddessDao();
		dao.delGoddess(id);
	}

	/**
	 * 查询
	 * @throws Exception 
	 */
	public List<Goddess> query() throws Exception {
		GoddessDao dao = new GoddessDao();
		return dao.query();
	}
	
	/**
	 * 条件查询
	 */
	public List<Goddess> query(List<Map<String,Object>> params) throws Exception {
		GoddessDao dao = new GoddessDao();
		return dao.query(params);
	}
	/**
	 * 通过id查询单个人
	 * @throws SQLException 
	 */
	public Goddess get(Integer id) throws SQLException{
		GoddessDao dao = new GoddessDao();
		return dao.get(id);
	}
}
