import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot nam bat ki: ");
        int Nam = Integer.parseInt(sc.nextLine());
        if (Nam % 400 == 0 || Nam % 4 == 0 && Nam % 100 != 0) {
            System.out.print("Nam nhuan");
        } else {
            System.out.print("Khong phai nam nhuan");
        }
    }
}
