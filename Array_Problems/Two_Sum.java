// import java.util.Arrays;

public class Two_Sum {

    public static int[] two_Sum(int[] arr, int n, int target) {

        int[] answer = new int[2];

        int start_Index = 0;
        int end_Index = n-1;

        while (start_Index < end_Index) {
            if (arr[start_Index] + arr[end_Index] == target) {
                answer[0] = start_Index;
                answer[1] = end_Index;
                return answer;
            }else if (start_Index + end_Index > target) {
                end_Index--;
            }else {
                start_Index++;
            }
        }

        return answer;
    } 

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n  = arr.length;
        int target = 11;

        int[] result = two_Sum(arr, n, target);

        for(int data : result) {
            System.out.print(data+" ");
        }
    }
}