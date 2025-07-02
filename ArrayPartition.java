import java.util.Arrays;

public class ArrayPartition{
    public int ArrayPairSum(int[] nums)
    {
//sort the array first
        Arrays.sort(nums);

//initialize the sum as we have to return the sum of min pairs
    int sum=0;
    for(int i=0;i<nums.length;i+=2)
    {
        //add the first element of each pair to the sum
        sum+=nums[i];

    }
         // return the sum 
         return sum;
    }

    public static void main(String[] args) {
        ArrayPartition ap = new ArrayPartition();
        int [] nums ={ 1,5,8,7,3,2,6,4};
        int result=ap.ArrayPairSum(nums);
        System.out.println("The sum of the minimums of the pairs is:= "+result);
        
    }
}