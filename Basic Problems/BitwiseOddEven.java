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
    
       int n=15;
        if(checkOddEven(n)==true)
        {
          System.out.println("The given number is Odd");
        }
        else
        System.out.println("false");
    }
}
/*here is 15 in binary 1111 after anding it with 0001 = 0001 which is 1 if the given number is even then it will give 0000  
it gives either true or false then we can deduce whether the number is odd or even.*/