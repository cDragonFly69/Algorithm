package GrammarPratice;

import java.util.Scanner;

public class doWhileFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        input =scanner.nextLine();
        System.out.println(input);
        do {
            System.out.println("Ò»Ö±Êä³ö");
        }while (input.equals("N"));
    }
}
