public class Rotate_Array {

    public static void rotateArr(int arr[], int d) {

        if(d == 0) {
            return;
        }
        
        d = d % arr.length;
        
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
        
        
    }
    
    public static void reverse(int arr[], int s, int e) {
        
        while(s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}