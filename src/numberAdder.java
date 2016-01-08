import java.util.Scanner;

/**
 * Created by dpatlut on 1/2/16.
 */
public class numberAdder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int firstNum = input.nextInt();
        input.nextLine();
        System.out.println("Enter your second number");
        int secondNum = input.nextInt();
        System.out.println(firstNum + secondNum);

        for(int i=0;i<5;i++){
            System.out.println("GET IN DA CHOPA!");
        }

        getNumber();
    }

    static int getNumber(){
        return 4;
    }
}
