package package_1;

/**
 * Created by �� on 2017/5/28.
 */
public class Car {
    //���峵��
    private String carName;
    //������
    private int coding;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCoding() {
        return coding;
    }

    public void setCoding(int coding) {
        this.coding = coding;
    }

    public Car(String carName, int coding) {
        this.carName = carName;
        this.coding = coding;
    }

    public Car(int coding, String carName) {
        this.carName = carName;
        this.coding = coding;
    }
}
