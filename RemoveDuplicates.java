public class RemoveDuplicates {
    public int removeDuplicates(int [] nums)
    {
        if(nums.length==0) return 0;

        int uniquePointer=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[uniquePointer])
            {
                uniquePointer++;
                nums[uniquePointer]=nums[i];
            }
            

        }
        return uniquePointer=1;
        }
        public static void main(String[] args) {
            RemoveDuplicates solution=new RemoveDuplicates();
            int [] nums={1, 1, 2, 2, 3, 4, 4, 5};
            int newLength=solution.removeDuplicates(nums);
            System.out.println("New length of the array after removing duplicates: " + newLength);
            System.out.print("Array after removing duplicates: ");

        }
    }