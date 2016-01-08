/**
 * Created by dpatlut on 1/2/16.
 */
import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Giv me yo first numba");
        int num1 = input.nextInt();
        input.nextLine();
        System.out.println("Giv me yo second numba");
        int num2 = input.nextInt();
        input.nextLine();
        System.out.println("Giv me yo third numba");
        int num3 = input.nextInt();
        input.nextLine();
        int answer = multiply(num1,num2,num3);
        System.out.println(answer);
        System.out.println("Good Job Yo , You so smaaat");
    }
    public static int multiply(int x,int y,int z){
        int answer = x*y*z;
        return answer;
    }
}
