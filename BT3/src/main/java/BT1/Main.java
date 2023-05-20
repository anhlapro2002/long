package BT1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HinhVuong hinhVuong = new HinhVuong(5);
        HinhTron hinhTron = new HinhTron(50);

        double chuViHinhVuong = hinhVuong.tinhChuVi();
        double dienTichHinhVuong = hinhVuong.tinhDienTich();
        System.out.println("Chu vi HinhVuong: " + chuViHinhVuong);
        System.out.println("Diện tích HinhVuong: " + dienTichHinhVuong);

        double chuViHinhTron = hinhTron.tinhChuVi();
        double dienTichHinhTron = hinhTron.tinhDienTich();
        System.out.println("Chu vi HinhTron: " + chuViHinhTron);
        System.out.println("Diện tích HinhTron: " + dienTichHinhTron);

        Drawable.draw(hinhVuong);
        Drawable.draw(hinhTron);
    }
}
