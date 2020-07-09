package belajar1;

public class Main {
    public static void main(String[] args) {
        
        byte a = 4;
        String a_bits;

        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d\n",a_bits,a);

    }
}