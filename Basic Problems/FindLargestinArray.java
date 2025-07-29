public class FindLargestinArray {

    public static int findLargest(int arr[])
    {
      if(arr==null ||arr.length==0)//if the array is null or empty return illegal argument exception
      {
    throw new IllegalArgumentException("array cannot be null or empty"); 
      }
    int max=arr[0];//initialize array at the first element 
    for(int i=0;i<arr.length;i++)//brute force approach loop through each elements
    {
        if(arr[i]>max)//check if current element is greater than first element
        {
            max=arr[i];//if current element is greater than first element then store the value in max
        }

    }
    return max;
}
    public static void main(String[] args) {
            int arr[]={5,9,2,7,11,5,8};
            System.out.println(findLargest(arr));
    }
}
