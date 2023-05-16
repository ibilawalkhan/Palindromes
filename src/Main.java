import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 5 digit number: ");
        int num = input.nextInt();
        int temp = num;

        int remainder, sum = 0;
        
        while (num > 0) {
            remainder = num % 10;
            sum = (sum * 10) + remainder;
            num = num / 10;
        }



        if(sum == temp) {
            System.out.println("The given number is a palindrome");
        } else {
            System.out.println("The given number is not a palindrome");
        }

    }
}