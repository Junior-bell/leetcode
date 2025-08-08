public class PerfectNum{

    

    public static boolean Perfect(int n)
    {
        int sum=1;
    for(int i=2;i*i<=n;i++)
    {
        if(n%i==0)
        {
            if(i*i!=n)
            {
                sum=sum+i+n/i;//add complement of i that is n/i to check if the sum=n;
            }
            else
            {
                sum=sum+i;
            }

            
        }
       
    }
     return sum==n&&n!=1;
}
public static void main(String[] args) {
    
    int n=28;
    if(Perfect(n))
    {
      System.out.println("the given number "+ n+" is a perfect number ");
    }
    else
    System.out.println("The given number "+n+" is not a perfect number ");
   


}

}