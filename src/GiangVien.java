
import java.util.ArrayList;
import java.util.Scanner;
public class GiangVien extends Person  {
        private ArrayList<String> danhsachmonHoc;

        GiangVien(String email, String hovaTen, int namSinh, String gioiTinh, String sodienThoai, String diaChi) {
            super(email, hovaTen, namSinh, gioiTinh, sodienThoai, diaChi);
            danhsachmonHoc = new ArrayList<>();
        }

        public void themmonHoc() {
            String monhocThem;
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Nhập số lượng môn học cần thêm: ");
            int soLuong1 = sc1.nextInt();
            sc1.nextLine();
            for (int i = 0; i < soLuong1; i++) {
                System.out.println("Nhập tên môn thứ " + (i + 1) + " cần thêm: ");
                monhocThem = sc1.next();
                danhsachmonHoc.add(monhocThem);
            }
            System.out.println("Danh sách môn học sau khi thêm: ");
            for (String monHoc : danhsachmonHoc) {
                System.out.println(monHoc);
            }
        }

        public void hienthicacmonHoc() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập số lượng môn học: ");
            int soLuong = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < soLuong; i++) {
                System.out.println("Nhập tên môn thứ " + (i + 1) + ": ");
                String monHoc = sc.next();
                danhsachmonHoc.add(monHoc);
            }
            System.out.println("Danh sách môn học: ");
            for (String monHoc : danhsachmonHoc) {
                System.out.println(monHoc);
            }
        }


}
