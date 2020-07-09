package belajar3;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int fn, fn1,  fn2, n;
        fn2 = 1;
        fn1 = 0;
        fn = 0;
        System.out.println("Menghitung deret fibonacci");
        System.out.print("masukan fibonacci ke - : "); n = user.nextInt();
        for(int i=0 ;i <= n; i++){
            System.out.println("fibonacci dari " + i + " adalah " + fn);
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
        }

    }
}