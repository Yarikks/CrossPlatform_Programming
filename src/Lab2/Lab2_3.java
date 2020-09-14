package Lab2;

import java.util.Scanner;

public class Lab2_3 {
    public static void main(String[] args){
        int[][] pixelArray = InitializeArray();
        OutputBlackPixels(pixelArray);
    }

    private static int[][] InitializeArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Write N of array(NxM):");
        int N = scan.nextInt();
        System.out.println("Write M of array(NxM):");
        int M = scan.nextInt();
        int[][] array = new int[N][M];
        for(int i=0;i<N;i++){
            for(int j =0;j<M;j++){
                System.out.println("Write (" + i + "," + j + ") element.");
                System.out.println("0 - is black pixel, 1 - is white pixel");
                array[i][j] = scan.nextInt();
            }
        }
        return array;
    }

    private static void OutputBlackPixels(int[][] pixelArray){
        for (int i=0;i<pixelArray.length;i++){
            for(int j=0;j<pixelArray[0].length; j++){
                if(pixelArray[i][j] == 0){
                    System.out.print("("+i+","+j+"), ");
                }
            }
            System.out.println();
        }
    }
}
