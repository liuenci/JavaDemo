package package_1;

import java.util.Scanner;

/**
 * Created by �� on 2017/5/28.
 */
public class Main {
    //����һ
    public void firstSell() {
        System.out.println("��������һ̨��");
    }

    //������
    public void secondSell() {
        System.out.println("����������Ҫ�ĳ���");
        Scanner input = new Scanner(System.in);
        String carName = input.next();
    }

    public static void main(String[] args) {
        Car car1 = new Car("��Խ", 10001);
        car1.setCarName("��Խ");
        Car car2 = new Car(10002, "����");
        car2.setCarName("����");
        Seller seller = new Seller("���ϸ�");
        System.out.println("=========================");
        System.out.println("=����һ:����������      =");
        System.out.println("=������:����������      =");
        System.out.println("=========================");
        System.out.println("=��ѡ����ķ���:��1/2��:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num == 1) {
            System.out.println(seller.getName() + "������һ����");
        } else if (num == 2) {
            System.out.println("����������Ҫ��ĳ���:");
            String carName = input.next();
            if (carName.equals(car1.getCarName())) {
                System.out.println("����Ҫ���������:");
                int number1 = input.nextInt();
                System.out.println("������:" + seller.getName());
                System.out.println("����:" + car1.getCarName());
                System.out.println("���:" + car1.getCoding());
                System.out.println("����:" + number1);
            } else if (carName.equals(car2.getCarName())) {
                System.out.println("����Ҫ���������:");
                int number2 = input.nextInt();
                System.out.println("������:" + seller.getName());
                System.out.println("����:" + car2.getCarName());
                System.out.println("���:" + car2.getCoding());
                System.out.println("����:" + number2);
            } else {
                System.out.println("�������");
            }
        } else {
            System.out.println("û���������۷�ʽ!");
        }
    }
}
