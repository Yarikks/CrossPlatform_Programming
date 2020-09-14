package Lab2;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args){
        System.out.println("Write an array of integers:");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int[] integers = ConvertStringToIntArray(input);
        CalculateLargestSequence(integers);
    }

    private static int[] ConvertStringToIntArray(String input){
        String clearInput = input.replaceAll("[a-zA-Z]", "");
        String[] numbers = clearInput.split("");
        int[] number = new int[numbers.length];
        for (int i=0;i< numbers.length;i++){
            number[i] = Integer.parseInt(numbers[i]);
        }
        return number;
    }

    private static void CalculateLargestSequence(int[] integers){
        int count = 1, max = 1;

        for (int i = 1; i < integers.length; i++) {
            if (integers[i] == integers[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > max) {
                max = count;
            }
        }

        System.out.println("The largest sequence is: " + max);
    }
}
