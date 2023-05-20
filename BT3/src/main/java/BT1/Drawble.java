package BT1;

class Drawable {
    public static void draw(IHinhHoc hinhHoc) {
        if (hinhHoc instanceof HinhVuong) {
            HinhVuong hinhVuong = (HinhVuong) hinhHoc;
            System.out.println("Vẽ ra HinhVuong[cạnh = " + hinhVuong.getCanh() + "]");
        } else if (hinhHoc instanceof HinhTron) {
            HinhTron hinhTron = (HinhTron) hinhHoc;
            System.out.println("Vẽ ra HinhTron[bán kính = " + hinhTron.getBanKinh() + "]");
        }
    }
}

