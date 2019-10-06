package assignment;

import java.util.Scanner;

public class Answer2 {
    public static void main(String args[]) {

        Scanner str = new Scanner(System.in);
        System.out.printf("Enter String Value :        ");
        String string = str.nextLine();
        System.out.printf("Enter index for substring : ");
        int indexOfSubstring = str.nextInt();
        String substring = string.substring(indexOfSubstring);
        System.out.println("subString Value = " + substring);
    }
}

