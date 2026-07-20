import java.util.Scanner;
public class QuanLyDiemSo {
    public static void main( String [] ags){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        int n= Integer.parseInt(sc.nextLine());

        double[] diem= new double[n];
        for(int i=0; i<n; i++){
            System.out.print("Nhap diem hoc sinh thu"+" "+ (i+1) + ": ");
            diem[i]=Double.parseDouble(sc.nextLine());
        }
        System.out.println("Diem cao nhat duoc ghi nhan la: " + maxPoint(diem));
        System.out.println("Diem trung binh cua lop la:"+ averagePoint(diem));
        System.out.println("So hoc sinh co diem duoi trung binh la: " + failedStudents(diem));
    }
    public static double maxPoint(double [] a){
        double max=a[0];
        for(int i=0; i<a.length; i++) {
            if(a[i]>max) {
                max=a[i];
            }
        }
        return max;
    }
    public static double averagePoint(double[] a) {
        double sum=0;
        for(int i=0; i<a.length; i++) {
            sum+=a[i];
        }
        return sum/a.length;
    }
    public static int failedStudents(double []a ) {
        int count=0;
        for(double d:a) {
            if(d<5.0) {
                count ++;
            }
        }
        return count;
    }
}
