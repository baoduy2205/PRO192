
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SinhVien extends Person {

    private Map<Integer, List<String>> danhsachchuyenNganh;

    public SinhVien(String email, String hoVaTen, int namSinh, String gioiTinh, String sodienThoai, String diaChi) {
        super(email, hoVaTen, namSinh, gioiTinh, sodienThoai, diaChi);

        danhsachchuyenNganh = new HashMap<Integer, List<String>>();
    }

    public void themchuyenNganh(Integer chuyenNganh, List<String> danhsachmonHoc) {
        this.danhsachchuyenNganh.put(chuyenNganh, danhsachmonHoc);
    }

    public void hienThiDanhSachMonHocTheoChuyenNganh() {
        for (Map.Entry<Integer, List<String>> entry : danhsachchuyenNganh.entrySet()) {
            System.out.println("Chuyên ngành: " + entry.getKey());
            System.out.println("Danh sách môn học: ");
            for (String monHoc : entry.getValue()) {
                System.out.println(monHoc);
            }
            System.out.println();
        }

    }

}
