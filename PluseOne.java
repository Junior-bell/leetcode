
//leetcode's plus one problem
public class PluseOne {
    
    public int[] pluseone(int[] digits)
    {
        //we have to loop through array to add a number in the end
        for(int i=digits.length-1;i>0;i--)//start the loop from end of the loop
        {
            if(digits[i]<9)//if the array number is smaller than 9
            {
                digits[i]++;  //increase the numnber count 
                return digits; //and return 
            }
             digits[i]=0;//if the number is 9 then return 0 instead of 9 
        }
        int[] newNumber= new int[digits.length+1];//create a newNumber array
        newNumber[0]=1;//put 1 as the first element 
        return newNumber;//return the array.
    }
    public static void main(String[] args) {
        PluseOne solution = new PluseOne();
        int[] digits = {9, 9, 9}; // Example test case
        int[] result = solution.pluseone(digits);
        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
