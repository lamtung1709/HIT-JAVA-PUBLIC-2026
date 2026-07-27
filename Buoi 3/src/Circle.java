import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Ban kinh cua hinh tron la: ");
        double r=Double.parseDouble(sc.nextLine());
        double pi=3.14;
        double cv=2*pi*r;
        double s=pi*r*r;
        if(r<=0 || r>=100) {
            System.out.print("Gia tri ban kinh khong hopw le");
        } else {
            System.out.printf("%.3f, %.3f", cv, s);
        }
    }
}