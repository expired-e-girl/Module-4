import java.util.*;

public class FindAscii {

    public static char convertAscii(int x){
        return (char)x;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an ASCII code: ");
        int x = input.nextInt();

        System.out.println("The character for ASCII code " + x + " is " + convertAscii(x));
    }
}
