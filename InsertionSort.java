import java.util.Scanner;

public class InsertionSort 
{
    public static void insertionSort(int[] arr)
    {
        int n = arr.length;
        for(int i=1;i<n;i++)
        {
            int current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>current)
            {
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=current;
        }
    }
    public static void main(String[] arg)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements: ");
    int n = sc.nextInt();
    int[] arr= new int[n];

    System.out.println("Enter the Elements: ");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }

    insertionSort(arr);
    System.out.println("Sorted Array: ");
    for(int num:arr)
    {
        
        System.out.print(num+" ");

    }
    System.out.println();
    sc.close();
}

}


