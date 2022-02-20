import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int original = num;
        int number = 0;
        int reverse = 0;
        while(num!=0) {
            number = num%10;
            reverse = reverse*10+number;
            num = num/10;
        }
        if(original == reverse) {
            System.out.println("Number "+original+" is a Palindrome number");
        }
        else {
            System.out.println("Number "+original+" is not a Palindrome number");
        }

    }

}