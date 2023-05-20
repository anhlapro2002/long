package BT2;


public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PhanSo cong(PhanSo other) {
        int tu = this.tuSo * other.mauSo + other.tuSo * this.mauSo;
        int mau = this.mauSo * other.mauSo;
        return new PhanSo(tu, mau);
    }

    public PhanSo tru(PhanSo other) {
        int tu = this.tuSo * other.mauSo - other.tuSo * this.mauSo;
        int mau = this.mauSo * other.mauSo;
        return new PhanSo(tu, mau);
    }

    public PhanSo nhan(PhanSo other) {
        int tu = this.tuSo * other.tuSo;
        int mau = this.mauSo * other.mauSo;
        return new PhanSo(tu, mau);
    }

    public PhanSo chia(PhanSo other) {
        int tu = this.tuSo * other.mauSo;
        int mau = this.mauSo * other.tuSo;
        return new PhanSo(tu, mau);
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}


