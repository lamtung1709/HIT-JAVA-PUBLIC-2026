import java.util.Scanner;

public class CongNgauNhien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so b: ");
        int b = sc.nextInt();
        System.out.print("Nhap so c: ");
        int c = sc.nextInt();
        sc.nextLine();

        System.out.println(a + " + " + b + " = " + c);

        String input = sc.nextLine();

        boolean dung = (a + b == c);

        if ((dung && input.equalsIgnoreCase("phép tính đúng")) ||
                (!dung && input.equalsIgnoreCase("phép tính sai"))) {
            System.out.println("Bạn đã trả lời đúng");
        } else {
            System.out.println("Bạn đã trả lời sai");
        }
    }
}