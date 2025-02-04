import java.util.*;

public class Leader_Array {

    static ArrayList<Integer> leaders(int arr[]) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        int maximum = arr[arr.length-1];
        result.add(maximum);
        
        for(int i = arr.length-2; i >= 0; i--) {
            if(arr[i] >= maximum) {
                result.add(0,arr[i]);
                maximum = arr[i];
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        int[] arr = {16,17,4,3,5,2};
        
        ArrayList<Integer> ans = leaders(arr);

        System.out.println(ans);
        
    }
}
