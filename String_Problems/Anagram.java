public class Anagram {

    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        if(s1.length() != s2.length()) {
            return false;
        }
        int[] count = new int[26];
        
        for(int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        
        for(int i = 0; i < count.length; i++) {
            if(count[i] != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "hello";
        String str2 = "alloh";

        boolean ans = areAnagrams(str, str2); 
        System.out.println(ans);
    }
}