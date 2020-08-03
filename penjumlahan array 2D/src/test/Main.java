package test;

public class Main{
    public static void main(String[] args) {
        int array1[][] = {
            {1,2,3,4,5},
            {6,7,8,9,0}
        };
        int array2[][] = {
            {4,2,3,7,9},
            {1,2,3,6,7}
        };

        printArray(array1);
        System.out.println("");
        printArray(array2);
        System.out.println("--------------------- + ");
        jumlahArray(array1, array2);
    }

    private static void jumlahArray(int value1[][], int value2[][]){
        for(int i=0;i<value1.length;i++){
            System.out.print("[");
            for(int j=0;j<value1[i].length;j++){
                System.out.print(" ");
                System.out.print((value1[i][j] + value2[i][j]) + " ");
            }
            System.out.println("]");
        }
    }

    private static void printArray(int value[][]){
        for(int i=0;i<value.length;i++){
            System.out.print("[");
            for(int j=0;j<value[i].length;j++){
                System.out.print(" " + value[i][j] + " ");
            }
            System.out.println("]");
        }        
    }
}
