package liuenci.cn.package_10;

import java.util.Date;

/**
 * Created by 刘 on 2017/6/2.
 */
public class Student {
    //定义学号
    private int studentNum;
    //定义性别
    private String sex;
    //定义名字
    private String name;
    //定义生日
    Date date;

    //定义有参构造函数
    public Student(int studentNum, String sex, String name, Date date) {
        this.studentNum = studentNum;
        this.sex = sex;
        this.name = name;
        this.date = date;
    }

    //定义setter和getter方法

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
        System.out.println("姓名:"+name);
        System.out.println("学号:"+studentNum);
        System.out.println("性别:"+sex);
        System.out.println("生日:"+date);
    }
}
