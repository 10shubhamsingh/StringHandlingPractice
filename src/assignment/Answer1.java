package assignment;


import java.util.Scanner;

public class Answer1 {

    public static void main(String[] args){

        Scanner str = new Scanner(System.in);

        String string = str.nextLine();

        int len = string.length();

        System.out.println(string);

        System.out.print("index :");

        for (int i = 0; i < len ; i++) {

            System.out.printf("%4d",i);

        }

        System.out.print("\nchars :");

        for (int i = 0; i < len ; i++) {

            System.out.printf("%4s",string.charAt(i));

        }
        }
    }


