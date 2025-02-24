public class Most_Repating {
    public static char getMaxOccuringChar(String s) {
        // Your code here
        int[] arr = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        
        int count = 0;
        char ch = 'a';
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > count) {
                count = arr[i];
                ch = (char)('a'+ i);
            }
        }
        return ch;
    }

    public static void main(String[] args) {
        String str = "mangoold";

        char ans = getMaxOccuringChar(str);
        System.out.println(ans);
    }
}
