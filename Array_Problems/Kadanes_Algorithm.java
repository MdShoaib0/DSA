public class Kadanes_Algorithm {

    public static int maxSubarraySum(int[] arr) {
        // Your code here
        int max = 0;
        int result = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], (arr[i]+max));
            result = Math.max(result,max);
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        int[] arr = {2, 3, -8, 7, -1, 2, 3};

        int ans = maxSubarraySum(arr);
        System.out.println(ans);
    }
    
}