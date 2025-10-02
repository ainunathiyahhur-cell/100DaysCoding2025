public class day25 {
    public static void main(String[] args) {
        int x = 10;

        System.out.println("Nilai awal x = " + x);
        x++; // post-increment
        System.out.println("Setelah x++ = " + x);

        System.out.println("Setelah ++x = " + x);

        x--; // post-decrement
        System.out.println("Setelah x-- = " + x);

        --x; // pre-decrement
        System.out.println("Setelah --x = " + x);
    }
}