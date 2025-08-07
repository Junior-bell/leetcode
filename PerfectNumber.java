
//program to find the perfect number 
public class PerfectNumber {

    public static boolean perfect(int a)
    {
        int sum=0;
         for(int i=1;i<=a/2;i++)
         {
            if(a%i==0){ 
            System.out.print(i+" ");
             sum+=i;
            }
         }
        System.out.println();
    return sum==a;     //is sum and the given numbers are the same? yes or no?
    }
    
    public static void main(String[] args) {
        int a=28;
        if(perfect(a))
        System.out.println("The given number " +a+" is a perfect number ");
        else
        System.out.println("The given number " +a+" is not a perfect Number ");
    }
    
}
