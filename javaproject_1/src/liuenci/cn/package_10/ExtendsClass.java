package liuenci.cn.package_10;

/**
 * Created by 刘 on 2017/6/2.
 */
public class ExtendsClass extends Extends {
    //定义级别
    private String grade;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 定义加班行为
     */
    public void overWork() {
        System.out.println("加班");
    }

    /**
     * 改写父类吃饭方法
     */
    public void eat(ExtendsClass person, String name) {
        person.setName(name);
        System.out.println("你妈叫" + person.getName() + "回家吃饭！");
    }
    public void drink(ExtendsClass person, String name) {
        person.setName(name);
        System.out.println("你妈叫" + person.getName() + "回家喝水！");
    }
}
