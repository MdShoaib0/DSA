import java.util.*;


class UniqueString{

      public static String solution(String str) {

            Set<Character> set = new HashSet<>();

            set.add(str.charAt(0));

            for(int i = 1; i < str.length(); i++) {

                  char ch = str.charAt(i);

                  if(set.contains(ch)) {
                        return "No";
                  }else {
                        set.add(ch);
                  }
            }

            return "Yes";

      }

      public static void main(String[] args) {

            String A = "muhaedsoib";

            String ans = solution(A);

            System.out.println(ans);
      }
        
 }