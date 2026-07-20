import java.util.Scanner;

public class ChuanHoaNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập thông tin nhân viên: ");
        String input = sc.nextLine();

        input = input.trim();


        String[] parts = input.split("-");


        String maSo = parts[0].trim();
        String hoTenTho = parts[1].trim();
        String namSinhStr = parts[2].trim();
        String phongBan = parts[3].trim();


        String hoTenChuanHoa = "";


        hoTenTho = hoTenTho.toLowerCase();

        for (int i = 0; i < hoTenTho.length(); i++) {

            if (i == 0 || hoTenTho.charAt(i - 1) == ' ') {

                String chuCai = hoTenTho.substring(i, i + 1);
                hoTenChuanHoa = hoTenChuanHoa + chuCai.toUpperCase();
            } else {

                hoTenChuanHoa = hoTenChuanHoa + hoTenTho.charAt(i);
            }
        }


        while (hoTenChuanHoa.contains("  ")) {
            hoTenChuanHoa = hoTenChuanHoa.replace("  ", " ");
        }


        String phongBanLower = phongBan.toLowerCase();
        if (phongBanLower.contains("kỹ thuật") || phongBanLower.contains("ky thuat")) {
            System.out.println("Phân loại: Nhân viên kỹ thuật");
        } else {
            System.out.println("Phân loại: Nhân viên nghiệp vụ");
        }


        int namSinh = Integer.parseInt(namSinhStr);
        int tuoi = 2026 - namSinh;

        System.out.println("Mã nhân viên: " + maSo + " | Họ và tên: " + hoTenChuanHoa + " | Tuổi: " + tuoi + " | Bộ phận: " + phongBan);
    }
}