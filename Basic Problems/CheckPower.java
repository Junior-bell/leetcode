public class CheckPower {
    //program to check if the given 2 number is any given number is the power of other number
    public static boolean checkpower(int n, int y)
    {
        if(n==1)
        return y==1;
        int pow=1;
        while(pow<n)
        pow*=n;//pow=pow*n;
        return (pow==n);
    }
    public static void main(String[] args) {
        System.out.println(checkpower(1, 10));
        System.out.println(checkpower(1, 20));
        System.out.println(checkpower(10, 100));
    }
}
