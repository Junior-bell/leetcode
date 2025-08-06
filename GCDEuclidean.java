public class GCDEuclidean {
    
    public static int GCD(int a,int b)
    {
        if(a==0)
        return b;
        if(b==0)
        return a;
       
        if(a>b)
        return GCD(a-b,b);
        return GCD(a,b-a);
    }
    public static void main(String[] args) {
        int a=20,b=28;
        System.out.println("GCD of the two given number is  "+GCD(a,b));
    }
}
