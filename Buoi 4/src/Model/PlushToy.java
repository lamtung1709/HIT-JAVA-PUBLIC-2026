package Model;

public class PlushToy extends Toy {
    private String materials;

    public PlushToy(String id, String name, double cost, int quantity, String materials) {
        super(id, name, cost, quantity);
        this.materials = materials;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials() {
        this.materials = materials;
    }

    @Override
    public double caculateDiscount() {
        return getCost() * 0.1;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Chat lieu cua san pham: " + materials);
        System.out.println("So tien duoc giam la: " + caculateDiscount() + " VND");
    }
}
