import java.util.Scanner;
public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Entered number: "+num);
        int count = 0;
        int temp = num;
        int last = num % 10;

        while(num >10) {
            count ++;
            num = num/10;
        }
        int first = num;

        num = temp;
        num = num/10;
        int p = (int)Math.pow(10, count-1);
        int middle = num % p;

        int x = first + middle *10+last * (int)Math.pow(10, count);
        System.out.println("Number After conversion: "+x);

    }

}