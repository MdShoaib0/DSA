import java.util.Scanner;

public class VowelVerify {

    public static int Solution(String str) {

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowelCheck(ch)) {
                result++;
            }
        }
        return result;
    }

    public static boolean vowelCheck(char ch) {

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
        || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int ans = Solution(str);
        System.out.println(ans);

        sc.close();
    }
}
