package belajar5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arrayAngka[] = {11,12,13,14,15,16,17,18,19,20};

        System.out.println(Arrays.toString(arrayAngka));

        System.out.println();

        for(int i=0;i<10;i++){
            System.out.println("indek ke - " + i + " adalah " + arrayAngka[i]);
        }

        System.out.println();

        for(int i=0;i<arrayAngka.length;i++){
            System.out.println("indek ke - " + i + " adalah " + arrayAngka[i]);
        }

        System.out.println();

        for(int angka : arrayAngka){
            System.out.println(angka);
        }
    }
}