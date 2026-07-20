import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TinhKhoangCach {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap x1: ");
        int x1= Integer.parseInt(sc.nextLine());

        System.out.print("Nhap y1: ");
        int y1= Integer.parseInt(sc.nextLine());

        System.out.print("Nhap x2: ");
        int x2= Integer.parseInt(sc.nextLine());

        System.out.print("Nhap y2: ");
        int y2= Integer.parseInt(sc.nextLine());

        double kc= Math.sqrt(Math.pow(x1- x2, 2)+Math.pow(y1-y2,2));

        System.out.printf("Khoang cach giua hai diem la %.2f dv.%n", kc);

    }
}