public class DiceProblem {
    
     public static int OppositeOf(int n)
     {
        int ans=7-n;// the some of opposite of dice faces is equal to 7
         return ans;
     }

     public static void main(String[] args) {
        int n=2;
        System.out.println("opposite of dice face "+n+" is "+OppositeOf(n));
     }
}
