package BT2;

public interface ITinhToan<T> {
    T cong(T... args);
    T tru(T... args);
    T nhan(T... args);
    T chia(T... args);
}
