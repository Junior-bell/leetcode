class Solution {
    public boolean isPalindrome(int x) {
        if(x <0 || (x%10==0 & x!=0)) return false;
        int reversed=0;
        while(x>reversed)
        {
            int number=x%10;
            reversed=reversed*10+number;
            x=x/10;
        }
        return (x == reversed || x == reversed / 10);
    }
}