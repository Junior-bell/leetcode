import java.util.Scanner;

public class LCMthroughHCF {
    
    public static int cal(int a, int b)
    {
        if(a==0)
        return b;
        if(b==0)
        return a;

        if(a>b)
        {
            if(a%b==0)
            return b;
            return cal(a-b, b);
        }
        if(b%a==0)
        {
            return a;
        }
            return cal(a,b-a);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("Please enter first number");
        int a=sc.nextInt();
        System.out.println("Please enter second number");
        int b=sc.nextInt();
        System.out.println("The HCF of two number is "+cal(a, b));
        int LCM=(a*b)/cal(a, b);//LCM=(product of two number)/(HCF of two given numbers)
        System.out.println("The LCM of two given number is "+LCM);
        sc.close();
    }
}
