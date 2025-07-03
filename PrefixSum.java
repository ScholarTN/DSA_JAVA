public class PrefixSum 
{
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int[] prefix = new int[arr.length];
        
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        
        int sum = prefix[3] - prefix[0];
        System.out.println("Sum (index 1 to 3): " + sum);
    }
}
