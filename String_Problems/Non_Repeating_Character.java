import java.util.HashMap;
import java.util.Map;

public class Non_Repeating_Character {
    
    // method 1

    // static char nonRepeatingChar(String s) {
       
    //     int[] count = new int[26];
        
    //     for(int i = 0; i < s.length(); i++) {
    //         count[s.charAt(i)-'a']++;
    //     }
        
    //     for(int i = 0; i < s.length(); i++) {
    //         if(count[s.charAt(i)-'a'] == 1) {
    //             return s.charAt(i);
    //         }
    //     }

    //     return '$';
    // }

    // method 2

    static char nonRepeatingChar(String s) {
        Map <Character,Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.get(ch) == 1) {
                return ch;
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        String str = "aassffgg";
        char ans = nonRepeatingChar(str);
        System.out.println(ans);
    }
}
