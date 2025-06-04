package Sorting;

import java.util.Scanner;
import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while(j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of nums1 (m + n): ");
        int size1 = sc.nextInt();

        int[] nums1 = new int[size1];

        System.out.print("Enter number of initialized elements in nums1 (m): ");
        int m = sc.nextInt();

        for(int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        for(int i = m; i < size1; i++) {
            nums1[i] = 0;
        }

        System.out.print("Enter size of nums2 (n): ");
        int n = sc.nextInt();

        int[] nums2 = new int[n];
        for(int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}
