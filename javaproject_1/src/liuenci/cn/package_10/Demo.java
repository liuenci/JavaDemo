package liuenci.cn.package_10;

import java.util.Date;

/**
 * Created by �� on 2017/6/2.
 */
public class Demo {
    public static void main(String[] args) {
//        ExtendsClass person = new ExtendsClass();
//        person.eat();
//        person.sleep();
//        person.drink();
//        person.eat(person,"�ܴ��");
//        person.drink(person, "�ܴ��");
        Leader l = new Leader(8300309,
                "��",
                "�ܴ��",
                new Date(),
                "ϵͳ�ܹ�ʦ",
                5 );
        l.print();
        System.out.println("=======================================================");
        Date date = java.sql.Date.valueOf("1997-03-18");
        Student student = new Student(1, "��", "������", date);
        student.print();
    }
}
