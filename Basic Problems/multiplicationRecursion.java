public class multiplicationRecursion {
    
    public static void multiply(int n, Integer...var)
    {
       int i=1;
       if(var.length!=0)
       {
        i=var[0];
       }
       if(i==11)
       return;

       System.out.println(n+ " * "+i+" = "+n*i);
       i++;
       multiply(n, i);
    }
    public static void main(String [] args)
    {
        int n=5;
        multiply(n);
    }
}
