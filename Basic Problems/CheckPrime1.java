import java.util.Scanner;

public class CheckPrime1 {
    
    Scanner sc=new Scanner(System.in);
    public static boolean checkprime(int n)
    {
        if(n<=1)
        return false;

        for(int i=2;i*1<n;i++)
{
       if(n%i==0)
       return false;
       
}
        return true;
    }
    public static void main(String[] args) {
        CheckPrime1 ch=new CheckPrime1();
        int n=ch.sc.nextInt();
        System.out.println(checkprime(n));

    }
}
