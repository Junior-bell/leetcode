
public class OddEven {

    public static boolean checkOddEven(int n)
    {

        int rem=n%2;
        if(rem==0)
        return true;
        else
        return false;
    }
public static void main(String [] args)
{
    int n=15;
    if(checkOddEven(n)==true)
    {
        System.out.println("the given number is Even");
    }
    else
    System.out.println("The Given number is Odd");
    
   checkOddEven(n);
}

}