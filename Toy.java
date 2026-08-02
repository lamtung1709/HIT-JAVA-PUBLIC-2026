package Model;

public class Toy {
    private String id;
    private String name;
    private double cost;
    private int quantity;

    public Toy(String id, String name, double cost, int quantity) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;

    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost() {
        if (cost <= 0) {
            System.out.println("Do choi phai co gia cu the");
        } else {
            this.cost = cost;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity() {
        if (quantity < 0) {
            System.out.println("So luong hang trong kho khong hop le");
        } else {
            this.quantity = quantity;
        }
    }

    public double caculateDiscount() {
        return 0;
    }

    public void printInfo() {
        System.out.println("THONG TIN CUA SAN PHAM:");
        System.out.println("Ma do choi: " + id);
        System.out.println("Ten do choi: " + name);
        System.out.println("Gia cua do choi: " + cost + " VND");
        System.out.println("So luong con lai trong kho: " + quantity + " sp");
    }

}

