public class GCD {
    
    public static int min(int a,int b)
    {
    int result=Math.min(a, b);//take smallest from two numbers are result
    while(result>0)
    {
        if(a%result==0&&b%result==0)//check if any number generates carry or not
        {
            break;
        }
        result--;
    }
    return result; 
    }
    public static void main(String[] args) {
        int a=20,b= 28;
        System.out.println("The greatest common divisor of two given number is " +min(a, b));
    }
}
