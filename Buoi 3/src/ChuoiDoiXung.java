import java.util.Scanner;

public class ChuoiDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String dao = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            dao = dao + s.charAt(i);
        }

        if (s.equals(dao)) {
            System.out.println(s.toUpperCase() + " chuỗi này đối xứng");
        } else {
            System.out.println(s.toLowerCase() + " chuỗi này không đối xứng");
        }
    }
}