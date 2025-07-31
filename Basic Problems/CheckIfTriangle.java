import java.util.Scanner;

public class CheckIfTriangle {
    Scanner sc=new Scanner(System.in);
    public static int check(int a,int b, int c)
    {
        if(a+b<=c||a+c<=b||b+c<=a)
        return 0;
        else
        return 1;
    }
    public static void main(String[] args) {
        CheckIfTriangle T=new CheckIfTriangle();
        int a=T.sc.nextInt();
        int b=T.sc.nextInt();
        int c=T.sc.nextInt();
        if(check(a, b, c)==1)
        System.out.println("valid");
        else
        System.out.println("invalid");


  }
}
