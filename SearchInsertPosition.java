class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
      //arrays are sorted so we need to use binary search to search efficiently
      int left=0; int right=nums.length-1;

      while(left<=right)//start from left to right 
      {
        //find the middle index to avoid the brute force and overflowing
        int mid=left+(right-left)/2;
        //check if the middle element in the target element or not and return 
        if(nums[mid]==target)
        return  mid;
        // check if the target is greater than mid ?
        else if(nums[mid]<target)
        left= mid+1;
        else //else return mid-1;
        right= mid - 1;
      } 

      //if the target is not found, return the insert position 
      return left; 

    }

    public static void main(String[] args) {
        SearchInsertPosition solution = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int result = solution.searchInsert(nums, target);
        System.out.println("Insert position: " + result); // Output: 2

        target = 2;
        result = solution.searchInsert(nums, target);
        System.out.println("Insert position: " + result); // Output: 1

        target = 7;
        result = solution.searchInsert(nums, target);
        System.out.println("Insert position: " + result); // Output: 4

        target = 0;
        result = solution.searchInsert(nums, target);
        System.out.println("Insert position: " + result); // Output: 0
    }
}