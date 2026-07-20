import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("KQgiaithua = ");
        long m = 1;
        long TC=0;
        for (int i = 1; i <= n; i++) {
            m *= i;
            if(i%2==0) {
                TC+=i;
            }
        }
        System.out.println(m);
        System.out.print("Tong so chan = ");
        System.out.print(TC);
    }
}
