import java.util.Scanner;

public class SumOfDigits {

    public static int sumOfDigits(int n) {

        if (n < 10) {
            return n;
        }

        return (n % 10) + sumOfDigits(n / 10);

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you number to find sum of digits : ");

        int num = sc.nextInt();

        int ans = sumOfDigits(num);
        System.out.println("Sum of Digits of "+ num + " is : " + ans);

        sc.close();
    }
}
