package package_1;

import java.util.Scanner;

/**
 * Created by 刘 on 2017/5/28.
 */
public class Main {
    //方法一
    public void firstSell() {
        System.out.println("您购买了一台车");
    }

    //方法二
    public void secondSell() {
        System.out.println("请输入您想要的车型");
        Scanner input = new Scanner(System.in);
        String carName = input.next();
    }

    public static void main(String[] args) {
        Car car1 = new Car("凯越", 10001);
        car1.setCarName("凯越");
        Car car2 = new Car(10002, "君威");
        car2.setCarName("君威");
        Seller seller = new Seller("南南哥");
        System.out.println("=========================");
        System.out.println("=方法一:按车辆销售      =");
        System.out.println("=方法二:按车型销售      =");
        System.out.println("=========================");
        System.out.println("=请选择你的方法:（1/2）:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num == 1) {
            System.out.println(seller.getName() + "销售了一辆车");
        } else if (num == 2) {
            System.out.println("请输入你需要买的车型:");
            String carName = input.next();
            if (carName.equals(car1.getCarName())) {
                System.out.println("您需要购买的数量:");
                int number1 = input.nextInt();
                System.out.println("销售者:" + seller.getName());
                System.out.println("车型:" + car1.getCarName());
                System.out.println("编号:" + car1.getCoding());
                System.out.println("数量:" + number1);
            } else if (carName.equals(car2.getCarName())) {
                System.out.println("您需要购买的数量:");
                int number2 = input.nextInt();
                System.out.println("销售者:" + seller.getName());
                System.out.println("车型:" + car2.getCarName());
                System.out.println("编号:" + car2.getCoding());
                System.out.println("数量:" + number2);
            } else {
                System.out.println("输入错误");
            }
        } else {
            System.out.println("没有这种销售方式!");
        }
    }
}
