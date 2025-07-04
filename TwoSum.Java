import  java.util.HashMap;
import java.util.Map;
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> numMap=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int complement=target-nums[i];
            if(numMap.containsKey(complement))
            {
                return  new int[]{numMap.get(complement),i};
            }
            
            numMap.put(nums[i],i);
        }

        //or else return
        throw new IllegalArgumentException("number not found");
        
    }
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);
        System.out.println("Indices of the two numbers that add up to " + target + " are: [" + result[0] + ", " + result[1] + "]");
    }
}