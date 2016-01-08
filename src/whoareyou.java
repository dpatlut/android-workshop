
import java.util.Scanner;

/**
 * Created by dpatlut on 1/2/16.
 */
public class whoareyou {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String userName = input.nextLine();


        System.out.println("Enter Your Age");
        int userAge = input.nextInt();

        System.out.println(userAge + userName);
    }
}
