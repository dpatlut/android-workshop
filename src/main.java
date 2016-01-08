import java.util.Scanner;

/**
 * Created by dpatlut on 1/2/16.
 */
public class main {
    public static void main(String[] args){
//        String message = "Hello World";
//        System.out.println(message);
        System.out.println("Enter SOmething");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String Sentance =  name + " is cool";
        System.out.println(Sentance);
    }

}
