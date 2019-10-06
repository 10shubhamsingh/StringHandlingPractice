package assignment;
import java.util.Scanner;
public class Answer3 {
    public static void main(String args[]){

        Scanner str = new Scanner(System.in);
        String string = str.nextLine();
        string = string.toLowerCase();

        string = string.replace('a','*');
        string = string.replace('e','*');
        string = string.replace('i','*');
        string = string.replace('o','*');
        string = string.replace('u','*');
        System.out.println(string);

    }

}


