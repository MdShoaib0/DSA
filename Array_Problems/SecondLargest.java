public class SecondLargest {

    public static int findSecondLargest(int[] arr, int n) {

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else {
                if (arr[i] > secondLargest && arr[i] != largest) {
                    secondLargest = arr[i];
                }
            }
        }

        return secondLargest;

    }

    public static void main(String[] args) {

        int[] arr = { 12, 35, 1, 10, 34, 1 };
        int n = arr.length;

        int ans = findSecondLargest(arr, n);
        System.out.println(ans);

    }
}