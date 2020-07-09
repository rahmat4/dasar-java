package belajar7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arrayAngka1[] = {1,5,3,6,7,2,4};
        int arrayAngka2[] = {3,4,1,12,5,15,9};
        
        // menjumlahkan dua buah array
        System.out.println("\nmenjumlahkan dua buah array");
        print(arrayAngka1);
        print(arrayAngka2);
        print(tambahArray(arrayAngka1, arrayAngka2));

        // menggabungkan dua buah array
        System.out.println("\nmenggabungkan dua buah array");
        int arrayHasil1[] = new int[arrayAngka1.length + arrayAngka2.length];
        for(int i=0;i<arrayAngka1.length;i++){
            arrayHasil1[i] = arrayAngka1[i];
        }
        
        for(int i=0;i<arrayAngka2.length;i++){
            arrayHasil1[i + arrayAngka1.length] = arrayAngka2[i];
        }
        print(arrayHasil1);

        // sort reverse, mengurutkan tapi kebalik
        System.out.println("\nsort reverse1");
        print(arrayAngka1);
        sortReverse1(arrayAngka1);
        print(arrayAngka1);

        System.out.println("\nsort reverse2");
        print(arrayAngka2);
        sortReverse2(arrayAngka2);
        print(arrayAngka2);
    }

    private static void sortReverse2(int data[]){
        Arrays.sort(data);
        int buffer;
        for(int i=0;i<data.length/2;i++){
            buffer = data[i];
            data[i] = data[(data.length-1)-i];
            data[(data.length-1)-i] = buffer;
        }
    }

    private static void sortReverse1(int data[]){
        Arrays.sort(data);
        int arrayBuffer[] = Arrays.copyOf(data, data.length);
        for(int i=0;i<data.length;i++){  
            data[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }
    }

    private static int[] tambahArray(int array1[] , int array2[]){
        int arrayHasil[] = new int[array1.length];
        for(int i=0;i<array1.length;i++){
            arrayHasil[i] = array1[i] + array2[i];
        }
        return arrayHasil;
    }

    private static void print(int data[]){
        System.out.println("array --> " + Arrays.toString(data));
    }
}