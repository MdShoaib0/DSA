import java.util.Scanner;

public class PrintOddNumber {

    public static void Solution(int num) {

        for (int i = 1; i <= num; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Solution(num);

        sc.close();
    }
}
