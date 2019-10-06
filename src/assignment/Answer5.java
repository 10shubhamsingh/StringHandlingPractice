package assignment;


import java.util.Scanner;

public class Answer5 {


    public static void main(String args[]){

        Scanner str = new Scanner(System.in);



        System.out.printf("Enter  String Value : ");

        String stringInput = str.nextLine();

        System.out.printf("Enter Value of subString : ");

        String subStringInput = str.nextLine();

        System.out.printf("Enter the  value to be replace : ");

        String subStringInputForReplacement = str.nextLine();



        String newString = stringInput.replace(subStringInput,subStringInputForReplacement);

        System.out.println("New String : " + newString);





    }

}
