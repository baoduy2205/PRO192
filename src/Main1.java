
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Person sinhvien = new Person("hovaten_mssv@fpt.edu.vn", "Họ và tên", 2004, "Giới tính", "Số điện thoại",
                "Địa chỉ");

        GiangVien gv = new GiangVien("yassinebmy@fpt.edu.vn", "Bechmeida Mohamed Yassine", 1990, "Nam", "0123456789", "Quy Nhơn");

        SinhVien sv = new SinhVien("duylvbqe180054@fpt.edu.vn", "Le Vo Bao Duy", 2004, "Nam", "0386400605",
                "Hoài Nhơn - Bình Định");

        int choice, flag = 1;
        while (flag == 1) {
            System.out.println("Chào mừng đến với MENU");
            System.out.println("------------------------");
            System.out.println("1. Hiển thị thông tin.");
            System.out.println("2. Thay đổi số điện thoại và địa chỉ.");
            System.out.println("3. Hiển thị các môn và thêm môn học.");
            System.out.println("4. Hiển thị các môn học theo chuyên ngành.");
            System.out.println("0. Kết thúc chương trình.");
            System.out.println("------------------------");
            System.out.println("Nhập sự lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {

                case 1:

                    sinhvien.hienThiThongTin();
                    System.out.println();
                    break;

                case 2:

                    sinhvien.thayDoiSoDienThoai("0386400605");
                    sinhvien.thayDoiDiaChi("Quy Nhơn");
                    System.out.println("\nThông tin sau khi cập nhật: ");
                    sinhvien.hienThiThongTin();
                    System.out.println();
                    break;

                case 3:

                    gv.hienthicacmonHoc();
                    System.out.println();
                    gv.themmonHoc();
                    System.out.println();
                    break;

                case 4:

                    sc.nextLine();
                    List<String> chuyenNganh1 = Arrays.asList("PRF192", "MAE101", "CEA201", "CSI104", "SSL101c");
                    sv.themchuyenNganh(1, chuyenNganh1);

                    List<String> chuyenNganh2 = Arrays.asList("PRO192", "MAD101", "OSG202", "SSG104", "NWC203c");
                    sv.themchuyenNganh(2, chuyenNganh2);

                    sv.hienThiDanhSachMonHocTheoChuyenNganh();
                    break;
                default:
                    flag = 0;
            }
        }
    }
}

