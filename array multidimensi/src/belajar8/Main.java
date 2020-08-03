package belajar8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array_2D[][] = {
            {1,2,3,4,5},
            {6,7,8,9,0},
            {6,4,1,7,9},
        };
        System.out.println("Tanpa looping");
        for(int i=0;i<array_2D.length;i++){
            System.out.println(Arrays.toString(array_2D[i]));
        }

        System.out.println();
        System.out.println("for biasa");
        for(int i=0;i<array_2D.length;i++){
            System.out.print("[");
            for(int j=0;j<array_2D[i].length;j++){
                System.out.print(array_2D[i][j] + ", ");
            }
            System.out.print("]\n");
        }
        
        // menggunakan foreach
        System.out.println();
        System.out.println("for each");
        for(int baris[] : array_2D){
            System.out.print("[ ");
            for(int angka : baris){
                System.out.print(angka + ", ");
            }
            System.out.print("]\n");
        }
   }
}
