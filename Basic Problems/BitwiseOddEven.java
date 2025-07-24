public class BitwiseOddEven {
    
public static boolean checkOddEven(int n)
{
    if((n&1)==0)
    {

     return true;
    }
    else
    return false;
}

    public static void main(String [] args)
    {
        BitwiseOddEven aboj=new BitwiseOddEven();
       int n=15;
        if(checkOddEven(n)==true)
        {
          System.out.println("The given number is Odd");
        }
        else
        System.out.println("false");
    }
}
