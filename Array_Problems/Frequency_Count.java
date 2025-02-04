import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Frequency_Count {

    public static List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        List<Integer> result = new ArrayList<Integer> ();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(int i = 1; i <= arr.length; i++) {
            
            if(map.get(i) == null) {
                result.add(0);
            }else {
                result.add(map.get(i));
            }
        }
        
        return result;
        
    }

    public static void main(String[] args) {
        
        int[] arr = {2, 3, 2, 3, 5};

        List<Integer> ans = frequencyCount(arr);

        System.out.println(ans);
    }
}
