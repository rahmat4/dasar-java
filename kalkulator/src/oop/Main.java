package oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        double a,b,hasil = 0;
        char c;

        System.out.println("kalkulator");
        System.out.print("masukan angka : "); a = user.nextDouble();
        System.out.print("masukan operator +,-,*,/ : "); c = user.next().charAt(0);
        System.out.print("masukan angka : "); b = user.nextDouble();

        System.out.print("\nhasil dari " + a + " " + c + " " + b + " = ");

        if(c == '+'){
            hasil = a + b;
        }else if(c == '-'){
            hasil = a - b;
        }else if(c == '*'){
            hasil = a * b;
        }else if(c == '/'){
            hasil = a / b;
        }else{
            System.out.println("operator tidak ada!!!");
        }

        System.out.print(hasil + "\n\n");
    }
}