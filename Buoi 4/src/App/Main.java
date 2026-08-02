package App;
import Model.ElectronicToy;
import Model.PlushToy;
import Model.Toy;
public class Main {
    public static void main(String[] args){
        Toy[] storeToys= new Toy[3];
        storeToys[0]= new Toy("H20", "Bo do choi lap ghep",  300000.0,  500);
        storeToys[1]= new ElectronicToy("ELV02", "Xe dieu khien tu xa", 500000.0, 500, 3);
        storeToys[2]= new PlushToy("PS036", "Gau bong cute", 250000.0, 6736, "Vai, bong gon");
        System.out.println("Danh sach san pham cua cua hang do choi: ");
        for(Toy toy: storeToys){
            toy.printInfo();
            System.out.println();
        }
    }
}
