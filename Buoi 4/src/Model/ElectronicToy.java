package Model;

public class ElectronicToy extends Toy {
    private int warranty;

    public ElectronicToy(String id, String name, double cost, int quantity, int warranty) {
        super(id, name, cost, quantity);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public double caculateDiscount() {
        if (getCost() >= 500.0) {
            return getCost() * 0.05;
        }
        return 0;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("San pham duoc bao hanh: " + warranty + " thang");
        System.out.println("So tien duoc giam la: " + caculateDiscount() + " thang");
    }
}
