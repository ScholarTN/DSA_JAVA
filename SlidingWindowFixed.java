public class SlidingWindowFixed {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 5};
        int k = 3;
        int sum = 0;

        // Calculate sum of first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];
            max = Math.max(max, sum);
        }

        System.out.println("Max sum of size " + k + " = " + max);
    }
}
