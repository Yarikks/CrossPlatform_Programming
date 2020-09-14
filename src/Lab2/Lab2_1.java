package Lab2;

import java.util.Scanner;

public class Lab2_1 {

    public static void main(String[] args) throws Exception {
        System.out.println("Write an expression:");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double result = Result(input);
        System.out.println(result);
        while (true){

            String nextInput = scan.nextLine();
            System.out.println(NextResult(nextInput, result));
            result = NextResult(nextInput, result);
        }
    }

    private static double NextResult(String inputText, double firstNum) throws Exception {
        String input = inputText.replaceAll("\\s+", "");
        String operator = input.replaceAll("[0-9]","");
        double secondNum = Double.parseDouble(input.replaceAll("[^0-9]", ""));

        return Calculation(operator, firstNum, secondNum );
    }

    private static double Result(String inputText) throws Exception {
        String input = inputText.replaceAll("\\s+", "");
        String operator = input.replaceAll("[0-9]","");
        String[] elements = input.split("\\p{Punct}");

        double firstNum = Double.parseDouble(elements[0]);
        double secondNum = Double.parseDouble(elements[1]);

        return Calculation(operator, firstNum, secondNum);
    }

    private static double Calculation(String operator, double firstNum, double secondNum) throws Exception {
        switch (operator){
            case "+": return firstNum + secondNum;
            case "-": return firstNum - secondNum;
            case "*": return firstNum * secondNum;
            case "/":
                if(firstNum == 0 | secondNum == 0){
                    throw new Exception("Divide by zero");
                }
                else{
                    return firstNum / secondNum;
                }
            case "^": return Math.pow(firstNum, secondNum);
            default: throw new Exception("Input operator is not found.");
        }
    }
}
