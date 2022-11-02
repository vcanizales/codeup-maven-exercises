import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

//public static boolean isNumeric(CharSequence cs) {
//        if (isEmpty(cs)) {
//        return false;
//        } else {
//        int sz = cs.length();
//
//        for(int i = 0; i < sz; ++i) {
//        if (!Character.isDigit(cs.charAt(i))) {
//        return false;
//        }
//        }
//
//        return true;
//        }
//        }

public class MavenExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Something: ");
        String userInput = sc.nextLine();
        System.out.println("You entered: " + userInput);

        //Checks if it's a number
        if(!StringUtils.isNumeric(userInput)) {
            System.out.printf("%s is not a number%n", userInput);
        } else {
            System.out.printf("%s is a number%n", userInput);
        }
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));
    }
}
