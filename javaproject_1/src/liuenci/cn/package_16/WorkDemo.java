package liuenci.cn.package_16;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WorkDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//限制集合元素类型
				List<Worker> cl = new ArrayList<Worker>();
				Worker worker =	new Worker() ;
				
				//给集合添加元素
				cl.add(new Worker("小白","女","19773365663","2016-7-11"));
				cl.add(new Worker("小明","男","19773365663","2013-7-11"));
				cl.add(new Worker("小红","女","19773365663","2017-7-11"));
				
				//输出所有成员
				System.out.println("显示所有成员：");
				for(Worker w:cl){
					System.out.println(w.toString());
				}
				
				/**
				 * A：添加新员工
				 */
				System.out.println("**************************");
				//从控制台添加员工信息
				System.out.println("请输入需要添加的员工信息：");
				System.out.print("请输入员工姓名：");
				String a = sc.next();
				System.out.print("请输入员工性别：");
				String b = sc.next();
				System.out.print("请输入员工电话：");
				String c = sc.next();
				System.out.print("请输入员工生日：");
				String d = sc.next();
				cl.add(new Worker(a,b,c,d));
				//输出所有成员
				System.out.println("显示添加之后所有成员：");
				for(Worker w:cl){
					System.out.println(w.toString());
				}
				
				/**
				 * 删除成员
				 */
				System.out.println("**************************");
				//删除成员
				System.out.println("请输入需要删除的名字：");
				String name = sc.next();
				for(int i = 0;i<cl.size();i++){
					if(name.equals(cl.get(i).getName())){
						cl.remove(i);	
						break;
					}
				}
				System.out.println("**************************");
				//输出所有成员
				System.out.println("显示删除之后所有成员：");
						for(Worker w:cl){
							System.out.println(w.toString());
						}
						
				/**
				 * 计算员工的平均年龄
				 */
				Date dd = new Date(System.currentTimeMillis());
				dd.getYear();
				System.out.println("**************************");
				for(int i = 0 ; i<cl.size() ; i++){
					Date d1 = Date.valueOf(cl.get(i).getDate());
					d1.getYear();
					System.out.println(cl.get(i).getName()+"的年龄：" +(dd.getYear()-d1.getYear()));
				}
				
				/**
				 * 统计男女比例是多少
				 */
				System.out.println("**************************");
				System.out.println("男女人数");
				int total1=0;//统计女员工人数
				int total2=0;//统计男员工人数
				for(int i = 0 ; i<cl.size() ; i++){
					if(cl.get(i).getSex().equals("女")){
						total1++;
					
					}else if(cl.get(i).getSex().equals("男")){
						total2++;	
					}			
				}
				System.out.println("女员工："+total1);
				System.out.println("男员工："+total2);
				
				/**
				 * 找出年龄最大的员工
				 */
//				System.out.println("**************************");
//				System.out.println("该公司年龄最大的员工：");
//				Collections.sort(cl);
//				for (Object o : cl) {
//					System.out.println(o);
//				}
//				System.out.print(cl.get(0));
				int num=0;
				for(int i=0;i<cl.size()-1;i++){
					if(Date.valueOf(cl.get(i).getDate()).after(Date.valueOf(cl.get(i+1).getDate()))){
						num=i+1;
					}
				}
				System.out.println("最大的员工是:"+cl.get(num).getName());
			}
		}	
	
			
	
	
	


