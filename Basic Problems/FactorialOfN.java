public class FactorialOfN {
    
    public static int factorial(int n)
    {
       int res=1;
       for(int i=2;i<=n;i++)
       {
        res*=i;//i.e res=res+i; add factorial such as 5!=5*4*3*2*1=120
       }
       return res;
    }
    public static void main(String[] args) {
        int res=6;
        System.out.println("factorial of the given number is = "+factorial(res));
    }

}
