import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnionOfArray {

    public static int[] findUnion(int arr1[], int n, int[] arr2, int m) {

        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        Integer lastAdded = null;

        while (i < n && j < m) {
            int val;
            if (arr1[i] < arr2[j]) {
                val = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                val = arr2[j++];
            } else {
                val = arr1[i];
                i++;
                j++;
            }
            if (lastAdded == null || lastAdded != val) {
                list.add(val);
                lastAdded = val;
            }
        }

        while (i < n) {
            if (lastAdded == null || lastAdded != arr1[i]) {
                list.add(arr1[i]);
                lastAdded = arr1[i];
            }
            i++;
        }

        while (j < m) {
            if (lastAdded == null || lastAdded != arr2[j]) {
                list.add(arr2[j]);
                lastAdded = arr2[j];
            }
            j++;
        }

        int[] ans = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            ans[k] = list.get(k);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Input");

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] union = findUnion(arr1, n, arr2, m);

        System.out.print("Union of these two Arrays: ");
        for (int data : union) {
            System.out.print(data + " ");
        }

        sc.close();
    }
}
