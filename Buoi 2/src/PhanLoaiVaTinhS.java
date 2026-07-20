import java.util.Scanner;
public class PhanLoaiVaTinhS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap canh a: ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap canh b: ");
        int b = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap canh c: ");
        int c = Integer.parseInt(sc.nextLine());

        double p = (double) (a + b + c) / 2;
        double S = (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        if (a + b > c || a + c > b || b + c > a) {
            if (a == b && b == c) {
                System.out.println("Day la tam giac deu");
                System.out.printf("Chu vi cua tam giac la %.2f: %n", 2 * p);
                System.out.printf("Dien tich cua tam giac la %.2f: %n", S);
            } else if (a == b || a == c || b == c) {
                System.out.println("Day la tam giac can");
                System.out.printf("Chu vi cua tam giac la %.2f: %n", 2 * p);
                System.out.printf("Dien tich cua tam giac la %.2f: %n", S);
            } else if (Math.sqrt(a * a + b * b) == c || Math.sqrt(a * a + c * c) == b || Math.sqrt(b * b + c * c) == a) {
                System.out.println("Day la tam giac vuong");
                System.out.printf("Chu vi cua tam giac la %.2f: %n", 2 * p);
                System.out.printf("Dien tich cua tam giac la %.2f: %n", S);
            }
        } else {
            System.out.print("Ba canh tren khong hop thanh tam giac");
        }
    }
}

