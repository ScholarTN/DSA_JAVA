import java.util.*;
public class BubbleSort 
{
    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            int count=0;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    count++;
                }
            }
            if(count==0)break;
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

    bubbleSort(arr);
    System.out.println("Sorted Array: ");
    for(int num:arr)
    {
        
        System.out.print(num+" ");

    }
    System.out.println();
    sc.close();
}

}
