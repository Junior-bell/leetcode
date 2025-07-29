public class NthTermArithmetic {
    
    public static int NthTerm(int a1,int a2,int n)
    {
        return (n*(n-1)*(a2-a1));//using the formula of arithmetic progression

    }
    public static void main(String [] args)
{
    int a1=2,a2=3,n=4;
    System.out.println(NthTerm(a1,a2,n));
}
}
