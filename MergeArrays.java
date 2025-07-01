import java.util.*;

public class MergeArrays{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter size of first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array (sorted):");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        
        System.out.print("Enter size of second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array (sorted):");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        scanner.close();
        int[] merged = mergeSortedArrays(arr1, arr2);

        
        System.out.println("Merged Array: " + Arrays.toString(merged));
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;
    }
}
