public class multiplication{

public static void multiply(int n)
{
    for(int i=1;i<=10;++i)
    {
        System.out.println(n+" * "+i+" = "+n*i);
    }
}

public static void main(String [] args)
{
    multiplication ml=new multiplication();
 int n=6;
     ml.multiply(n);
}

}