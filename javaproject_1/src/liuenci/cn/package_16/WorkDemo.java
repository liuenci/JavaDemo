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
		//���Ƽ���Ԫ������
				List<Worker> cl = new ArrayList<Worker>();
				Worker worker =	new Worker() ;
				
				//���������Ԫ��
				cl.add(new Worker("С��","Ů","19773365663","2016-7-11"));
				cl.add(new Worker("С��","��","19773365663","2013-7-11"));
				cl.add(new Worker("С��","Ů","19773365663","2017-7-11"));
				
				//������г�Ա
				System.out.println("��ʾ���г�Ա��");
				for(Worker w:cl){
					System.out.println(w.toString());
				}
				
				/**
				 * A�������Ա��
				 */
				System.out.println("**************************");
				//�ӿ���̨���Ա����Ϣ
				System.out.println("��������Ҫ��ӵ�Ա����Ϣ��");
				System.out.print("������Ա��������");
				String a = sc.next();
				System.out.print("������Ա���Ա�");
				String b = sc.next();
				System.out.print("������Ա���绰��");
				String c = sc.next();
				System.out.print("������Ա�����գ�");
				String d = sc.next();
				cl.add(new Worker(a,b,c,d));
				//������г�Ա
				System.out.println("��ʾ���֮�����г�Ա��");
				for(Worker w:cl){
					System.out.println(w.toString());
				}
				
				/**
				 * ɾ����Ա
				 */
				System.out.println("**************************");
				//ɾ����Ա
				System.out.println("��������Ҫɾ�������֣�");
				String name = sc.next();
				for(int i = 0;i<cl.size();i++){
					if(name.equals(cl.get(i).getName())){
						cl.remove(i);	
						break;
					}
				}
				System.out.println("**************************");
				//������г�Ա
				System.out.println("��ʾɾ��֮�����г�Ա��");
						for(Worker w:cl){
							System.out.println(w.toString());
						}
						
				/**
				 * ����Ա����ƽ������
				 */
				Date dd = new Date(System.currentTimeMillis());
				dd.getYear();
				System.out.println("**************************");
				for(int i = 0 ; i<cl.size() ; i++){
					Date d1 = Date.valueOf(cl.get(i).getDate());
					d1.getYear();
					System.out.println(cl.get(i).getName()+"�����䣺" +(dd.getYear()-d1.getYear()));
				}
				
				/**
				 * ͳ����Ů�����Ƕ���
				 */
				System.out.println("**************************");
				System.out.println("��Ů����");
				int total1=0;//ͳ��ŮԱ������
				int total2=0;//ͳ����Ա������
				for(int i = 0 ; i<cl.size() ; i++){
					if(cl.get(i).getSex().equals("Ů")){
						total1++;
					
					}else if(cl.get(i).getSex().equals("��")){
						total2++;	
					}			
				}
				System.out.println("ŮԱ����"+total1);
				System.out.println("��Ա����"+total2);
				
				/**
				 * �ҳ���������Ա��
				 */
//				System.out.println("**************************");
//				System.out.println("�ù�˾��������Ա����");
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
				System.out.println("����Ա����:"+cl.get(num).getName());
			}
		}	
	
			
	
	
	


