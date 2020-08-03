package test;

public class Main{
    public static void main(String[] args) {
        int array1[][] = {
            {1,2,3,4,5},
            {6,7,8,9,0}
        };
        int array2[][] = {
            {4,2},
            {1,2},
            {3,3},
            {7,6},
            {9,7}
        };

        printArray(array1);
        System.out.println("");
        printArray(array2);
        System.out.println("--------------------- x");
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1[i].length;j++){
                for(int k=0;k<array1[j].length;k++){
                    System.out.print((array1[i][k] * array2[k][j]) + " ");
                }  
            }
            System.out.println("");
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
