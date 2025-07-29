public class NthTerm {
    
    public static int difference(int a1,int a2,int n)
    {

          int NthTerm=a1,d=a2-a1;
          for(int i=1;i<n;i++)
          {
            NthTerm+=d;
          }
          return NthTerm;

    }
    public static void main(String[] args) {
        int a1=2,a2=5,n=5;
        System.out.println(difference(a1, a2, n));
    }
}
