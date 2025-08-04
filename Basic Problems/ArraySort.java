import java.util.Arrays;

public class ArraySort {
    
public static void main(String[] args) {
    int arr[] = new int[]{1,5,9,6,8,11,15,17};
    Arrays.sort(arr);
    int max=0;
    int min=Integer.MAX_VALUE;
    for(int i=arr.length-1; i>=0; i--)
    {
        if(arr[i] > max) {
            max = arr[i];
        }
        else if(arr[i]<min)
           min=arr[i];
    }

    
    System.out.println(Arrays.toString(arr));
    System.out.println("The Largest element in the array is "+max);
    System.out.println("The smallest number in the array is "+min);
    
}
}
