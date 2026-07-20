import java.util.Scanner;
public class KiemTraMatKhau {
    public static void main(String[] ags) {
        Scanner sc= new Scanner (System.in);

        System.out.print("Nhap mat khau: ");
        String pass= sc.nextLine();

        String boKhoangTrong = pass.trim();
        int length= boKhoangTrong.length();

        boolean hasDigit = false;
        boolean hasUpper = false;

        for (int i=0; i<length; i++) {
            char c = boKhoangTrong.charAt(i);
            if (c >= '0' && c <= '9') {
                hasDigit = true;
            }
            if (c >= 'A' && c <= 'Z') {
                hasUpper = true;
            }
            if (hasDigit && hasUpper) {
                break;
            }
        }
            boolean isValid= true;
            if(length <8) {
                    System.out.println("Mau khau phai co do dai toi thieu la 8 ki tu");
                    isValid = false;
            }
                if(!hasDigit){
                        System.out.println("Mat khau phai co it nhat 1 so");
                        isValid = false;
                }
                if(!hasUpper){
                        System.out.println("Mat khau phai co it nhat 1 chu viet hoa");
                        isValid= false;
            }
                if(isValid) {
                    System.out.println("Mat khau hop le");
                }
                else {
                    System.out.println("Mau khau khong hop le");
                }
    }
}
