import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                k++;
                list.add(nums[i]);
            }
        }

        int j = 0;
        for(int data : list) {
            nums[j++] = data;
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();

        int newLength = removeElement(nums, val);

        System.out.println("Array after removing value " + val + ":");
        for(int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\nNew length of array: " + newLength);
    }
}