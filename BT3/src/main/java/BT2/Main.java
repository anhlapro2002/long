package BT2;

public class Main {
    public static void main(String[] args) {
        TinhToanSoThuc tinhToanSoThuc = new TinhToanSoThuc();
        TinhToanPhanSo tinhToanPhanSo = new TinhToanPhanSo();

        double sumSoThuc = tinhToanSoThuc.cong(1.5, 2.5, 3.5);
        double productSoThuc = tinhToanSoThuc.nhan(2.0, 3.0, 4.0);
        System.out.println("Tổng số thực: " + sumSoThuc);
        System.out.println("Tích số thực: " + productSoThuc);

        PhanSo phanSo1 = new PhanSo(1, 2);
        PhanSo phanSo2 = new PhanSo(3, 4);
        PhanSo phanSo3 = new PhanSo(5, 6);
        PhanSo sumPhanSo = tinhToanPhanSo.cong(phanSo1, phanSo2, phanSo3);
        PhanSo productPhanSo = tinhToanPhanSo.nhan(phanSo1, phanSo2, phanSo3);
        System.out.println("Tổng phân số: " + sumPhanSo);
        System.out.println("Tích phân số: " + productPhanSo);
    }
}
