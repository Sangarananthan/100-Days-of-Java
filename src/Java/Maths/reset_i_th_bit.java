package Java.Maths;

public class reset_i_th_bit {
    public static void main(String[] args) {
        int n = 36;
        System.out.println(Integer.toBinaryString(n));
        reset(n, 3);
    }

    public static void reset(int n, int setbit) {
        int mask = (1 << setbit);
        n |= mask;
        System.out.println(Integer.toBinaryString(n));
    }
}
