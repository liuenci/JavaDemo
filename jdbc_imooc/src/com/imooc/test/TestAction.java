package com.imooc.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.imooc.action.GoddessAction;
import com.imooc.model.Goddess;

public class TestAction {

	public static void main(String[] args) throws Exception {
		GoddessAction action = new GoddessAction();
		
		
		//��ѯ
//		List<Goddess> result = action.query();
//		for(Goddess gs : result){
//			System.out.println(gs.toString());
//			System.out.println("======");
//		}
		
		
//		//����
//		Goddess g = new Goddess();
//		g.setUser_name("�ܴ�ge");
//		g.setSex(1);
//		g.setAge(22);
//		g.setBirthday(new Date());
//		g.setEmail("xiongdada@imooc.com");
//		g.setMobile("11111111");
//		g.setIsdel(0);
//		g.setId(11);
////		action.add(g);
//		
//		//ɾ��
//		action.edit(g);
//		action.del(11);
//		List<Goddess> result = action.query();
//		for(Goddess gs : result){
//			System.out.println(gs.toString());
//			System.out.println("======");
//		}
		
		//ͨ��������ѯ
		List<Map<String,Object>> params = new ArrayList<Map<String,Object>>();
		Map<String,Object> map = new HashMap<String,Object>();
		
		map.put("name","user_name");
		map.put("rela","=");
		map.put("value","'�ɸ�'");
		params.add(map);
		List<Goddess> result = action.query(params);
		for(Goddess g:result){
			System.out.println(g.toString());
			System.out.println("============");
		}
	}

}
