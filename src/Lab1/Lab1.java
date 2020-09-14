package Lab1;

import java.util.Scanner;

public class Lab1 {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name");
        String name = scanner.next();
        String reverse = "";
        for(int i = name.length() - 2; i >= 0; i--){
            reverse += name.substring(i, i+1);
        }
        reverse = name.substring(name.length() - 1, name.length()).toUpperCase()
                + reverse.toLowerCase();
        System.out.println("Then my name is " + reverse);
    }
}
