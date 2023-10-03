import java.util.Scanner;

public class Person {
  private String email;
    private String hovaTen;
    private int namSinh;
    private String gioiTinh;
    private String sodienThoai;
    private String diaChi;

    public Person(String email, String hovaTen, int namSinh, String gioiTinh, String sodienThoai, String diaChi) {
        this.email = email;
        this.hovaTen = hovaTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.sodienThoai = sodienThoai;
        this.diaChi = diaChi;
    }
    public void hienThiThongTin() {
        System.out.println("Email: " + email);
        System.out.println("Họ và tên: " + hovaTen);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Số điện thoại: " + sodienThoai);
        System.out.println("Địa chỉ: " + diaChi);
    }


    public void thayDoiSoDienThoai(String soDienThoaiMoi) {
        this.sodienThoai = soDienThoaiMoi;
    }

    public void thayDoiDiaChi(String diaChiMoi) {
        this.diaChi = diaChiMoi;
}
}
