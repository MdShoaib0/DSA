public class Range_of_evenOrOdd {

    public static int maxEvenOdd(int arr[], int n)
    {
        // your code here
        int range = 1;
        int result = 0;
        
        for(int i = 1; i < n; i++) {
            if(arr[i-1] % 2 == 0 && arr[i] % 2 != 0) {
                range++;
            }else if(arr[i-1] % 2 != 0 && arr[i] % 2 == 0) {
                range++;
            }else  {
                result = Math.max(result, range);
                range = 1;
            }
        }
        
        result = Math.max(result, range);
        
        return result;
        
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,8,8,9};
        int n = arr.length;

        int result = maxEvenOdd(arr, n);
        System.out.println(result);
    }
}
