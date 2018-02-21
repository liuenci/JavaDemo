package liuenci.cn.package_10;

import java.util.Date;

/**
 * Created by 刘 on 2017/6/2.
 */
public class Demo {
    public static void main(String[] args) {
//        ExtendsClass person = new ExtendsClass();
//        person.eat();
//        person.sleep();
//        person.drink();
//        person.eat(person,"熊大大");
//        person.drink(person, "熊大大");
        Leader l = new Leader(8300309,
                "男",
                "熊大大",
                new Date(),
                "系统架构师",
                5 );
        l.print();
        System.out.println("=======================================================");
        Date date = java.sql.Date.valueOf("1997-03-18");
        Student student = new Student(1, "男", "刘恩赐", date);
        student.print();
    }
}
