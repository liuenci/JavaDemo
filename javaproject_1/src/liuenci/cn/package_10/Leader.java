package liuenci.cn.package_10;

import java.util.Date;

/**
 * Created by 刘 on 2017/6/2.
 */
public class Leader extends Student {
    //定义职位
    private String grade;
    //定义工龄
    private int year;

    public Leader(int studentNum, String sex, String name, Date date, String grade, int year) {
        super(studentNum, sex, name, date);
        this.grade = grade;
        this.year = year;
    }

    //定义setter和getter方法
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println("姓名:"+super.getName());
        System.out.println("学号:"+super.getStudentNum());
        System.out.println("性别:"+super.getSex());
        System.out.println("生日:"+super.getDate());
        System.out.println("职位:"+grade);
        System.out.println("工龄:"+year);
    }
}
