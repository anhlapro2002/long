package BT2;

public class TinhToanPhanSo implements ITinhToan<PhanSo> {
    @Override
    public PhanSo cong(PhanSo... args) {
        PhanSo sum = args[0];
        for (int i = 1; i < args.length; i++) {
            sum = sum.cong(args[i]);
        }
        return sum;
    }

    @Override
    public PhanSo tru(PhanSo... args) {
        PhanSo result = args[0];
        for (int i = 1; i < args.length; i++) {
            result = result.tru(args[i]);
        }
        return result;
    }

    @Override
    public PhanSo nhan(PhanSo... args) {
        PhanSo product = args[0];
        for (int i = 1; i < args.length; i++) {
            product = product.nhan(args[i]);
        }
        return product;
    }

    @Override
    public PhanSo chia(PhanSo... args) {
        PhanSo result = args[0];
        for (int i = 1; i < args.length; i++) {
            result = result.chia(args[i]);
        }
        return result;
    }
}
