public class PluseOne {
    
    public int[] pluseone(int[] digits)
    {
        for(int i=digits.length-1;i>0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
             digits[i]=0;
        }
        int[] newNumber= new int[digits.length+1];
        newNumber[0]=1;
        return newNumber;
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
