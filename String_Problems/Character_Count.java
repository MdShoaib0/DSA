import java.util.*;

public class Character_Count {

    public static HashMap<Character,Integer> characterCount(String str, int n) {

        HashMap <Character,Integer> map = new HashMap<>();
        

        for(char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        return map;

    }

    public static void main(String[] args) {
        
        String str = "asirgufaosidhg";
        int n = str.length();

        HashMap<Character,Integer> result = characterCount(str,n);
        System.out.println(result);
    }
}