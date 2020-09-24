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
                array[i][j] = (int)Math.round(Math.random());
            }
        }
        return array;
    }

    private static void OutputBlackPixels(int[][] pixelArray){
        for (int i=0;i<pixelArray.length;i++){
            for(int j=0;j<pixelArray[0].length; j++){
                    System.out.print(pixelArray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=0;i<pixelArray.length;i++){
            for(int j=0;j<pixelArray[i].length; j++){
                if((i + 1 < pixelArray.length && j + 1 < pixelArray[i].length) & (i > 0 & j> 0)){
                    if(((pixelArray[i+1][j] == 0 | pixelArray[i][j+1] == 0) | (pixelArray[i-1][j] == 0 | pixelArray[i][j-1] == 0)) & pixelArray[i][j] == 0){
                        System.out.print("("+i+","+j+") ");
                    }
                    else{
                        System.out.print(" -   ");
                    }
                }
                else{
                    if(pixelArray[i][j] == 0 | pixelArray[i][j] == 0 & pixelArray[i][j]==0){
                        System.out.print("("+i+","+j+") ");
                    }
                    else{
                        System.out.print(" -   ");
                    }
                }

            }
            System.out.println();
        }
    }
}
