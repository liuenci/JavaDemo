package liuenci.cn.package_10;

import java.util.Date;

/**
 * Created by �� on 2017/6/2.
 */
public class Student {
    //����ѧ��
    private int studentNum;
    //�����Ա�
    private String sex;
    //��������
    private String name;
    //��������
    Date date;

    //�����вι��캯��
    public Student(int studentNum, String sex, String name, Date date) {
        this.studentNum = studentNum;
        this.sex = sex;
        this.name = name;
        this.date = date;
    }

    //����setter��getter����

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void print() {
        System.out.println("����:"+name);
        System.out.println("ѧ��:"+studentNum);
        System.out.println("�Ա�:"+sex);
        System.out.println("����:"+date);
    }
}
