package belajar6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arrayAngka1[] = {1,2,3,4,5};

        // merubah array menjadi string
        System.out.println("\nmerubah array menjadi string\n===================");
        print(arrayAngka1);

        System.out.println("\nmengkopy array\n===================");
        int arrayAngka2[] = new int[5];
        print(arrayAngka1);
        print(arrayAngka2);

        System.out.println("\nmengkopy array dengna looping\n===================");
        for(int i=0;i<arrayAngka1.length;i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        print(arrayAngka1);
        System.out.println(arrayAngka1);
        print(arrayAngka2);
        System.out.println(arrayAngka2);

        System.out.println("\nmengkopy dengan copyOf\n===================");
        int arrayAngka3[] = Arrays.copyOf(arrayAngka1,3);
        print(arrayAngka1);
        System.out.println(arrayAngka1);
        print(arrayAngka3);
        System.out.println(arrayAngka3);

        System.out.println("\nmengkopy dengan copyOfRange\n===================");
        int arrayAngka4[] = Arrays.copyOfRange(arrayAngka1,2,arrayAngka1.length);
        print(arrayAngka1);
        System.out.println(arrayAngka1);
        print(arrayAngka4);
        System.out.println(arrayAngka4);

        // fill array
        System.out.println("\nfill array\n===================");
        int arrayAngka5[] = new int[10];
        print(arrayAngka5);
        Arrays.fill(arrayAngka5, 5);
        print(arrayAngka5);

        // komparasi array
        System.out.println("\nkomparasi array\n===================");
        int arrayAngka6[] = {1,2,3,4,5};
        int arrayAngka7[] = {1,2,3,6,5};

        if(Arrays.equals(arrayAngka6, arrayAngka7)){
            System.out.println("array ini sama");
        }else{
            System.out.println("array ini tidak sama");
        }

        System.out.println("\nmengecek array mana yang lebih besar\n===================");
        System.out.println(Arrays.compare(arrayAngka6, arrayAngka7));

        System.out.println("\nmengecek index mana yang lebih besar\n===================");
        System.out.println(Arrays.mismatch(arrayAngka6, arrayAngka7));
    
        // sort array
        System.out.println("\nsort array\n===================");
        int arrayAngka8[] = {1,3,2,5,7,8,5,4,6};
        print(arrayAngka8);
        Arrays.sort(arrayAngka8);
        print(arrayAngka8);

        // search array
        System.out.println("\nsearch array\n===================");
        int angka = 4;
        int posisi = Arrays.binarySearch(arrayAngka8, angka);
        System.out.println("angka " + angka + " ada di index ke " + posisi);
    }
    private static void print(int data[]){
        System.out.println("array --> " + Arrays.toString(data));
    }
}