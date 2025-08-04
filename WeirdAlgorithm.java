public class WeirdAlgorithm {
    
    public static int weird(int n){
    while(n!=1)
    {
        System.out.println(n+" ");
        if(n%2==0)
        n=n/2;
        else
        n=n*3+1;
    }
    return n;
}
    public static void main(String[] args) {
      
       int n=3;
        System.out.println(weird(n));
    }
}
