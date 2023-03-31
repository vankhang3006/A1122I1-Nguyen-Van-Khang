package models;

public abstract class Facility {
    private String tenDichVu ;
    private double dienTichSuDung;
    private double chiPhiThue;
    private int soLuongNguoi;
    private String kieuThue;
    String[] kieu = {"theo năm", "theo tháng", "theo ngày", "theo giờ"};
    public Facility() {
    }

    public Facility(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi, String kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoi = soLuongNguoi;
        this.kieuThue = kieuThue;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoi() {
        return soLuongNguoi;
    }

    public void setSoLuongNguoi(int soLuongNguoi) {
        this.soLuongNguoi = soLuongNguoi;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        while (kieuThue != "theo năm" || kieuThue != "theo tháng" || kieuThue != "theo ngày" || kieuThue != "theo giờ" ){
            System.out.println("Nhập sai rồi, xin mời nhập lại!");;
        }
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "tên dịch vụ='" + tenDichVu + '\'' +
                ", diện tích sử dụng=" + dienTichSuDung +
                ", chi phí thuê=" + chiPhiThue +
                ", số lượng người=" + soLuongNguoi +
                ", kiểu thuê='" + kieuThue + '\'' +
                '}';
    }
}
