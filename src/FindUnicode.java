import java.util.Scanner;

public class FindUnicode {

    public static int getUnicode(char a){
        int value = (int)a;
        return value;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char a = input.next().charAt(0);

        System.out.println("The Unicode for the character " + a + " is " + getUnicode(a));
    }
}
