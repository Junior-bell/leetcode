public class SumOfDigits {
    
    public static int SumDigits(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int last=n%10;//return the last number of the given digit
            sum=sum+last;//add the element in sum
            n=n/10;  //reduce the number size

        }
        return sum;
    }
    public static void main(String[] args) {
        int m=365;
        System.out.println("the sum of the given number "+m+" is "+SumDigits(m));
    }
}
