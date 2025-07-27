
public class SquareNatural {
    
    int sum=0;
    public int summation(int n)
    {
        for(int i=0;i<=n;i++)
        {
            sum+=i*i;
        }
        return sum;
    }


    public static void main(String args [])
    {
        int sum=2;
        SquareNatural square=new SquareNatural();
        System.out.println(square.summation(sum));
    }
}
