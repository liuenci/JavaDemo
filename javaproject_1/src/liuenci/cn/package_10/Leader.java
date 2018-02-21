package liuenci.cn.package_10;

import java.util.Date;

/**
 * Created by �� on 2017/6/2.
 */
public class Leader extends Student {
    //����ְλ
    private String grade;
    //���幤��
    private int year;

    public Leader(int studentNum, String sex, String name, Date date, String grade, int year) {
        super(studentNum, sex, name, date);
        this.grade = grade;
        this.year = year;
    }

    //����setter��getter����
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
        System.out.println("����:"+super.getName());
        System.out.println("ѧ��:"+super.getStudentNum());
        System.out.println("�Ա�:"+super.getSex());
        System.out.println("����:"+super.getDate());
        System.out.println("ְλ:"+grade);
        System.out.println("����:"+year);
    }
}
